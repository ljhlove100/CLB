<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div style="background-color:black; text-align: center;"><font color="white" size="10px;">상품별 주문 내역</font></div>
	<div style="text-align: center; padding: 50px;">
	<table border="1">
		<thead>
			<th>주문 ID</th>
			<th>주문 상품명</th>
			<th>주문 상품가격</th>
		</thead>
	<c:forEach items="${paymentList2}" var="payment2">
			<tr>
			<td>${payment2.paymentId}</td>
			<td>${payment2.pName}</td>
			<td>${payment2.totalAmt}원</td>
		</tr>
	</c:forEach>
	</table>
	</div>
	
</body>
</html>