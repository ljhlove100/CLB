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
		title : '월별 판매수량',
		width : 800,
		height : 600,
		colors: ['#e0440e']
	};
	google.load('visualization', '1.0', {'packages' : [ 'corechart' ]});
	google.setOnLoadCallback(function() {
		
		var chart_data = [['월별','매출']];
		
		//data(ajax)
		$.ajax({
			url : "${pageContext.request.contextPath}/payment/getPayCnt2",
			dataType : 'json',
			success : function(res_data){
					for(i=0;i<res_data.length;i++){
						var pMonth = res_data[i].pMonth;
						var sum = res_data[i].pSum;
						var temp = [pMonth, sum];
						chart_data.push(temp); 
					}	
					
					var chart = new google.visualization.LineChart(
							document.querySelector('#chart_div'));
					chart.draw(google.visualization.arrayToDataTable(chart_data), options);
			}
		});
	});
</script>

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
</style><style>
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
<form>
<div style="background-color:red; text-align: center;"><font color="white" size="10px;">월별 매출현황</font></div>
	<div style="text-align: center; padding: 80px;" class="col-sm-5">
	<table border="1">
		<thead>
			<th>월(Month)</th>
			<th>월별 물품판매 수량</th>
			<th>매출 금액</th>
		</thead>
	<c:forEach items="${paymentList3}" var="payment3">
			<tr>
			<td>${payment3.pMonth}</td>
			<td>${payment3.pCount}</td>
			<td>${payment3.pSum}</td>
		</tr>
	</c:forEach>
	</table>
	</div>
	
	<div id="chart_div" class="col-sm-7"></div>
	</form>
	<center>
	<a href="${pageContext.request.contextPath}/getPaymentList4">
	<button>일별 매출현황 보기</button></a>
	</center>
</body>
</html>