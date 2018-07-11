<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>account</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link href="images/icons/favicon.ico" rel="icon"
	type=${pageContext.request.contextPath}/resources/Login_v1/image/png "/>
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/css/util.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/Login_v1/css/main.css">
<!--===============================================================================================-->

<!-- <script>
	function inputCheck() {
		var name = document.frm.name.value;
		if (name == "") {
			alert("이름을 입력하세요.");
			return false;
		}
		var id = document.frm.id.value;
		if (id == "") {
			alert("아이디를 입력하세요.");
			return false;
		}
		var password = document.frm.password.value;
		if (password == "") {
			alert("비밀번호를 입력하세요.");
			return false;
		}
		var pwdcheck = document.frm.pwdcheck.value;
		if (pwdcheck == "") {
			alert("비밀번호 확인을 입력하세요.");
			return false;
		}
		var phonenumber = document.frm.phonenumber.value;
		if (phonenumber == "") {
			alert("전화번호를 입력하세요.");
			return false;
		}
		var emailid = document.frm.emailid.value;
		if (emailid == "") {
			alert("이메일을 입력하세요.");
			return false;
		}
		var emailaddr = document.frm.emailaddr.value;
		if (emailaddr == "") {
			alert("이메일을 입력하세요.");
			return false;
		}
		return true;
	}
</script> -->

<!-- daum addr api -->



<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
	function sample4_execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
						// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

						// 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
						// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
						var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
						var extraRoadAddr = ''; // 도로명 조합형 주소 변수

						// 법정동명이 있을 경우 추가한다. (법정리는 제외)
						// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
						if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
							extraRoadAddr += data.bname;
						}
						// 건물명이 있고, 공동주택일 경우 추가한다.
						if (data.buildingName !== '' && data.apartment === 'Y') {
							extraRoadAddr += (extraRoadAddr !== '' ? ', '
									+ data.buildingName : data.buildingName);
						}
						// 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
						if (extraRoadAddr !== '') {
							extraRoadAddr = ' (' + extraRoadAddr + ')';
						}
						// 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
						if (fullRoadAddr !== '') {
							fullRoadAddr += extraRoadAddr;
						}

						// 우편번호와 주소 정보를 해당 필드에 넣는다.
						document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용
						document.getElementById('sample4_roadAddress').value = fullRoadAddr;
						document.getElementById('sample4_jibunAddress').value = data.jibunAddress;

						// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.

					}
				}).open();
	}
	
	function test() {
		$.ajax({
			type : "POST",
			//dataType: "json",
			dataType : 'text',
			data : {
				id : document.getElementById('u_id').value
			},
			url : "test",
			success : function(data) {
				if(data == 0){
					alert("아이디가 중복됩니다.");
				}
			}
		});
	}
</script>


</head>

<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt="">
					<img
						src="${pageContext.request.contextPath}/resources/images/home/clb-logo.png"
						alt="IMG" width="604" height="408">
				</div>

				<form class="login100-form validate-form" action="account">
					<input type="hidden" name="cnt" value="2"> <span
						class="login100-form-title"> CLB 회원가입 </span>

					<div  class="wrap-input100 validate-input"
							 data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name=u_id id="u_id" placeholder="u_id" onchange="test()">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>
					
					<div  class="wrap-input100 validate-input"	>
						<input class="input100" type="text" name=email  value="email" placeholder="email" >
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>



					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="pw" placeholder="pw">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="user name">
						<input class="input100" type="text" name="name" placeholder="name">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-star-o" aria-hidden="true"></i>
						</span>
					</div>

					
					<div class="wrap-input100 validate-input" data-validate="user name">
						<input class="input100" type="text" name="sample4_postcode" id="sample4_postcode" placeholder="우편번호" onclick="sample4_execDaumPostcode()">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-star-o" aria-hidden="true"></i>
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="user name">
						<input class="input100" type="text" name="sample4_roadAddress" id="sample4_roadAddress" placeholder="도로명주소" onclick="sample4_execDaumPostcode()">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-star-o" aria-hidden="true"></i>
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="user name">
						<input class="input100" type="text" name="sample4_jibunAddress" id="sample4_jibunAddress" placeholder="지번주소" onclick="sample4_execDaumPostcode()">
						<span class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-star-o" aria-hidden="true"></i>
						</span>
					</div>


					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn" value="회원가입">
							Account</button>
					</div>


				</form>
			</div>
		</div>
	</div>



	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/vendor/bootstrap/js/popper.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/vendor/tilt/tilt.jquery.min.js"></script>
	<script>
		$('.js-tilt').tilt({
			scale : 1.1
		})
	</script>
	<!--===============================================================================================-->
	<script
		src="${pageContext.request.contextPath}/resources/Login_v1/js/main.js"></script>


</body>
</html>