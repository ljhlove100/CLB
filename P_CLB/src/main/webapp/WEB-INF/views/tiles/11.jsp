<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="./resources/jquery-ui.css">
<script src="./resources/jquery-ui.min.js"></script>


<title>oreo_layout.jsp</title>
<style>
span.button1 {
	background-color: lawngreen;
}

div#but {
	margin-top: 20px;
}

tr, td {
	border: 1px solid gray;
}

td#movie {
	width: 200px;
}

td.twotd {
	width: 5em;
}

td.lo1 {
	width: 5em;
}

td#theather {
	width: 14em;
}

td, th {
	padding: 0;
	text-align: center;
}

input.start {
	width: 20px;
}

.center {
	margin-top: 30px;
}

.table {
	margin-top: 30px;
}

.find {
	padding-left: 40px;
}
/*-------------------
   회원가입,로그인,마이페이지,고객문의
   -----------------*/
.loginbutton {
	float: right;
	color: black;
	background: lightgray;
	margin-right: 10px;
	border-radius: 6px;
	cursor: pointer;
	padding: 5px;
	font-size: 12px;
}

/*-----------------
   "Oreo Cinema"
   예매,상영영화,지난영화,관심영화
   ---------------*/
a:link {
	text-decoration: none;
}

a:visited {
	color: black;
}

body {
	font-family: Arial;
	padding: 10px;
}

/* Header/Blog Title */
.header {
	padding: 60px;
	text-align: center;
}

h2 {
	text-align: center;

	/*    font-family: "Times New Roman", Times, serif; */
}

/* Style the top navigation bar */
.test {
	margin-top: 0px;
	overflow: hidden;
	background-color: brown;
}

.test a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.test:hover {
	background-color: brown;
	color: black;
}

.activity {
	margin-left: 17%;
	background-color: brown;
	color: white;
	font-weight: 10px;
}

.active2 {
	margin-left: 15%;
	background-color: brown;
	color: white;
}

.test .icon {
	display: none;
}

@media screen and (max-width: 600px) {
	.test
	
	
	
   
	
	
	a
	
	
	
	
	:not
	
	
	   
	
	
	(
	:first-child
	
	
	 
	
	
	)
	{
	display
	
	
	
	
	:
	
	
	 
	
	
	none
	
	
	
	
	;
}

.test a.icon {
	float: right;
	display: block;
}

}
@media screen and (max-width: 600px) {
	.test.responsive {
		position: relative;
	}
	.test.responsive .icon {
		position: absolute;
		right: 0;
		top: 0;
	}
	.test.responsive a {
		float: none;
		display: block;
		text-align: left;
	}
}

th#secret_1 {
	font-size: 14px;
}

th#id_1 {
	font-size: 13px;
}

.first:hover {
	color: red;
	background-color: yellow;
}

.movie_first_loc:hover {
	color: red;
	background-color: yellow;
}

.movie_second_loc:hover {
	color: red;
	background-color: yellow;
}

.movie_screen:hover {
	color: red;
	background-color: yellow;
}

.screen_time:hover {
	color: red;
	background-color: yellow;
}
input#pwdcheck {
    margin-bottom: 10px;
}

</style>
<script>
function reserve(){
	console.log("${sessionScope.custNum}");
	var cust="${sessionScope.custNum}";
	if(cust==""||cust==null){
		alert("로그인이 필요합니다");
		location.href="Customerjoin";
	}
	else{
		location.href="./Movie_reserve";
	}
}
</script>
</head>
<body>
	<!-- 우측상단 버튼 -->
	<header>
		<div class="loginbutton">
			<a href="../nonmypage/board_control.jsp?action=list">고객문의</a>
		</div>
		<c:if test="${not empty sessionScope.custId}">
			<div class="loginbutton">
				<a href="../mypage/cust_control.jsp?action=getcustomer">마이페이지</a>
			</div>
		</c:if>
		
		<!-- ----로그인 -->
		<!-- Trigger the modal with a button -->
		<c:if test="${empty sessionScope.custId}">
			<div class="loginbutton" data-toggle="modal" data-target="#myModal">
				로그인</div>
		</c:if>
		<c:if test="${not empty sessionScope.custId}">
			<div class="loginbutton">
				<a href="./logout">로그아웃</a>
			</div>
		</c:if>
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title"></h4>
					</div>


					<form name="form2" method=post
						action="./login_check">
						<div class="modal-body">
							<input type="hidden" name="action" value="login">
							<center>
								<table class="mainlogin">
									<tr>
										<th id="id_1">아이디</th>
										<td><input id="mainlogin.id" type="text" name="custId"></td>
										<td rowspan="2" bgcolor="lightgray"><button value="로그인"
												style="height: 50px; font-size: 15px">로그인</button></td>
									</tr>

									<tr>
										<th id="secret_1">비밀번호</th>
										<td><input id="mainlogin.pwd" type="password"
											name="custPwd"></td>
									</tr>
								</table>
								<div class="find">
									<br> <span type="text" id="id_check"
										style="font-size: 15px">아이디 찾기</span>&nbsp;&nbsp;&nbsp;&nbsp;<span
										type="text" id="secret_number_check" style="font-size: 15px">비밀번호
										찾기</span>
								</div>
							</center>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal"
						style="font-size: 15px">취소</button>
				</div>
			</div>

		</div>
		</div>
		<c:if test="${empty sessionScope.custId}">
			<div class="loginbutton">
				<a href="./Customerjoin">회원가입</a>
			</div>
		</c:if>
		<div class="header">
			<h2>
				<a href="../nonmypage/main.jsp"><img
					src="${pageContext.request.contextPath}/resources/image/logo.jpg"></a>
			</h2>
		</div>
		<!-- bar -->
		<div class="test" id="mytest">
			<a href="#" class="activity" onclick="reserve()">예매</a> <a
				href="../movie_y/movie_control.jsp?action=now" class="active2">상영영화</a>
			<a href="../movie_y/movie_control.jsp?action=last" class="active2">지난영화</a>
			<a href="../movie_y/movie_control.jsp?action=favorite"
				class="active2">관심영화</a> <a href="javascript:void(0);"
				style="font-size: 15px;" class="icon" onclick="myFunction()">&#9776;</a>
		</div>
		<!-- 반응형 웹을 위한 스크립트 -->
		<script>
			function myFunction() {
				var x = document.getElementById("mytest");
				if (x.className === "test") {
					x.className += " responsive";
				} else {
					x.className = "test";
				}
			}
		</script>
	</header>
	<article>
		<tiles:insertAttribute name="content" />
	</article>
</body>
</html>
