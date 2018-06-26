package com.mycompany.myapp.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.product.ProductSearchVO;
import com.mycompany.myapp.product.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	   SqlSessionTemplate mybatis;
	
	//전체조회
	public List<ProductVO> getProductList(ProductVO vo){
		return mybatis.selectList("com.mycompany.myapp.product.ProductDAO.getProductList",vo);
	};
	
	//단건조회
	public ProductVO getProduct(String p_no) {
		return mybatis.selectOne("com.mycompany.myapp.product.ProductDAO.getProduct", p_no);
	};
	
	//삭제
	public void productDelete(String p_no) {
		mybatis.delete("com.mycompany.myapp.product.ProductDAO.productDelete", p_no);
	};
	
	//등록
	public void productInsert(ProductVO vo) {
		mybatis.insert("com.mycompany.myapp.product.ProductDAO.productInsert", vo);
	};
	
	//수정
	public void productUpdate(ProductVO vo) {
		mybatis.update("com.mycompany.myapp.product.ProductDAO.productUpdate", vo);
	};
}
