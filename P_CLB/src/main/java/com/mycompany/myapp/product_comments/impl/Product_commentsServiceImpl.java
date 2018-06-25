package com.mycompany.myapp.product_comments.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.product_comments.Product_commentsService;
import com.mycompany.myapp.product_comments.Product_commentsVO;

@Service("product_commentsService")
public class Product_commentsServiceImpl implements Product_commentsService {

	@Autowired
	Product_commentsDAO dao;
	
	@Override
	public List<Map<String, Object>> getProduct_commentsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product_commentsVO> getProduct_commentsList2(Product_commentsVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product_commentsVO getProduct_comments(String pc_no) {
		// TODO Auto-generated method stub
		return dao.getProduct_comments(pc_no);
	}

	@Override
	public void insertProduct_comments(Product_commentsVO vo) {
		// TODO Auto-generated method stub
		dao.insertProduct_comments(vo);
		
	}

	@Override
	public void updateProduct_comments(Product_commentsVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct_comments(String pc_no) {
		// TODO Auto-generated method stub
		
	}

	
	
}
