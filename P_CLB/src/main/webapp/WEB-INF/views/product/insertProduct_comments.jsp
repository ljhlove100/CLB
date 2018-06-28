<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>insertProduct_comments.jsp</title>
<script src="./ckeditor_4/ckeditor.js"></script>
</head>
<body>
	<form action="./insertProduct_comments" method="post" name="product_commentsForm" enctype="multipart/form-data" onsubmit="return submitCheck()">
		제목<input type="text" name="c_title"><br>
		작성자<input type="text" name="c_name"><br>
		내용<textarea name="c_contents" id ="c_contents"></textarea><br>
		상품번호<input type="text" name="p_no"><br>
		수정자<input type="text" name="insertid"><br>
		수정일<input type="text" name="insertdate"><br>
		첨부파일<input type="file" name="tempuploadfile"><br>
		
		<input type="submit" value="등록" />
	</form>
	<script>
		CKEDITOR.replace("content", {
			filebrowserUploadUrl : "${pageContext.request.contextPath}/fileUpload.jsp"
		});
		
		function submitCheck() {
			if(document.boardForm.writer.value =="") {
				alert("작성자를 입력해주세요");
				document.product_commentsForm.writer.focus();
				return false;
			}
			
			if(document.boardForm.title.value == "") {
				alter("제목을 입력해주세요");
				document.product_commentsForm.title.focus();
				return false;
			}
			var editor_data = CKEDITOR.instances.content.getData();
			if(editor_data == "") {
				alert("내용을 입력해주세요");
				document.boardForm.content.focus();
				return false;
			}
			return true;
		}
	</script>
</body>
</html>