<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<script src="${pageContext.request.contextPath}/resources/scripts/jquery-3.2.1.min.js"></script>
<script>
$(function(){
	function getCommentsList(){
		var requestData = {"boardSeq": "${board.seq}"}
		
		$.ajax({
			url:"../getCommentsList",
			data:requestData,
			dataType:'json',
			success:function(data){
				for(i=0;i<data.length;i++){
					var html = '<div style="border:1px solid blue;" class="article" id="'+data[i].SEQ+'">'
								+data[i].SEQ+' '+data[i].NAME+' '+data[i].CONTENT+'</div>';
					$("#commentsList").append(html);
				}
			}
		})
	};
	
	getCommentsList();
	//$(window).bind("load",getCommentsList);
	
	
	$("#btnCommentAdd").click(function(){
		var requestData = {"name":$("[name=name]").val(), "content":$("[name=content]").val(), boardSeq:"${board.seq}"};
		$.ajax({
			url:"../insertComments",
			data:requestData,
			dataType:'json',
			success:function(data){
				var html = '<div style="border:1px solid blue;" class="article" id="'+data.seq+'">'
					+data.seq+' '+data.name+' '+data.content+'</div>';
				$("#commentsList").prepend(html);
				document.getElementById("name").value="";
				$("[name=content]").val("");
			}
		})
	});

})

</script>
</head>
<body>
${UsersVO}
	<h3>게시글정보조회mybatis</h3>
	<a href="../getUsersList">게시판목록보기</a>
	<br> ${board}<hr>
	<br> 순번: ${vo.seq}
	<br> 제목: ${vo.title}
	<br> 작성자: ${vo.writer}
	<br> 내용: ${vo.content}
	<br> 등록일: ${vo.regDate}
	<br> 첨부파일:<a href="downloadbard?seq=${vo.seq }">${vo.uplad_file }
	<hr><a href="../updateBoard">수정</a><br>
	<hr>
	게시판답글<hr>
	<div style="border:1px solid green">
		<form id="commentFrm">
			<input name="name" id="name" size="10">
			<input name="content" id="content" size="50">
			<input type="button" id="btnCommentAdd" value="댓글등록"/>
		</form>
	</div><br>
	<div id="commentsList"></div>
</body>
</html>
