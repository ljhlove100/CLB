package com.mycompany.myapp.product.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.payment.PaymentVO;
import com.mycompany.myapp.product.CartService;
import com.mycompany.myapp.product.CartVO;
import com.mycompany.myapp.users.UsersVO;

@Controller

public class CartController {
	@Autowired
	CartService cartService;

	@RequestMapping(value= "/listCart", method = RequestMethod.GET)
	public String listCart(CartVO vo, HttpServletRequest request) {
		request.setAttribute("cartList", cartService.listCart(vo));
		return "cart/listCart";
	}
	
	// 등록폼
		@RequestMapping(value = "/insertCart", method = RequestMethod.GET)
		public String insertCartForm() {
			return "cart/insertCart";	
		}
		
	// 등록처리
	@RequestMapping(value = "/insertCart", method = RequestMethod.POST)
	public String insertCart(@ModelAttribute("cart") CartVO vo, HttpServletRequest request) {
		vo.setuId(((UsersVO) (request.getSession().getAttribute("u_id"))).getuId());
		cartService.insertCart(vo);
		request.setAttribute("cartList", cartService.listCart(vo));
		return "cart/listCart";
	}
	
	//장바구니 삭제
	@RequestMapping(value="/cartDelete", method = RequestMethod.GET)
	public String cartDelete(@RequestParam(value="cartId") String cartId, HttpServletRequest request, CartVO vo) {
		vo.setuId(((UsersVO) (request.getSession().getAttribute("u_id"))).getuId());
		cartService.cartDelete(cartId);
		request.setAttribute("cartList", cartService.listCart(vo));
		return "cart/listCart";
	}
	
	//결제 후 장바구니 비우기
			@RequestMapping(value="/cartDelete2", method = RequestMethod.GET)
			public String cartDelete2(@RequestParam(value="uId") String uId, HttpServletRequest request, CartVO vo) {
				vo.setuId(((UsersVO) (request.getSession().getAttribute("u_id"))).getuId());
				cartService.cartDelete2(vo.getuId());
				request.setAttribute("cartList", cartService.listCart(vo));
				return "redirect:/getProductList";
			}
}
