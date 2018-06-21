<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>getProductList.jsp</title>
</head>
<body>
	
	<c:forEach items="${getProductList}" var="productList">
		<div style = "border : 1px solid green;">
					 ${productList.IMAGE}
			물품번호 : <a href="getProduct/${productList.P_NO}">${productList.P_NO}</a><br>
			상품이름 : ${productList.P_NAME}<br>
			상품가격 : ${productList.PRICE}원<br>
		</div>
	</c:forEach>
</body>
</html>