<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
 body {
       font: 400 15px Lato, sans-serif;
      line-height: 1.8;
      color: #818181;
 	 }
  
  h2 {
      font-size: 24px;
      text-transform: uppercase;
      color: #303030;
      font-weight: 600;
      margin-bottom: 30px;
	 }
  h4 {
      font-size: 19px;
      line-height: 1.375em;
      color: #303030;
      font-weight: 400;
      margin-bottom: 30px;
  }  
  .center{
  	margin:auto;
  	width:50%;
  	border: 3px;
  	padding: 150px;
  }
</style>
</head>
<body>
<div style="background-color:red; text-align: center;"><font color="white" size="10px;">주문내역 상세보기</font></div>
	<div style="text-align: center; padding: 110px;" class= "center" >
	<table border="1">
		<thead>
			<th>주문번호</th>
			<th>주문 상품명</th>
			<th>주문 상품가격</th>
			<th>주문취소</th>
		</thead>
	<c:forEach items="${paymentList2}" var="payment2">
		<tr>
			<td>${payment2.paymentId}</td>
			<td>${payment2.pName}</td>
			<td>${payment2.totalAmt}원</td>
			<td><button type="button" onclick="location.href='paymentDelete?paymentId=${payment2.paymentId}'">삭제</button></td>
		</tr>
	</c:forEach>
	</table><br><br>
	
	
	<!-- 페이징 -->
   <my:paging paging="${paging}"/>
   <script>
   		function doList(page){
   			location.href="./getPaymentList2?page=" + page
   		}
   </script>
	</div>
</body>
</html>