<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>getProductList.jsp</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<style>
 body {
       font: 400 15px Lato, sans-serif;
      line-height: 1.8;
      color: #818181;
  }
  h2 {
      font-size: 24px;
      text-transform: uppercase;
      color: #303030;
      font-weight: 600;
      margin-bottom: 30px;
  }
  h4 {
      font-size: 19px;
      line-height: 1.375em;
      color: #303030;
      font-weight: 400;
      margin-bottom: 30px;
  }  
</style>
</head>
<body>

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


	<h2 class="text-center">Come!&nbsp;&nbsp;Look!&nbsp;&nbsp;Buy!</h2>
	<div style="text-align: right">
		<a href="${pageContext.request.contextPath}/productInsert"> <input
			type="button" value="상품추가"></a>
	</div>
	<br>
	<br>
	
	<div class="container">
		<div class="text-center"></div>
		<div class="row">
			<div class="col-sm-12 padding-right">
				<div class="features_items">
					features_items
					<h2 class="title text-center">Features Items</h2>
					<c:forEach items="${productList}" var="product">
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center" id="test">
										<a href="${pageContext.request.contextPath}/getProduct/${product.pNo}">${product.image}</a><br>
										${product.price}원<br> 
										<a href="#"	class="btn btn-default add-to-cart">
										<i class="fa fa-shopping-cart"></i>Add to cart</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2>${product.price}원</h2><br> 
											<a href="${pageContext.request.contextPath}/getProduct/${product.pNo}"><h2>${product.pName}</h2></a><br>
											<a href="#"	class="btn btn-default add-to-cart">
											<i class="fa fa-shopping-cart"></i>Add to cart</a> 
										</div>
									</div>
								</div>
								<div class="choose">
									<a href="${pageContext.request.contextPath}/getProduct/${product.pNo}" style="text-align: center;"><h3>${product.pName}</h3></a><br>
									<a href="./productUpdate?pNo=${product.pNo}">수정</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>


</body>
</html>