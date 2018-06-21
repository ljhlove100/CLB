<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>updateProduct_comments.jsp</title>
</head>
<body>
	<h3>게시글 수정</h3>
	<form action="./updateProduct_comments" method="post">
		<input type="text" name="c_title" value="${ product_comments.c_title }">
		<input type="text" name="c_name" value="${ product_comments.c_name }">
		<input type="text" name="c_contents" value="${ product_comments.c_contents }">
		<input type="text" name="p_no" value="${ product_comments.p_no }">
		<input type="text" name="insertid" value="${ product_comments.insertid }">
		<input type="text" name="insertdate" value="${ product_comments.insertdate }">
		<input type="submit" value="등록" />
	</form>
	${ product_comments }
</body>
</html>