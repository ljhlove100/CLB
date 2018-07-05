package com.mycompany.myapp.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.product.CartService;
import com.mycompany.myapp.product.CartVO;

@Service("CartService")
public class CartServiceImpl implements CartService {

	@Autowired
	CartDAO dao;
	
	@Override
	public List<Map<String, Object>> getCartList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartVO> getCartList2(CartVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCart(CartVO vo) {
		
		
	}

	@Override
	public void updateCart(CartVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCart(String s_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sumMoney(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void modifyCart(CartVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countCart(int i, String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//==================
	

    
}