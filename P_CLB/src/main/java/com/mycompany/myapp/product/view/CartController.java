package com.mycompany.myapp.product.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.product.CartService;
import com.mycompany.myapp.product.CartVO;

@Controller
@RequestMapping("/shop/cart/*")
public class CartController {
/*
    @Inject
    CartService cartService;

    // 1. 장바구니 추가
    @RequestMapping("insert.do")
    public String insert(@ModelAttribute CartVO vo, HttpSession session){
        String Id = (String) session.getAttribute("Id");
        vo.setId(Id);
        // 장바구니에 기존 상품이 있는지 검사
        int count = cartService.countCart(vo.getP_no(), Id);
        count == 0 ? cartService.updateCart(vo) : cartService.insertCart(vo);
        if(count == 0){
            // 없으면 insert
            cartService.insertCart(vo);
        } else {
            // 있으면 update
            cartService.updateCart(vo);
        }
        return "redirect:/shop/cart/list.do";
    }

    // 2. 장바구니 목록
    @RequestMapping("list.do")
    public ModelAndView list(HttpSession session, ModelAndView mav){
        String Id = (String) session.getAttribute("Id"); // session에 저장된 userId
        Map<String, Object> map = new HashMap<String, Object>();
        List<CartVO> list = cartService.listcart(Id); // 장바구니 정보 
        int sumMoney = cartService.sumMoney(Id); // 장바구니 전체 금액 호출
        // 장바구니 전체 긍액에 따라 배송비 구분
        // 배송료(10만원이상 => 무료, 미만 => 2500원)
        int fee = sumMoney >= 100000 ? 0 : 2500;
        map.put("list", list);                // 장바구니 정보를 map에 저장
        map.put("count", list.size());        // 장바구니 상품의 유무
        map.put("sumMoney", sumMoney);        // 장바구니 전체 금액
        map.put("fee", fee);                 // 배송금액
        map.put("allSum", sumMoney+fee);    // 주문 상품 전체 금액
        mav.setViewName("shop/cartList");    // view(jsp)의 이름 저장
        mav.addObject("map", map);            // map 변수 저장
        return mav;
    }

    // 3. 장바구니 삭제
    @RequestMapping("delete.do")
    public String delete(@RequestParam int s_no){
        cartService.delete(s_no);
        return "redirect:/shop/cart/list.do";
    }

    // 4. 장바구니 수정
    @RequestMapping("update.do")
    public String update(@RequestParam int[] amount, @RequestParam int[] p_no, HttpSession session) {
        // session의 id
        String Id = (String) session.getAttribute("Id");
        // 레코드의 갯수 만큼 반복문 실행
        for(int i=0; i<p_no.length; i++){
            CartVO vo = new CartVO();
            vo.setId(Id);
            vo.setAmount(amount[i]);
            vo.setP_no(p_no[i]);
            cartService.modifyCart(vo);
        }

        return "redirect:/shop/cart/list.do";
    }
*/}