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
	
	//totalAmt (총가격)
    public List<PaymentVO> getPayment(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPayment",vo);
	};
	
	//상품별 주문내역
	public List<PaymentVO> getPaymentList(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList",vo);
	};
	
	//주문 내역조회
	public List<PaymentVO> getPaymentList2(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList2",vo);
	};
	
	public List<PaymentVO> getPaymentList3(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList3",vo);
	};
	
	public List<PaymentVO> getPaymentList4(PaymentVO vo){
		return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPaymentList4",vo);
	};
	//전체레코드 건수 조회
    
    public int getCount(PaymentSearchVO vo) {
        return mybatis.selectOne("com.mycompany.myapp.payment.PaymentDAO.getCount", vo);
     };
	
	
	//추가
	public void paymentInsert(PaymentVO vo) {
		mybatis.insert("com.mycompany.myapp.payment.PaymentDAO.paymentInsert", vo);
	};
	
	public void paymentInsert2(PaymentVO vo) {
		mybatis.insert("com.mycompany.myapp.payment.PaymentDAO.paymentInsert2", vo);
	};
	
	public void paymentInsert3(PaymentVO vo) {
		mybatis.insert("com.mycompany.myapp.payment.PaymentDAO.paymentInsert3", vo);
	};
	
	//상품별 판매수 chart
		public List<Map<String, Object>> getPayCnt(){
			return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPayCnt");
	};
	
	//월 일별 매출 chart
		public List<Map<String, Object>> getPayCnt2(){
			return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPayCnt2");
	};
	
	//일별 매출 chart
		public List<Map<String, Object>> getPayCnt3(){
			return mybatis.selectList("com.mycompany.myapp.payment.PaymentDAO.getPayCnt3");
	};
				
	//삭제
		public void paymentDelete(int paymentId) {
			mybatis.delete("com.mycompany.myapp.payment.PaymentDAO.paymentDelete", paymentId);
	};
	
}
