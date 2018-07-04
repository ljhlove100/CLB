<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${paymentList3}" var="payment3">
		<tr>
			<td>${payment3.month}</td>
			<td>${payment3.pCount}</td>
			<td>${payment3.pSum}</td>
		</tr>
	</c:forEach>
</body>
</html>