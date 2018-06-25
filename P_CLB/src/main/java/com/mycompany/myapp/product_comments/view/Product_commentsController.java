package com.mycompany.myapp.product_comments.view;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String getProduct_commentsList(HttpServletRequest request, Product_commentsVO vo) {
		request.setAttribute("product_commentsList", product_commentsService.getProduct_commentsList());
		return "product_comments/getProduct_commentsList";
	}
	
	//수정폼
	@RequestMapping(value="/updateProduct_comments", method=RequestMethod.GET)
	public String updateProduct_commentsForm() {
		return "product_comments/updateProduct_comments";
	}
	
	//수정처리
	@RequestMapping(value="/updateProduct_comments", method=RequestMethod.POST)
	public String updateProduct_comments(@ModelAttribute("product_comments") Product_commentsVO vo) {
		System.out.println(vo);
		//서비스 수정 처리
		//product_commentsService.updateProduct_comments(vo);
		return "product_comments/getProduct_comments";
	}
	
	//등록폼
	@RequestMapping(value="/insertProduct_comments", method=RequestMethod.GET)
	public String insertProduct_commentsForm() {
		return "product_comments/insertProduct_comments";
	}	
	//등록처리
	@RequestMapping(value="/insertProduct_comments", method=RequestMethod.POST)
	public String insertProduct_comments(@ModelAttribute("vo") Product_commentsVO vo) {
		//model.addAttrribute("product_commentsVO",vo)
		
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
}
