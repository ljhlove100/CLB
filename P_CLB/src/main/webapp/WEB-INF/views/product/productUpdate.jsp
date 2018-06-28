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
<div style="background-color:black"><font color="white" size="20px">상품 수정 하기</font></div>
<div style="border: 1px double black; padding: 30px; margin: 30px;">
<form name="boardForm" action="./productUpdate" method="post">
${product.image}<br><br>
상품명 : <input type="text" name="pName" size="8px;" value="${sessionScope.product.pName}"><br><br>
상품설명 : <input type="text" name="pContents" size="30px;" value="${product.pContents}"><br><br>
상품가격 : <input type="text" name="price" size="6px;" value="${product.price}">원<br><br>
상품사진 <textarea name="image" id="image"></textarea><br>
<input type="submit" value="수정">
</form>
</div>
</center>

<script>
	CKEDITOR.replace("image" , {
		filebrowserUploadUrl : 
				"${pageContext.request.contextPath}/fileUpload.jsp"
	});
	
	function submitCheck(){
		if(document.boardForm.pName.value == ""){
			alert("상품명 등록하이소");
			document.boardForm.pName.focus();
			return false;
		}
		if(document.boardForm.pContents.value == ""){
			alert("상품설명 등록하이소");
			document.boardForm.pContents.focus();
			return false;
		}
		if(document.boardForm.price.value == ""){
			alert("가격 등록하이소");
			document.boardForm.price.focus();
			return false;
		}
		var editor_data = CKEDITOR.instances.image.getData();
		if(editor_data == ""){
			alert("사진 등록하이소");
			document.boardForm.image.focus();
			return false;
		}
		return true;
	}
	
</script>
</body>
</html>