package com.mycompany.myapp.payment.impl;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.payment.PaymentSearchVO;
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
	

	@Override
	public List<PaymentVO> getPaymentList(PaymentVO vo) {
		return dao.getPaymentList(vo);
	}

	@Override
	public List<PaymentVO> getPaymentList2(PaymentVO vo) {
		return dao.getPaymentList2(vo);
	}

	@Override
	public List<Map<String, Object>> getPayCnt() {
		return dao.getPayCnt();
	}

	@Override
	public int getCount(PaymentSearchVO vo) {
		return dao.getCount(vo);
	}

	@Override
	public List<PaymentVO> getPaymentList3(PaymentVO vo) {
		return dao.getPaymentList3(vo);
	}

	@Override
	public List<PaymentVO> getPaymentList4(PaymentVO vo) {
		return dao.getPaymentList4(vo);
	}

	@Override
	public List<Map<String, Object>> getPayCnt2() {
		return dao.getPayCnt2();
	}

	@Override
	public void paymentInsert2(PaymentVO vo) {
		dao.paymentInsert2(vo);
	}

	@Override
	public void paymentInsert3(PaymentVO vo) {
		dao.paymentInsert3(vo);
	}

	@Override
	public List<Map<String, Object>> getPayCnt3() {
		return dao.getPayCnt3();
	}

}
