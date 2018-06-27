package com.mycompany.myapp.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.product.ProductSearchVO;
import com.mycompany.myapp.product.ProductService;
import com.mycompany.myapp.product.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	   ProductDAO dao;
	
	@Override
	public List<ProductVO> getProductList(ProductVO vo) {
		return dao.getProductList(vo);
	}

	@Override
	public ProductVO getProduct(String p_no) {
		return dao.getProduct(p_no);
	}

	@Override
	public void productDelete(String p_no) {
		dao.productDelete(p_no);
	}

	@Override
	public void productInsert(ProductVO vo) {
		dao.productInsert(vo);
	}

	@Override
	public void productUpdate(ProductVO vo) {
		dao.productUpdate(vo);
	}

}
