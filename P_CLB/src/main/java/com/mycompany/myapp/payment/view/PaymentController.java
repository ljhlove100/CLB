package com.mycompany.myapp.payment.view;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.Paging;
import com.mycompany.myapp.payment.PaymentSearchVO;
import com.mycompany.myapp.payment.PaymentService;
import com.mycompany.myapp.payment.PaymentVO;
import com.mycompany.myapp.users.UsersVO;

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
		      mv.setViewName("payment/getPaymentList2");
		      return mv;
			
		}
		
		//상품별 주문내역
		@RequestMapping(value= "/getPaymentList3", method = RequestMethod.GET)
		public String getBoardList3(PaymentVO vo, HttpServletRequest request) {
			request.setAttribute("paymentList3", paymentService.getPaymentList3(vo));
			return "payment/getPaymentList3";
		}
		
		//상품별 주문내역
		@RequestMapping(value= "/getPaymentList4", method = RequestMethod.GET)
		public String getBoardList4(PaymentVO vo, HttpServletRequest request) {
			request.setAttribute("paymentList4", paymentService.getPaymentList4(vo));
			return "payment/getPaymentList4";
		}
		
	
	//amt 총가격(단건)
		@RequestMapping(value= "/getPayment", method = RequestMethod.GET)
		public String getPayment(PaymentVO vo, HttpServletRequest request) {
			request.setAttribute("getPayment", paymentService.getPayment(vo));
			return "payment/getPayment";
		}
	
	// 등록폼
		@RequestMapping(value = "/paymentInsert", method = RequestMethod.GET)
		public String paymentInsertForm() {
			return "payment/paymentInsert";
		}
	
	// 등록처리
		@RequestMapping(value = "/paymentInsert", method = RequestMethod.POST)
		public String insertPayment(@ModelAttribute("payment") PaymentVO vo, HttpServletRequest request) {
			vo.setuId(((UsersVO) (request.getSession().getAttribute("u_id"))).getuId());

			System.out.println(vo);
			paymentService.paymentInsert(vo);
			request.setAttribute("getPayment", paymentService.getPayment(vo));
			return "payment/getPayment";
		}
		
	// 판매수 차트페이지
		@RequestMapping("payment/chart")
		public void paymentInsert() {
			
		}

	// 판매수 차트 데이터 ajax
		@RequestMapping("payment/getPayCnt")
		@ResponseBody
		public List<Map<String, Object>> getPayCnt() {
			return paymentService.getPayCnt();
		}
		
	//월 일별 매출 차트페이지
		@RequestMapping("payment/chart2")
		public void paymentInsert2() {
			
		}
		
	// 월 일별 매출 차트 데이터 ajax
		@RequestMapping("payment/getPayCnt2")
		@ResponseBody
		public List<Map<String, Object>> getPayCnt2() {
					return paymentService.getPayCnt2();
		}
		
	// 일별 매출 차트페이지
		@RequestMapping("payment/chart3")
		public void paymentInsert3() {
					
		}
				
	// 일별 매출 차트 데이터 ajax
		@RequestMapping("payment/getPayCnt3")
		@ResponseBody
		public List<Map<String, Object>> getPayCnt3() {
							return paymentService.getPayCnt3();
		}
				
	//주문내역 삭제
		@RequestMapping(value="/paymentDelete", method = RequestMethod.GET)
		public String paymentDelete(@RequestParam(value="paymentId") int paymentId) {
			paymentService.paymentDelete(paymentId);
			return "redirect:getPaymentList2";
		}
				
}
