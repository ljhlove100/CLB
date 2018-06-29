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
<div style="background-color:black"><font color="white" size="20px">상품 추가 하기</font></div>
<div style="border: 1px double black; padding: 30px; margin: 50px;">
<form name="boardForm" action="./productInsert" method="post" enctype="multipart/form-data" onsubmit="return submitCheck()">
<h3>상품분류</h3>
  <select name="pGroup">
  		 <option>A(액자),&nbsp;B(포토북),&nbsp;C(현수막),&nbsp;D(명함)</option>
         <option>A</option>
         <option>B</option>
         <option>C</option>
         <option>D</option>
  </select><br><br>
상품이름 : <input type="text" name="pName" size="10px;">
상품가격 : <input type="text" name="price" size="10px;"><br>
상품사진 : <input type="file" name="tempuploadfile"><br>
상품설명 <textarea name="pContents" id="pContents"></textarea><br>

<input type="submit" value="등록">
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