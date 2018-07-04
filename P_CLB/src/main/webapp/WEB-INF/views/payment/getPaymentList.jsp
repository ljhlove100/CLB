<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="//www.google.com/jsapi"></script>
<script src="${pageContext.request.contextPath}/resources/script/jquery-3.2.1.min.js"> </script>

<script>
	
	
	var options = {
		title : '상품별 판매수량',
		width : 800,
		height : 600,
		colors: ['#e0440e']
	};
	google.load('visualization', '1.0', {'packages' : [ 'corechart' ]});
	google.setOnLoadCallback(function() {
		
		var chart_data = [['상품','판매수']];
		
		//data(ajax)
		$.ajax({
			url : "${pageContext.request.contextPath}/payment/getPayCnt",
			dataType : 'json',
			success : function(res_data){
					for(i=0;i<res_data.length;i++){
						var pName = res_data[i].P_NAME;
						var cnt = res_data[i].pCount;
						var temp = [pName, cnt];
						chart_data.push(temp); 
					}	
					
					var chart = new google.visualization.ColumnChart(
							document.querySelector('#chart_div'));
					chart.draw(google.visualization.arrayToDataTable(chart_data), options);
			}
		});
	});
</script>

</head>
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

<body>
<form>
<div style="background-color:black; text-align: center;"><font color="white" size="10px;">상품별 주문 내역</font></div>
	<div style="text-align: center; padding: 80px;" class="col-sm-5">
	<table border="1">
		<thead>
			<th>주문 상품명</th>
			<th>주문 상품수량</th>
			<th>주문 총 가격</th>
		</thead>
	<c:forEach items="${paymentList}" var="payment">
			<tr>
			<td>${payment.pName}</td>
			<td>${payment.pCount}</td>
			<td>${payment.pSum}원</td>
		</tr>
	</c:forEach>
	</table>
	</div>
	
	<div id="chart_div" class="col-sm-7"></div>
	</form>
	<center>
	<a href="${pageContext.request.contextPath}/getPaymentList2">
	<button>주문내역 상세 보기</button>	</a>
	<a href="${pageContext.request.contextPath}/getPaymentList3">
	<button>월별</button>	</a>
	<a href="${pageContext.request.contextPath}/getPaymentList4">
	<button>일별</button>	</a>
	</center>
</body>
</html>