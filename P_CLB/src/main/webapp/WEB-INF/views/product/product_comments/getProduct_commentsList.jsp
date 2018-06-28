<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
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
	<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>내용</th>
		<th>상품번호</th>
		<th>수정자</th>
		<th>수정일</th>
	<a href="insertProduct_comments">게시글 등록하기</a>
	<c:forEach items = "${product_commentsList}" var="product_comments">
			pc_no:<a href="updateBoardForm?pc_no=">${product_comments.PC_NO}</a><br>
			<tr>
				<td>${product_comments.PC_NO}</td>
				<td><a href="getProduct_comments/${product_comments.C_TITLE}">${product_comments.C_TITLE}</a></td>
				<td>${product_comments.C_NAME}</td>
				<td>${product_comments.C_CONTENTS}</td>
				<td>${product_comments.P_NO}</td>
				<td>${product_comments.INSERTID}</td>
				<td>${product_comments.INSERTDATE}</td>
			</tr>
	</c:forEach>
	</table>
	<!-- 페이징 -->
	<my:paging paging="${paging}"/>
	
	<script>
		function doList(page) {
			location.href="./getProduct_commentsList?page=" + page
		}
	</script>
</body>
</html>