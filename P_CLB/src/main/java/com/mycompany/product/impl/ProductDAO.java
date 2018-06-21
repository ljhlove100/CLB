package com.mycompany.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.product.ProductSearchVO;
import com.mycompany.product.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	   SqlSessionTemplate mybatis;
	
	//전체조회
	public List<ProductVO> getProductList(ProductSearchVO searchVO){
		return mybatis.selectList("com.mycompany.product.ProductDAO.getProductList");
	};
	
	//단건조회
	public ProductVO getProduct(String p_no) {
		return mybatis.selectOne("com.mycompany.product.ProductDAO.getProduct", p_no);
	};
	
	//삭제
	public void productDelete(String p_no) {
		mybatis.delete("com.mycompany.product.ProductDAO.productDelete", p_no);
	};
	
	//등록
	public void productInsert(ProductVO vo) {
		mybatis.insert("com.mycompany.product.ProductDAO.productInsert", vo);
	};
	
	//수정
	public void productUpdate(ProductVO vo) {
		mybatis.update("com.mycompany.product.ProductDAO.productUpdate", vo);
	};
}
