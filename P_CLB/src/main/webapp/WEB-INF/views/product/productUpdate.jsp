<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h3>상품수정</h3>
<form action="./productUpdate" method="post">
${product.image}<br>
상품명 : <input type="text" name="pName" value="${sessionScope.product.pName}"><br><br>
상품설명 : <input type="text" name="pContents" value="${product.pContents}"><br><br>
상품가격 : <input type="text" name="price" value="${product.price}"><br><br>
<input type="submit" value="수정">
</form>
</body>
</html>