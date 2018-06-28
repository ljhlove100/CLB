package com.mycompany.myapp.payment.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.payment.PaymentVO;

@Repository
public class PaymentDAO {

	@Autowired
		SqlSessionTemplate mybatis;
	
	//totalAmt (총가격)
	public PaymentVO getPayment(String paymentId) {
		return mybatis.selectOne("com.mycompany.myapp.payment.PaymentDAO.getPayment", paymentId);
	}
	
	//추가
	public void paymentInsert(PaymentVO vo) {
		mybatis.insert("com.mycompany.myapp.payment.PaymentDAO.paymentInsert", vo);
	}
}
