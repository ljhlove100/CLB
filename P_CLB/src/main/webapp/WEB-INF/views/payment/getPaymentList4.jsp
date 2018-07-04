<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${paymentList4}" var="payment4">
		<tr>
			<td>${payment4.day}</td>
			<td>${payment4.pCount}</td>
			<td>${payment4.pSum}</td>
		</tr>
	</c:forEach>
</body>
</html>