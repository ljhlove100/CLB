package com.mycompany.myapp.product;

import java.util.List;
import java.util.Map;

public interface CartService {

	//장바구니 목록조회
	public List<Map<String, Object>> getCartList();
	
	public List<CartVO> getCartList2(CartVO vo);
	
	//장바구니 담기
	public void insertCart(CartVO vo);
	
	//장바구니 상품 수량 변경
	public void updateCart(CartVO vo);
	
	//장바구니 삭제
	public void deleteCart(String s_no);
	
	//장바구니 금액 합계
	public int sumMoney(String id);
	
	//장바구니 상품확인
	public int countCart(int i, String id);
	
	//장바구니 수정
	public void modifyCart(CartVO vo);
}

