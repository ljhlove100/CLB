package com.mycompany.myapp.product_comments.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.product_comments.Product_commentsSearchVO;
import com.mycompany.myapp.product_comments.Product_commentsVO;

@Repository
public class Product_commentsDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	//목록조회
	public List<Map<String, Object>> getProduct_commentsList(Product_commentsSearchVO vo) {
		return mybatis.selectList("com.mycompany.product_comments.Product_commentsDAO.getProduct_commentsList");
		
	};
	
	//전체 레코드 건수 조회
	public int getCount(Product_commentsSearchVO vo) {
		return mybatis.selectOne("com.mycompany.myapp.product_comments.Product_commentsDAO.getCount", vo);
	};
	
	public List<Product_commentsVO> getProduct_commentsList2(Product_commentsVO vo) {
		System.out.println(vo);
		return mybatis.selectList("com.mycompany.product_comments.Product_commentsDAO.getProduct_commentsList2", vo);
		
	};
	
	//단건조회
	public Product_commentsVO getProduct_comments(String pc_no) {
		return mybatis.selectOne("com.mycompany.product_comments.Product_commentsDAO.getProduct_comments", pc_no);
		
	}
	
	//입력
	public void insertProduct_comments(Product_commentsVO vo) {
		mybatis.insert("com.mycompany.product_comments.Product_commentsDAO.insertProduct_comments", vo);
	}
	//수정
	public void updateProduct_comments(Product_commentsVO vo) {
		mybatis.update("com.mycompany.product_comments.Product_commentsDAO.updateProduct_comments", vo);
	}
	//삭제
	public void deleteProduct_comments(String pc_no) {
		mybatis.delete("com.mycompany.product_comments.Product_commentsDAO.deleteProduct_comments", pc_no);
	}
}
