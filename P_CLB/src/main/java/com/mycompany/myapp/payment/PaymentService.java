package com.mycompany.myapp.payment;

public interface PaymentService {

	//totalAmt (총가격)
	public PaymentVO getPayment(String paymentId);
	
	//추가
	public void paymentInsert(PaymentVO vo);
}
