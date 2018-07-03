package com.mycompany.myapp.payment;

import java.util.List;
import java.util.Map;

public interface PaymentService {

	//상품별 주문내역
	public List<PaymentVO> getPaymentList(PaymentVO vo);
	
	//주문 내역조회
	public List<PaymentVO> getPaymentList2(PaymentVO vo);
	
	//totalAmt (총가격)
	public PaymentVO getPayment(String paymentId);
	
	//추가
	public void paymentInsert(PaymentVO vo);
	
	//상품별 주문수
	public List<Map<String, Object>> getPayCnt();
	
	//카운트
	public int getCount(PaymentSearchVO vo);
	
}
