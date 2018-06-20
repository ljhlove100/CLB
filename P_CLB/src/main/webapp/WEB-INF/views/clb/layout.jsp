<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
div.container {
	width: 100%;
}

header, footer {
	color: black;
	background-color: white;
	clear: left;
	text-align: center;
}

nav {
	float: top;
	max-width: 100%;
	margin: 0;
}

nav ul {
	list-style-type: none;
	padding: 0;
}

nav ul a {
	text-decoration: none;
}

article {
	margin-left: 0px;
	padding: 1em;
	overflow: hidden;
}

#container {
	display: flex;
}

#box-left {
	background: white;
	flex: 1;
	text-align: center;
}

#box-center {
	background: white;
	flex: 3;
	text-align: center;
}

#box-right {
	background: white;
	flex: 1;
	text-align: center;
	font-size: 20px;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}


</style>

</head>
<body>

	<div class="container">

		<header>
			<h1>
				<decorator:title />
			</h1>
		</header>

		<nav>
			<%@include file="menu.jsp"%>
		</nav>

		<article>
			<!-- 바디 영역 -->
			<decorator:body />
		</article>


		<footer>
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<h4>서비스 소개</h4>
						<p>내용 1</p>
						<p>내용 2</p>
						<p>
							<a class="btn btn-default" data-target="#modal1"
								data-toggle="modal"> 자세히 알아보기</a>
						</p>
					</div>
					<div class="col-md-3">
						<h4>제휴 프로그램</h4>
						<p>내용 1</p>
						<p>내용 2</p>
						<p>
							<a class="btn btn-default" href="#"> 자세히 알아보기</a>
						</p>
					</div>
					<div class="col-md-3">
						<h4>tip</h4>
						<p>내용 1</p>
						<p>내용 2</p>
						<p>
							<a class="btn btn-default" href="#"> 자세히 알아보기</a>
						</p>
					</div>
					<div class="col-md-3">
						<h4>story</h4>
						<p>내용 1</p>
						<p>내용 2</p>
						<p>
							<a class="btn btn-default" data-target="#modal1"
								data-toggle="modal"> 자세히 알아보기</a>
						</p>
					</div>
					<br>
					(주) CLB_ComeLockBuy 대구광역시 중구 상서동 22-2 5층
			</div>
		</footer>

	</div>

</body>
</html>
