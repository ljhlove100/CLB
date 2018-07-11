<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="./ckeditor_4/ckeditor.js"></script>
<title>Insert title here</title>
</head>
<body>
<center>
<div style="background-color:red"><font color="white" size="20px">상품 수정 하기</font></div>
<div style="border: 1px double black; padding: 30px; margin: 30px;">
<form name="boardForm" action="./productUpdate" method="post">
<input type="hidden" name="pNo" value="${product.pNo}">
${product.image}<br><br>
<h3>상품분류</h3>
  <select name="pGroup">
  		 <option>A(액자),&nbsp;B(포토북),&nbsp;C(현수막),&nbsp;D(명함)</option>
         <option>A</option>
         <option>B</option>
         <option>C</option>
         <option>D</option>
  </select><br><br>
상품명 : <input type="text" name="pName" size="8px;" value="${product.pName}"><br><br>
상품가격 : <input type="text" name="price" size="6px;" value="${product.price}">원<br><br>
상품설명 <textarea name="pContents" id="pContents" >${product.pContents}</textarea><br>
<input type="submit" value="수정">
</form>
</div>
</center>

<script>
	CKEDITOR.replace("pContents" , {
		filebrowserUploadUrl : 
				"${pageContext.request.contextPath}/fileUpload.jsp"
	});
	
	function submitCheck(){
		if(document.boardForm.pName.value == ""){
			alert("상품명 등록하이소");
			document.boardForm.pName.focus();
			return false;
		}
		if(document.boardForm.price.value == ""){
			alert("가격 등록하이소");
			document.boardForm.price.focus();
			return false;
		}
		var editor_data = CKEDITOR.instances.pContents.getData();
		if(editor_data == ""){
			alert("설명 등록하이소");
			document.boardForm.pContents.focus();
			return false;
		}
		return true;
	}
	
</script>
</body>
</html>