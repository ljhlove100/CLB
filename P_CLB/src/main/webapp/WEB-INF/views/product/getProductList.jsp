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
	<h2 class="text-center">Come!&nbsp;&nbsp;Look!&nbsp;&nbsp;Buy!</h2>
	<div style="text-align:right">
	<a href="${pageContext.request.contextPath}/productInsert">
	<input type="button" value="상품추가"></a>
	</div><br><br>
	<div id="pricing" class="container-fluid">
		<div class="text-center"></div>
		<div class="row ">
			<c:forEach items="${productList}" var="product">
				<div class="col-lg-4">
					<div style="display: inline-block">
						<div class="panel panel-default text-center">
							<div class="panel-heading">
								<a href="${pageContext.request.contextPath}/getProduct/${product.pNo}">${product.image}</a><br>
							</div>
							<div class="panel-footer">
								 ${product.pGroup}<br>
								 ${product.pName}<br>
								 ${product.pContents}<br> 
								 ${product.price}원<br>
								 <a href="./productUpdate?pNo=${product.pNo}">수정</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>