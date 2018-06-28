package com.mycompany.myapp.payment.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.payment.PaymentService;
import com.mycompany.myapp.payment.PaymentVO;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
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
}
