<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>insertProduct_comments.jsp</title>
</head>
<body>
	<form action="./insertProduct_comments" method="post">
		<input type="text" name="c_title">
		<input type="text" name="c_name">
		<input type="text" name="c_contents">
		<input type="text" name="p_no">
		<input type="text" name="insertid">
		<input type="text" name="insertdate">
		<input type="submit" value="등록" />
	</form>
</body>
</html>