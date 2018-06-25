<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<script src="../script/jquery-3.2.1.min.js"></script>
<body>
<center>
	<h3>상품 정보</h3>
	${product.image}<br>
	<h4>${product.pName}</h4><br>
	<h4>${product.price}원</h4><br>
	<h4>${product.pContents}</h4><br>
</center>
</body>
</html>