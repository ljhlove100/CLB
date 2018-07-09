package com.mycompany.myapp.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.product.CartVO;

@Repository
public class CartDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	//전체목록
		public List<CartVO> listCart(CartVO vo){
			return mybatis.selectList("com.mycompany.myapp.product.CartDAO.listCart",vo);
		};
	 
	//담기
		public void insertCart(CartVO vo) {
			mybatis.insert("com.mycompany.myapp.product.CartDAO.insertCart", vo);
		
	};
	
	//삭제
		public void cartDelete(String cartId) {
			mybatis.delete("com.mycompany.myapp.product.CartDAO.cartDelete", cartId);
	};
		
	//결제 후 장바구니 삭제
		public void cartDelete2(String uId) {
			mybatis.delete("com.mycompany.myapp.product.CartDAO.cartDelete2", uId);
	};
}
