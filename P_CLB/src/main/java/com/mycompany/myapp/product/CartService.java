package com.mycompany.myapp.product;

import java.util.List;

public interface CartService {

	//1. 장바구니 추가
	public void insertCart(CartVO vo);
	
	//2. 장바구니 목록
	public List<CartVO> listCart(CartVO vo);
	
	//삭제
	public void cartDelete(String cartId);
	
	public void cartDelete2(String uId);
}

