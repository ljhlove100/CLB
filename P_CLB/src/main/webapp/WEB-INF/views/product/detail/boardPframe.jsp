
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<title>test</title>
<head>
<style>
 div {display:inline-block;}
</style>
</head>
<script src="../resources/script/jquery-3.2.1.min.js"></script>

<body>
	<script>
		function goo() {
					
			var value1 = 0;
			var value2 = 0;
			var value3 = 0;
			
			
			
			for(i=0; i< document.frm.radio1.length;i++){
				if(document.frm.radio1[i].checked)
				value1 = document.frm.radio1[i].value;
			}
			
			for(i=0; i< document.frm.radio2.length;i++){
				if(document.frm.radio2[i].checked)
				value2 = document.frm.radio2[i].value;
			}
			
			for(i=0; i< document.frm.radio3.length;i++){
				if(document.frm.radio3[i].checked)
				value3 = document.frm.radio2[i].value;
			}
			
			
						
			document.frm.total_amtt.value = fncComma(eval(value1)+eval(value2)+eval(value3));
			document.frm.total_amt.value = eval(value1)+eval(value2)+eval(value3);
		}
		
		// 3자리마다 콤마찍기
	      function fncComma(intNum) {
	      if(isNaN(intNum) || intNum.length==0) return "";
	       
	      var sRetVal = "";
	      var sTmpVal = "";
	      var sFractionVal = "";
	       
	      intNum = intNum.toString();
	      intNum = intNum.replace(/,/g,"");
	       
	      var lLengh = intNum.search(/\./);
	       
	      if (lLengh<0) lLengh = intNum.length;
	      else sFractionVal = intNum.substr(lLengh);
	       
	      lLengh = lLengh;
	      var lRemainder = lLengh % 3;
	       
	      if (lRemainder == 0 && lLengh > 0) lRemainder = 3;
	      sRetVal = intNum.substr(0,lRemainder);
	       
	      while(lRemainder < lLengh) {
	      sTmpVal = sTmpVal + "," + intNum.substr(lRemainder,3);
	      lRemainder += 3;
	      }
	      sRetVal = sRetVal + sTmpVal + sFractionVal;
	      return sRetVal;
	      }
		
	</script>
	<img src="../resources/images/pframe/board.JPG">
	<center>
	<div>
	<h3>상품 정보</h3>
	<h4>${product.pName}</h4><br>
	<h5>${product.pContents}</h5><br>
	${product.image}
	
	</div>
	<div style="border: 1px solid black; padding: 30px; margin: 30px;">
	<form name = "frm">
	
				<h4>Size</h4>
				<label>size - 1<input type="radio" name="radio1" value=3000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>size - 2<input type="radio" name="radio1" value=7000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>size - 3<input type="radio" name="radio1" value=8000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>size - 4<input type="radio" name="radio1" value=9000 onclick="goo()"> <span class="checkmark"></span>
				</label><br><br>
				
				<h4>Color</h4>
				<label>color - 1<input type="radio" name="radio2" value=4000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>color - 2<input type="radio" name="radio2" value=5000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>color - 3<input type="radio" name="radio2" value=6000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>color - 4<input type="radio" name="radio2" value=7000 onclick="goo()"> <span class="checkmark"></span>
				</label><br><br>
				
				<h4>Style</h4>
				<label>style - 1<input type="radio" name="radio3" value=7000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>style - 2<input type="radio" name="radio3" value=8000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>style - 3<input type="radio" name="radio3" value=9000 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<label>style - 4<input type="radio" name="radio3" value=7500 onclick="goo()"> <span class="checkmark"></span>
				</label>
				<br> <br>
				<input TYPE="hidden" name="p_no" value="${p_no}">
				<input type="hidden" name="p_name" value="${p_name}">
				
				<input TYPE="hidden" name="total_amt" style="border:0" readonly>
				합계 : <input TYPE="text" name="total_amtt" style="border:0" readonly>
					  <input type="hidden" name="action" value="payment">
				<br>
				<button type="submit">구매하기</button>
				
	</form>
	</div>
	</center>
	
	
</body>
</html>