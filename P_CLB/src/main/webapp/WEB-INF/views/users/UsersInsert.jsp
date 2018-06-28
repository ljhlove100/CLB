<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h3>게시글등록하기mybatis</h3>
	<a href="getUsertList">게시글목록보기</a>
	<form action="./insertUsers" method="post" enctype="multipart/form-data">
		title:<input type="text" name="title" /> 
		writer:<input type="text" name="writer" /> 
		content:<input type="text" name="content" /> 
		<input type="file" name="tempupload_file"/>
		<input type="submit" value="게시글등록" />
	</form>
</body>
</html>