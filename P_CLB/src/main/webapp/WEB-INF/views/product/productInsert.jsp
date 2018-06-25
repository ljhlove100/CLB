<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="./productInsert" method="post">
상품이름 : <input type="text" name="pName">
상품설명 : <input type="text" name="pContents">
상품가격 : <input type="text" name="price">
상품사진(경로를 입력하세요): <input type="text" name="image">
<input type="submit" value="등록">
</form>
</body>
</html>