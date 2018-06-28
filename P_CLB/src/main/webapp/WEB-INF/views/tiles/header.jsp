<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
							<a href="home"><img src="${pageContext.request.contextPath}/resources/images/home/Logo_1.png"
							alt="" width="300px" height="75px"/></a>
						</div>
					
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul>
								<li><a href="account"><i class="fa fa-user"></i> Account</a></li>
								<li><a href="Board"><i class="fa fa-star"></i>Board</a></li>
								<!-- <li><a href="checkout.html"><i class="fa fa-crosshairs"></i>Checkout</a></li> -->
								<li><a href="cart.html"><i class="fa fa-shopping-cart"></i>Cart</a></li>
								<li><a href="Login"><i class="fa fa-lock"></i>Login</a></li>
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
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
							<input type="text" placeholder="Search" />
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
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"
								class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>
										<span>Come !</span>-오이소 !
									</h1>
									<h2>New ! / 7월 10일 ~ 13일</h2>
									<p>여름 Hot 신상품을 Get ! 하세요~</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="${pageContext.request.contextPath}/resources/images/home/hot.jpg" 
										alt="hot" width="270px" height="270px"/> 
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Look !</span>-보이소 !
									</h1>
									<h2>100% 창의적 디자인</h2>
									<p>당신만의 스토리 있는 포토북을 만들어보세요</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="${pageContext.request.contextPath}/resources/images/home/potobook.jpg" 
										alt="" width="270px" height="270px"/> 
								</div>
							</div>

							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Buy !</span>-사이소 !
									</h1>
									<h2>싸다 싸 와이레 싸노</h2>
									<p>남들은 모르는 나만의 시크릿 쇼핑몰 CLB</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="${pageContext.request.contextPath}/resources/images/home/seacret.jpg" 
										alt="" width="270px" height="270px"/> 
								</div>
							</div>

						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section>