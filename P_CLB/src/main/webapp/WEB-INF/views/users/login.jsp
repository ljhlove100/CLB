<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
div.modal-dialog {
	background-color: white;
	text-align: center;
	images-align: center;
}

div.modal-footer {
	align: center;
}



th, td {
    padding: 5px;
    text-align: center;    
}

</style>
</head>
<body>

	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<img src="${pageContext.request.contextPath}/views/images/home/Logo_1.png" align="center" alt="Avatar"
						class="avatar" width="500" height="300">
					<!-- 	<button type="button" class="close" class="btn btn-dark" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">테스트</h4> -->
				</div>
				<form method="post" action="../signUp/signUp_control.jsp">
					<div class="modal-bodyc" align=center font-size=13px>
						<input type="hidden" name="action" value="login">
						<table class="mainlogin">
							<tr>
								<th>아이디</th>
								<td><input type="text" placeholder="이메일" name="u_id"	 required></td>
							</tr>

							<tr>
								<th>비밀번호</th>
								<td><input type="password" placeholder="비밀번호" name="pw" required></td>
							</tr>
							<br>
							<tr >
								<th colspan="2" align="center">
								<button type="submit" class="btn btn-warning">로그인</button><br>
										 <a href="../signUp/signUp.jsp">회원가입</a> 
										 <a href="./pw_find.jsp">비밀번호</a><br>
								<button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
								</th>
						</table>
					</div>
				</form>
			</div>

		</div>
	</div>


	<!-- The Modal -->
	<div class="modal fade" id="myModal1" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<img src="${pageContext.request.contextPath}/images/home/Logo_1.png" align="center" alt="Avatar"
						class="avatar" width="500" height="300">
				</div>
				<form method="post" action="../signUp/signUp_control.jsp">
					<div class="modal-bodyd" font-size=13px>
						<input type="hidden" name="action" value="new">
						<table class="mainlogin">
							<tr>
								<th>아이디</th>
								<td><input type="text"
									placeholder="아이디" name="u_id" required></td>
							</tr>
							<!-- <tr>
								<th>아이디확인</th>
								<td><input type="text" placeholder="아이디 다시 입력"
									name="u_id" required></td>
									<input tpye ="button" value="중복확인" onclick="logincheck">
							</tr> -->
							<tr>
								<th>비밀번호</th>
								<td><input type="password" placeholder="영문·숫자·특수문자조합6~15자리"
									name="pw" required></td>
							</tr>
							<tr>
								<th>이름</th>
								<td><input type="text" placeholder="이름" name="name"required></td>
							</tr>
							<tr>
								<th colspan="2" align="center"><input type="checkbox"
									checked="checked" name="remember" style="margin-bottom: 15px">
									만 14세 이상이며, CLB 이용약관 및 개인정보 수집 및 이용에 대한 내용을 확인하고 동의합니다.
								</th>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="submit"	value="완료" /></td>
							</tr>
						</table>
</div>
</form>
</div>
</div>
</div>
</body>
</html>

