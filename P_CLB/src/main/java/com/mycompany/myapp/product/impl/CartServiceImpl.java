package com.mycompany.myapp.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.product.CartService;
import com.mycompany.myapp.product.CartVO;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	CartDAO dao;

	@Override
	public void insertCart(CartVO vo) {
		dao.insertCart(vo);
	}

	@Override
	public List<CartVO> listCart(CartVO vo) {
		return dao.listCart(vo);
	}

	@Override
	public void cartDelete(String cartId) {
		dao.cartDelete(cartId);
	}

	@Override
	public void cartDelete2(String uId) {
		dao.cartDelete2(uId);
	}

	

    
}