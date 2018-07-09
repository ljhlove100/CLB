<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>

<!-- <script>
function onKeyDown()
{
     if(event.keyCode == 13)
     {
    	 search_box();//TODO : 실행시킬 코드
     }
}

</script> -->


<header id="header">
		<!--header-->
		<div class="header_top">
			<!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href="#"><i class="fa fa-phone"></i>
										053-777-7777</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i>
										ljhlove100@gmail.com</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul>
								<li><a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a></li>
								<li><a href="https://twitter.com/"><i class="fa fa-twitter"></i></a></li>
								<li><a href="https://www.linkedin.com/"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="https://www.instagram.com/"><i class="fa fa-instagram"></i></a></li>
								<li><a href="https://plus.google.com/"><i class="fa fa-google-plus"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/header_top-->

		<div class="header-middle">
			<!--header-middle-->
			<div class="container">
				<div class="row">
				<div class="col-sm-4">
					<div class="logo pull-left">
						<a href="home">
						<img src="${pageContext.request.contextPath}/resources/images/home/clb-logo.png"
								 alt="" width="300px" height="75px" /></a>
					</div>

				</div>
				<div class="col-sm-8">
					<div class="shop-menu pull-right">
						<ul>
							<li><a href="account"><i class="fa fa-user"></i> Account</a></li>
							<li><a href="Board"><i class="fa fa-star"></i>Board</a></li>
							<!-- <li><a href="checkout.html"><i class="fa fa-crosshairs"></i>Checkout</a></li> -->
							<li><a href="listCart"><i class="fa fa-shopping-cart"></i>Cart</a></li>
							
							<c:if test="${empty sessionScope.u_id }">
							<li><a href="login"><i class="fa fa-lock"></i> Login</a></li>
							</c:if>
							
							<c:if test="${!empty sessionScope.u_id}">
								<li><a href="LogOut"><i class="fa fa-lock">${sessionScope.u_id.name}</i>님</a></li>
								<li><a href="profile"><i class="fa fa-heart-o">회원정보수정</i></a>
							</c:if>

						</ul>
					</div>
				</div>
			</div>
			</div>
		</div>
		<!--/header-middle-->

		<div class="header-bottom">
			<!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								
								<li><a href="${pageContext.request.contextPath}/getProductList" class="active">Home</a></li>
								<li><a href="${pageContext.request.contextPath}/getProductList?pGroup=D" >명함</a></li>
								<li><a href="${pageContext.request.contextPath}/getProductList?pGroup=A">액자</a></li>
								<li><a href="${pageContext.request.contextPath}/getProductList?pGroup=B" >포토북</a></li>
								<li><a href="${pageContext.request.contextPath}/getProductList?pGroup=C" >현수막</a></li>
								<c:if test="${sessionScope.u_id.yn == 'Y'}">
								<li><a href="${pageContext.request.contextPath}/getPaymentList" >주문내역 현황</a></li>
								<li><a href="${pageContext.request.contextPath}/getPaymentList3">월/일별 매출현황</a></li>
								</c:if>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
							<input type="text"  placeholder="Search" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/header-bottom-->
	</header>
	<!--/header-->
	<!-- 메인 메뉴판 -->
	<section id="slider">
		
	</section>