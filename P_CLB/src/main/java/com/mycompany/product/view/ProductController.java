package com.mycompany.product.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.product.ProductSearchVO;
import com.mycompany.product.ProductService;
import com.mycompany.product.ProductVO;

@Controller
@SessionAttributes("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/getProductList")
	public String getBoardList(ProductSearchVO vo, HttpServletRequest request) {
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
	public String updateBoard(@ModelAttribute("product") ProductVO vo) {
		System.out.println(vo);
		productService.productUpdate(vo);
		return "redirect:/getProductList";
	}

	// 등록처리
	@RequestMapping(value = "/productInsert", method = RequestMethod.POST)
	public String insertBoard(@ModelAttribute("product") ProductVO vo) {
		System.out.println(vo);
		// 서비스이용하여 등록처리하고 목록페이지로 이동
		productService.productInsert(vo);
		return "product/getProduct";
	}

	@RequestMapping("/getProduct/{p_no}")
	public String getBoard(@PathVariable String p_no, Model model) {
		model.addAttribute("product", productService.getProduct(p_no));
		return "product/getProduct";
	}
}
