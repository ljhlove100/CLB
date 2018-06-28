package com.mycompany.myapp.product_comments.view;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.Paging;
import com.mycompany.myapp.product_comments.Product_commentsSearchVO;
import com.mycompany.myapp.product_comments.Product_commentsService;
import com.mycompany.myapp.product_comments.Product_commentsVO;

@Controller
@SessionAttributes("product_comments")
public class Product_commentsController {

	@Autowired
	Product_commentsService product_commentsService;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String,String> conditionMap = new HashMap<String,String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	@RequestMapping("/getProduct_commentsList")
	public ModelAndView getProduct_commentsList(Product_commentsSearchVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView();
		
		//페이지 번호 파라미터
		if(paging.getPage() == null)
			paging.setPage(1);
		
		//페이징을 하기위한 first, last 검색조건을 담는다
		//paga 1 이면 1 ~ 10, page 2 이면 11 ~ 20
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		
		//전체건수
		paging.setTotalRecord(product_commentsService.getCount(vo));
		
		//결과를 모델에 저장
		mv.addObject("paging", paging);
		mv.addObject("product_commentsList", product_commentsService.getProduct_commentsList(vo));
		
		//뷰페이지 지정
		mv.setViewName("product_comments/getProduct_commentsList");
		return mv;
	}
	
	//수정폼
	@RequestMapping(value="/updateProduct_comments", method=RequestMethod.GET)
	public String updateProduct_commentsForm() {
		return "product/product_comments/updateProduct_comments";
	}
	
	//수정처리
	@RequestMapping(value="/updateProduct_comments", method=RequestMethod.POST)
	public String updateProduct_comments(@ModelAttribute("product_comments") Product_commentsVO vo) {
		System.out.println(vo);
		//서비스 수정 처리
		//product_commentsService.updateProduct_comments(vo);
		return "product/product_comments/getProduct_comments";
	}
	
	//등록폼
	@RequestMapping(value="/insertProduct_comments", method=RequestMethod.GET)
	public String insertProduct_commentsForm() {
		return "product/product_comments/insertProduct_comments";
	}	
	//등록처리
	@RequestMapping(value="/insertProduct_comments", method=RequestMethod.POST)
	public String insertProduct_comments(@ModelAttribute("vo") Product_commentsVO vo, HttpServletRequest request) 
		throws IllegalStateException, IOException {
		//model.addAttrribute("product_commentsVO",vo)
		//첨부 파일 처리(서버 업로드 위치로 파일을 업로드)
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile file = multipartRequest.getFile("tempuploadfile");
		
		if(!file.isEmpty() && file.getSize() >0) {
			String filename = file.getOriginalFilename();
			file.transferTo(new File("d:/clb_upload", filename));
			vo.setUploadfile(filename);
		}
		
		//서비스 이용하여 등록처리하고 목록페이지로 이동
		product_commentsService.insertProduct_comments(vo);
		System.out.println(vo);
		//return "redirect:/getProduct_commentsList";
		return "product_comments/getProduct_comments";
	}
	
/*	@RequestMapping("/getProduct_comments")
	public String getProduct_comments(@RequestParam(value="s", required=false, defaultValue="1") String pc_no, Model model) {
		System.out.println("pc_no:" + pc_no);
		model.addAttribute("product_comments", product_commentsService.getProduct_comments(pc_no));
		return "product_comments/getProduct_comments";
	}*/
	
	@RequestMapping("/getProduct_comments/{pc_no}")
	public String getBoard(@PathVariable String pc_no,  Model model) {
		System.out.println("pc_no:" + pc_no);
		model.addAttribute("product_comments", product_commentsService.getProduct_comments(pc_no));
		return "product_comments/getProduct_comments";
	}
	
	@RequestMapping("/downloadProduct_comments")
	public void downloadBoard(@RequestParam String pc_no, HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		Product_commentsVO vo = product_commentsService.getProduct_comments(pc_no);
		String filename = vo.getUploadfile();
		File uFile = new File("d:/clb_upload", filename);
		long fSize = uFile.length();
		if (fSize > 0) {
			String mimetype = "application/x-msdownload";
			response.setContentType(mimetype);
			// response.setHeader("Content-Disposition", "attachment;
			// filename=\"" + URLEncoder.encode(fvo.getOrignlFileNm(), "utf-8") + "\"");
			setDisposition(filename, request, response);
			BufferedInputStream in = null;
			BufferedOutputStream out = null;
			try {
				in = new BufferedInputStream(new FileInputStream(uFile));
				out = new BufferedOutputStream(response.getOutputStream());
				// FileCopyUtils.copy(in, out);
				int temp;
				while ((temp = in.read()) != -1) {
					out.write(temp);
				}
				out.flush();
			} catch (IOException ex) {
			} finally {
				in.close();
				response.getOutputStream().flush();
				response.getOutputStream().close();
			}
		} else {
			response.setContentType("application/x-msdownload");
			PrintWriter printwriter = response.getWriter();
			printwriter.println("<html>");
			printwriter.println("<h2>Could not get file name:<br>" + filename + "</h2>");
			printwriter.println("<center><h3><a href='javascript: history.go(-1)'>Back</a></h3></center>");
			printwriter.println("&copy; webAccess");
			printwriter.println("</html>");
			printwriter.flush();
			printwriter.close();
		}
	}

	private String getBrowser(HttpServletRequest request) {
		String header = request.getHeader("User-Agent");
		if (header.indexOf("MSIE") > -1) {
			return "MSIE";
		} else if (header.indexOf("Trident") > -1) { // IE11 문자열 깨짐 방지
			return "Trident";
		} else if (header.indexOf("Chrome") > -1) {
			return "Chrome";
		} else if (header.indexOf("Opera") > -1) {
			return "Opera";
		}
		return "Firefox";
	}

	/**
	 * Disposition 지정하기.
	 *
	 * @param filename
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	private void setDisposition(String filename, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String browser = getBrowser(request);
		String dispositionPrefix = "attachment; filename=";
		String encodedFilename = null;
		if (browser.equals("MSIE")) {
			encodedFilename = URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20");
		} else if (browser.equals("Trident")) { // IE11 문자열 깨짐 방지
			encodedFilename = URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20");
		} else if (browser.equals("Firefox")) {
			encodedFilename = "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
		} else if (browser.equals("Opera")) {
			encodedFilename = "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
		} else if (browser.equals("Chrome")) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < filename.length(); i++) {
				char c = filename.charAt(i);
				if (c > '~') {
					sb.append(URLEncoder.encode("" + c, "UTF-8"));
				} else {
					sb.append(c);
				}
			}
			encodedFilename = sb.toString();
		} else {
			throw new IOException("Not supported browser");
		}
		response.setHeader("Content-Disposition", dispositionPrefix + encodedFilename);
		if ("Opera".equals(browser)) {
			response.setContentType("application/octet-stream;charset=UTF-8");
		}
	}
}
