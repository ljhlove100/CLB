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
		title : '일별 판매수량',
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
<div style="background-color:black; text-align: center;"><font color="white" size="10px;">월별 매출 내역</font></div>
	<div id="chart_div" class="col-sm-8"></div>
	<div style="text-align: center; padding: 60px;" class="col-sm-4">
	<table border="1">
		<thead>
			<th>월(Month)</th>
			<th>월 판매수량</th>
			<th>월 매출</th>
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
	<div></div>
</body>
</html>