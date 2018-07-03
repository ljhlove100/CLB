package com.mycompany.myapp.payment.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.payment.PaymentSearchVO;
import com.mycompany.myapp.payment.PaymentVO;

@Repository
public class PaymentDAO {

	@Autowired
		SqlSessionTemplate mybatis;
	//상품별 주문내역
	public List<PaymentVO> getPaymentList(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList",vo);
	};
	
	//주문 내역조회
	public List<PaymentVO> getPaymentList2(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList2",vo);
	};
	
	//전체레코드 건수 조회
    
    public int getCount(PaymentSearchVO vo) {
        return mybatis.selectOne("com.mycompany.myapp.payment.PaymentDAO.getCount", vo);
     };
	
	//totalAmt (총가격)
	public PaymentVO getPayment(String paymentId) {
		return mybatis.selectOne("com.mycompany.myapp.payment.PaymentDAO.getPayment", paymentId);
	}
	
	//추가
	public void paymentInsert(PaymentVO vo) {
		mybatis.insert("com.mycompany.myapp.payment.PaymentDAO.paymentInsert", vo);
	}
	
	//상품별 판매수
		public List<Map<String, Object>> getPayCnt(){
			return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPayCnt");
		}
}
