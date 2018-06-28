package com.mycompany.myapp.product.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.product.CartVO;

@Repository
public class CartDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	//목록조회
	public List<Map<String, Object>> getCartList() {
		return mybatis.selectList("com.mycompany.product.CartDAO.getCartList");
		
	};
	 
	public List<CartVO> getCartList2(CartVO vo) {
		System.out.println(vo);
		return mybatis.selectList("com.mycompany.product.CartVO.getCartList2", vo);
	};
	
	//담기
	public void insertCart(CartVO vo) {
		mybatis.insert("com.mycompany.product.CartDAO.insertCart", vo);
		
	}
	
	//수량변경
	public void updateCart(CartVO vo) {
		mybatis.update("com.mycompany.product.CartDAO.updateCart", vo);
		
	}
	
	//삭제
	public void deleteCart(String s_no) {
		mybatis.delete("com.mycompany.product.CartDAO.deleteCart", s_no);
		
	}
	
	//금액합계
	
	
	//상품확인
	
	//수정
}
