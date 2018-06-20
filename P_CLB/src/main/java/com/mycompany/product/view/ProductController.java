package com.mycompany.product.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.products.ProductSearchVO;
import com.mycompany.products.ProductService;
import com.mycompany.products.ProductVO;

@Controller
public class ProductController {

	@Autowired ProductService productService;
	
	
	@RequestMapping("/getProductList")
	   public String getBoardList(HttpServletRequest request,ProductSearchVO vo) {
	      request.setAttribute("boardList", productService.getProductList(vo));
	      return "product/getProductList";
	   }
	
	//등록폼
	@RequestMapping(value="/productInsert",method=RequestMethod.GET)
	   public String productInsertForm() {
	      return "product/productInsert";
	   }
	
	//수정폼
    @RequestMapping(value="/productUpdate",method=RequestMethod.GET)
    public String productUpdateForm() {
       return "product/productUpdate";
    }
    
  //수정처리   
    @RequestMapping(value="/productUpdate",method=RequestMethod.POST)
    public String updateBoard(@ModelAttribute("product") ProductVO vo) {
       System.out.println(vo);
       productService.productUpdate(vo);
       return "product/productUpdate";
    }
    
  //등록처리
    @RequestMapping(value="/productInsert",method=RequestMethod.POST)
    public String insertBoard(@ModelAttribute("vo") ProductVO vo) {
       System.out.println(vo);
       //서비스이용하여 등록처리하고 목록페이지로 이동
       productService.productInsert(vo);
       return "product/getProduct";
    }
    
    @RequestMapping("/getProduct/{p_no}")
    public String getBoard(@PathVariable String p_no, Model model) {
       System.out.println("p_no: "+ p_no);
       model.addAttribute("board",productService.getProduct(p_no));
       return "product/getProduct";
    }
}
