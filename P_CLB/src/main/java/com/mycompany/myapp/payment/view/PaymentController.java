package com.mycompany.myapp.payment.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.Paging;
import com.mycompany.myapp.payment.PaymentSearchVO;
import com.mycompany.myapp.payment.PaymentService;
import com.mycompany.myapp.payment.PaymentVO;
import com.mycompany.myapp.product.ProductVO;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	//상품별 주문내역
	@RequestMapping(value= "/getPaymentList", method = RequestMethod.GET)
	public String getBoardList(PaymentVO vo, HttpServletRequest request) {
		request.setAttribute("paymentList", paymentService.getPaymentList(vo));
		return "payment/getPaymentList";
	}
	
	
	//주문 내역조회
		@RequestMapping(value= "/getPaymentList2", method = RequestMethod.GET)
		public ModelAndView getBoardList2(PaymentSearchVO vo, Paging paging) {
			ModelAndView mv = new ModelAndView();
		      //페이지 번호 파라미터
		      if(paging.getPage()==null)
		         paging.setPage(1);
			
		    //페이징 first,last 검색조건
		      //page 1 ==> 1~10 2=> 11~20
		      vo.setFirst(paging.getFirst());
		      vo.setLast(paging.getLast());
		      
		    //전체건수
		      paging.setTotalRecord(paymentService.getCount(vo));
		      
		      //결과를 모델에 저장
		      mv.addObject("paging",paging);
		      mv.addObject("paymentList2", paymentService.getPaymentList2(vo));
		      
		      //뷰페이지 지정
		      mv.setViewName("payment/paymentList2");
		      return mv;
			
		}
	
	//단건
	@RequestMapping(value = "/getPayment/{paymentId}", method = RequestMethod.GET)
	public String getPayment(@PathVariable String paymentId, Model model) {
		model.addAttribute("payment", paymentService.getPayment(paymentId));
		return "payment/getPayment";
	}
	
	// 등록폼
		@RequestMapping(value = "/paymentInsert", method = RequestMethod.GET)
		public String paymentInsertForm() {
			return "payment/paymentInsert";
		}
	
	// 등록처리
		@RequestMapping(value = "/paymentInsert", method = RequestMethod.POST)
		public String insertPayment(@ModelAttribute("payment") PaymentVO vo) {
			System.out.println(vo);
			// 서비스이용하여 등록처리하고 목록페이지로 이동
			paymentService.paymentInsert(vo);
			return "payment/getPayment";
		}
		
	// 차트페이지
		@RequestMapping("payment/chart")
		public void paymentInsert() {
			
		}

	// 차트 데이터 ajax
		@RequestMapping("payment/getPayCnt")
		@ResponseBody
		public List<Map<String, Object>> getPayCnt() {
			return paymentService.getPayCnt();
		}
}
