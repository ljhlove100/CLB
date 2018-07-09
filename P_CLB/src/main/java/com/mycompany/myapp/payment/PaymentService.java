package com.mycompany.myapp.payment;

import java.util.List;
import java.util.Map;

public interface PaymentService {

	//totalAmt (총가격)
	public List<PaymentVO> getPayment(PaymentVO vo);
	
	//상품별 주문내역
	public List<PaymentVO> getPaymentList(PaymentVO vo);
	
	//주문 내역조회
	public List<PaymentVO> getPaymentList2(PaymentVO vo);
	
	//월별 매출현황
	public List<PaymentVO> getPaymentList3(PaymentVO vo);
	
	//일별 매출현황
	public List<PaymentVO> getPaymentList4(PaymentVO vo);
	
	//추가
	public void paymentInsert(PaymentVO vo);
	
	public void paymentInsert2(PaymentVO vo);
	
	public void paymentInsert3(PaymentVO vo);
	
	//상품별 주문수 chart
	public List<Map<String, Object>> getPayCnt();
	
	//월 일별 매출 chart
	public List<Map<String, Object>> getPayCnt2();
	
	public List<Map<String, Object>> getPayCnt3();
	
	//카운트
	public int getCount(PaymentSearchVO vo);
	
	//삭제
	public void paymentDelete(int paymentId);
	
}
