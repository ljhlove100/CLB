package com.mycompany.myapp.product.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myapp.product.ProductSearchVO;
import com.mycompany.myapp.product.ProductService;
import com.mycompany.myapp.product.ProductVO;

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
		if(p_no.equals("1")) {
	         return "product/detail/metalPframe";
	      } else if(p_no.equals("2")) {
	    	 return "product/detail/woodPframe";
	      } else if(p_no.equals("3")) {
		     return "product/detail/woodPframe";
		  } else if(p_no.equals("4")) {
			 return "product/detail/kakaoPB";
		  } else if(p_no.equals("5")) {
			 return "product/detail/facePB";
		  } else if(p_no.equals("6")) {
			 return "product/detail/instarPB";
		  } else if(p_no.equals("7")) {
			 return "product/detail/myPB";
		  } else if(p_no.equals("8")) {
			 return "product/detail/marblePframe";
		  } else if(p_no.equals("9")) {
			 return "product/detail/acrPframe";
		  } else if(p_no.equals("10")) {
			 return "product/detail/basicBanner";
		  } else if(p_no.equals("11")) {
			 return "product/detail/woodBanner";
		  } else if(p_no.equals("12")) {
			 return "product/detail/bigBanner";
		  } else if(p_no.equals("13")) {
			 return "product/detail/banBcard";
		  } else if(p_no.equals("14")) {
			 return "product/detail/snowBcard";
		  } else if(p_no.equals("15")) {
			 return "product/detail/dojangBcard";
		  }
		
		return "product/getProduct";
	}
}
