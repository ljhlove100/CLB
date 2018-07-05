package com.mycompany.myapp.product.view;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.product.ProductSearchVO;
import com.mycompany.myapp.product.ProductService;
import com.mycompany.myapp.product.ProductVO;

@Controller
//@SessionAttributes("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value= "/getProductList", method = RequestMethod.GET)
	public String getBoardList(ProductVO vo, HttpServletRequest request) {
		request.setAttribute("productList", productService.getProductList(vo));
		return "product/getProductList";
	}

	// 등록폼
	@RequestMapping(value = "/productInsert", method = RequestMethod.GET)
	public String productInsertForm() {
		return "product/productInsert";	
	}

	// 수정폼
	@RequestMapping(value = "/productUpdate", method = RequestMethod.GET)
	public String productUpdateForm(Model model, ProductVO vo) {
		model.addAttribute("product",productService.getProduct(Integer.toString(vo.getpNo())));
		return "product/productUpdate";
	}

	// 수정처리
	@RequestMapping(value = "/productUpdate", method = RequestMethod.POST)
	public String productUpdate(@ModelAttribute("product") ProductVO vo) {
		productService.productUpdate(vo);
		return "redirect:/getProductList";
	}

	// 등록처리
	@RequestMapping(value = "/productInsert", method = RequestMethod.POST)
	public String insertBoard(@ModelAttribute("product") ProductVO vo, HttpServletRequest request) 
			throws IllegalStateException, IOException{
		
		  // MultipartFile file =vo.getTempuploadfile();
	      MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	      MultipartFile file = multipartRequest.getFile("tempuploadfile");

	      if (!file.isEmpty() && file.getSize() > 0) {
	         String filename = file.getOriginalFilename();
	         file.transferTo(new File("d:/upload", filename));
	         vo.setImage("<img src='/clb/resources/images/"+filename+"'>");
	      }
		// 서비스이용하여 등록처리하고 목록페이지로 이동
		productService.productInsert(vo);
		return "product/getProductList";
	}

	@RequestMapping("/getProduct/{p_no}")
	public String getBoard(@PathVariable String p_no, Model model) {
		model.addAttribute("product", productService.getProduct(p_no));
		return "product/getProduct";
	}
	
	//
	
}
