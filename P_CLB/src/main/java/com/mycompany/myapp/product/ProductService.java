package com.mycompany.myapp.product;

import java.util.List;

public interface ProductService {
	
	//목록조회
	public List<ProductVO> getProductList(ProductVO vo);
	
	//단건조회
	public ProductVO getProduct(String p_no);
	
	//삭제
	public void productDelete(String p_no);
	
	//입력
	public void productInsert(ProductVO vo);
	
	//수정
	public void productUpdate(ProductVO vo);
	
}
