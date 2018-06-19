<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Product_commnetsList.jsp</title>
</head>
<body>
	<h3>게시판 목록</h3>
	<form>
		<select>
			<option>선택</option>
			<c:forEach items="${ conditionMap }" var="item">
				<option value = "${ item.value }">${ item.key }</option>
			</c:forEach>
		</select>
		<input type = "submit" value="검색" />
	</form>
	<a href="insertProduct_commentsForm">게시글 등록하기</a>
	<c:forEach items = "${product_commentsList}" var="product_comments">
		<div style = "border: 1px solid black;">
			pc_no:<a href="updateBoardForm?pc_no=${product_comments.PC_NO}">${product_comments.PC_NO}</a><br>
			c_title:${product_comments.C_TITLE}<br>
			c_name:${product_comments.C_NAME}<br>
			c_contents:${product_comments.C_CONTENTS}<br>
			p_no:${product_comments.P_NO}<br>
			insertid:${product_comments.INSERTID}<br>
			insertdate:${product_comments.INSERTDATE}<br>
		</div>
	</c:forEach>
</body>
</html>