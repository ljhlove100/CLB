<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div style="background-color:red; text-align: center;"><font color="white" size="10px;">결제</font></div><br><br>

	<h3>주문 / 결제</h3>
	<div style="font-size:20px">
		<div class="col-sm-3">총 주문금액
		<c:forEach items="${getPayment}" var="payment">
			${payment.sumAmt}원
			<input type="hidden" name="uId" value="${sessionScope.u_id}">
			<br><br>
		</c:forEach>
		</div>
	</div>
	<div>
	</div><br><br><br><br>
	
	<h3>배송지 정보</h3><br>
	<h4>배송지 선택</h4>
	<label>기본배송지&nbsp;<input type="radio" name="radio1" checked="checked"></label><br>
	<label>신규배송지&nbsp;<input type="radio" name="radio1"></label><br>
	<label>직접입력&nbsp;<input type="text" name="text1"></label><br>
	
	<br><br>
	<h4>고객정보</h4>
	<div>
		<label>Name
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" name="name" size="15px;"></label>&nbsp;<br>
		<label>Phone Number
		&nbsp;
		<input type="text" name="phonenum" size="30px;"></label>&nbsp;&nbsp;<br>
		<label>Address
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" name="adress" size="70px;"></label>&nbsp;
	</div><br>
	<h4>택배 기사님에게 한마디</h4>
		<select name="memo">
    		<option value="memo1">배송전에 미리 연락 바랍니다.</option>
    		<option value="memo2">부재시 경비실에 맡겨 주세요.</option>
    		<option value="memo3">부재시 전화 주시거나 문자 남겨 주세요.</option>
    		<option value="memo4">빠른배송 부탁드려요.</option>
  		</select>
  	<br><br>
  	<div id="payment_card">
            카드선택 
            <br>
            <button type="button" id="lotte" class="btn btn-default"> 롯데카드</button>
            <button type="button" id="lotte2" class="btn btn-default"> 국민카드</button>
            <button type="button" id="lotte3" class="btn btn-default"> 신한카드</button>
            <button type="button" id="lotte4" class="btn btn-default"> 삼성카드</button>
            <button type="button" id="lotte5" class="btn btn-default"> 현대카드</button>
            <button type="button" id="lotte6" class="btn btn-default"> 하나카드</button>
            <button type="button" id="lotte7" class="btn btn-default"> 외환카드</button>
            <button type="button" id="lotte8" class="btn btn-default"> 우리BC카드</button><br><br>
            </div><br>
  	
  	
  	<h4>할부기간</h4>
  		<select name="pay">
  			<option value="pay1">일시불</option>
  			<option value="pay2">6개월</option>
  			<option value="pay3">12개월</option>
  		</select>
  	
  	<br><br>
	<div>
		
			<input type="checkbox" name="agree">위 상품의 구매조건 확인 및 결제진행 동의<br>
			<input type="checkbox" name="agree">통합 배송지 이용 동의
		
	</div><br><br><br>
	<form name = "frm" action="${pageContext.request.contextPath}/cartDelete2">
	<c:forEach items="${getPayment}" var="payment">
			결제 하실 총금액은 ${payment.sumAmt}원 입니다. 
			<input type="hidden" name="uId" value="${sessionScope.u_id}">
			<br><br>
		</c:forEach>
	<button type="submit">결제하기</button>
	</form>
	
	
<br><br>
</body>
</html>
