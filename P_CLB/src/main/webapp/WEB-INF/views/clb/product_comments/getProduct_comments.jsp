<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>getProduct_comments.jsp</title>
</head>
<body>
	등록 후 확인<br>
	${ vo }
	<hr>
		제목 : ${ product_comments.c_title } <br>
		작성자 : ${ product_comments.c_name } <br>
		리뷰내용 : ${ product_comments.c_contents } <br>
		상품코드 : ${ product_comments.p_no } <br>
		등록자ID : ${ product_comments.insertid } <br>
		등록일 : ${ product_comments.insertdate } <br>
		
		<a href="../updateProduct_comments">수정</a>
</body>
</html>