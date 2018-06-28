<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	div {border:1px solid blue; padding:20px; margin:5px;}
	
</style>
</head>
<body>
	
	<div style="width:50%; padding:110px; border:1px solid; margin:100px">
	<h3>주문 / 결제</h3>
	<div style="font-size:20px">
		<div class="col-sm-6">상품정보</div>
		<div class="col-sm-3">배송비</div>
		<div class="col-sm-3">주문금액</div>
	</div>
	<div>
		<c:forEach items="${paymentList}" var="vo">
			<div class="col-sm-6" style="font-size:15px">${vo.getP_name()}</div>
			<div class="col-sm-3" style="font-size:15px">무료배송</div>
			<div class="col-sm-3" style="font-size:30px">${vo.getTotal_amt()}</div>
		</c:forEach>
	</div><br><br><br><br>
	
	<h3>배송지 정보</h3><br>
	<h4>배송지 선택</h4>
	<label>기본배송지&nbsp;<input type="radio" name="radio1" checked="checked"></label>&nbsp;
	<label>신규배송지&nbsp;<input type="radio" name="radio1"></label>&nbsp;
	<label>직접입력&nbsp;<input type="text" name="text1"></label>&nbsp;
	
	<br><br>
	<h4>고객정보</h4>
	<div>
		<label>Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" name="text1"></label>&nbsp;<br>
		<label>Phone Number&nbsp;
		<input type="text" name="text1"></label>&nbsp;<br>
		<label>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" name="text1"></label>&nbsp;
	</div><br>
	<h4>택배 기사님에게 한마디</h4>
	<form>
		<select name="memo">
    		<option value="memo1">배송전에 미리 연락 바랍니다.</option>
    		<option value="memo2">부재시 경비실에 맡겨 주세요.</option>
    		<option value="memo3">부재시 전화 주시거나 문자 남겨 주세요.</option>
    		<option value="memo4">빠른배송 부탁드려요.</option>
  		</select>
  	</form>
  	<h3>결제정보</h3><br><br>
  	<img src = "../images/payment/payment_pay.JPG" width="500" height="250">
  	<br><br>
  	
  	<form>
  	<h4>할부기간</h4>
  		<select name="pay">
  			<option value="pay1">일시불</option>
  			<option value="pay2">6개월</option>
  			<option value="pay3">12개월</option>
  		</select>
  	</form>
  	<br><br>
	<div>
		<form>
			<input type="checkbox" name="agree">위 상품의 구매조건 확인 및 결제진행 동의<br>
			<input type="checkbox" name="agree">통합 배송지 이용 동의
		</form>
	</div><br><br><br>
	<center><button type="button" onclick="alert('결제완료')">결제하기</button></center>
	</div>
	
	

</body>
</html>