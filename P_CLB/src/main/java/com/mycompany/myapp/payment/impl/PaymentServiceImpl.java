package com.mycompany.myapp.payment.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.payment.PaymentService;
import com.mycompany.myapp.payment.PaymentVO;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{

	@Autowired
		PaymentDAO dao;
	
	@Override
	public PaymentVO getPayment(String paymentId) {
		return dao.getPayment(paymentId);
	}

	@Override
	public void paymentInsert(PaymentVO vo) {
		dao.paymentInsert(vo);
	}

}
