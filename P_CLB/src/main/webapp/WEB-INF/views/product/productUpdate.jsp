<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<center>
<div style="background-color:black"><font color="white" size="20px">상품 수정 하기</font></div>
<div style="border: 1px double black; padding: 30px; margin: 30px;">
<form action="./productUpdate" method="post">
${product.image}<br><br>
상품명 : <input type="text" name="pName" size="8px;" value="${sessionScope.product.pName}"><br><br>
상품설명 : <input type="text" name="pContents" size="30px;" value="${product.pContents}"><br><br>
상품가격 : <input type="text" name="price" size="6px;" value="${product.price}">원<br><br>
<input type="submit" value="수정">
</form>
</div>
</center>
</body>
</html>