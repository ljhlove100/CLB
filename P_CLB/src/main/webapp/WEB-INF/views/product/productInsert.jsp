<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<center>
<div style="background-color:black"><font color="white" size="20px">상품 추가 하기</font></div>
<div style="border: 1px double black; padding: 30px; margin: 50px;">
<form action="./productInsert" method="post">
상품이름 : <input type="text" name="pName" size="10px;">
상품설명 : <input type="text" name="pContents" size="40px;">
상품가격 : <input type="text" name="price" size="10px;">
상품사진(경로를 입력하세요):
<input type="text" name="image" size="80px;" placeholder="Ex)<img src=/clb/resources/images/이미지.JPG width=350 height=350">
<input type="submit" value="등록">
</form>
</div>
</center>
</body>
</html>