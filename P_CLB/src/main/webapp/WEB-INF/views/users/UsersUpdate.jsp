<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h3>게시글정보수정mybatis</h3>
	<a href="getBoardList">게시글목록보기</a>
	<form action="updateBoard" method="post">
		${board}<br>
		순번:<input type="text" name="seq" value='${board.getSeq()}' /><br>
		제목:<input type="text" name="title" value='${board.title}' /><br>
		작성자:<input type="text" name="writer" value='${board.writer}' /><br>
		내용:<input type="text" name="content" value='${board.content}' /><br>
		<input type="submit" value="수정" />
	</form>
</body>
</html>