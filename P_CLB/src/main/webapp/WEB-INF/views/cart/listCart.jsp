<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div style="background-color:red; text-align: center;"><font color="white" size="10px;">장바구니</font></div><br><br>
<form name = "frm" action="${pageContext.request.contextPath}/paymentInsert" method="post">

				

<c:forEach items="${cartList}" var="cartlist">
    구매번호 : ${cartlist.cartId}
			${cartlist.image}
			${cartlist.totalAmt}원
			<button type="button" onclick="location.href='cartDelete?cartId=${cartlist.cartId}'">삭제</button>
			
				<input TYPE="hidden" name="pNo" value="${cartlist.pNo}">
				<input type="hidden" name="pName" value="${cartlist.pName}">
				<input type="hidden" name="uId" value="${sessionScope.u_id}">
				<input TYPE="hidden" name="totalAmt" value="${cartlist.totalAmt}">
			<br><br>
	</c:forEach>
	<center>
	<button type="submit">결제하기</button>
	</center>
</form>
</body>
</html>