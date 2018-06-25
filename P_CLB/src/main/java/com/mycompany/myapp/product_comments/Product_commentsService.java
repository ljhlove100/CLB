package com.mycompany.myapp.product_comments;

import java.util.List;
import java.util.Map;

public interface Product_commentsService {

	//목록조회
	public List<Map<String, Object>> getProduct_commentsList();
	
	public List<Product_commentsVO> getProduct_commentsList2(Product_commentsVO vo);
	
	//단건조회
	public Product_commentsVO getProduct_comments(String pc_no);
	
	//입력
	public void insertProduct_comments(Product_commentsVO vo);
	
	//수정
	public void updateProduct_comments(Product_commentsVO vo);
	
	//삭제
	public void deleteProduct_comments(String pc_no);
}
