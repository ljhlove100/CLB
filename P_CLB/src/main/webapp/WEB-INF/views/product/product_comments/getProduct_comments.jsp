<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>getProduct_comments.jsp</title>
<script src="${pageContext.request.contextPath}/resources/scripts/jquery-3.2.1.min.js"></script>
<script>
$(function(){	
	// ajax 로 게시글 로딩
	function getCommentsList() {
		var requestData = {"boardSeq": "${board.seq}" };
		
		//json
		/* $.ajax({
			url : "../getCommentsList",
			data : requestData,
			dataType : 'json',
			success : function(data) {				
				for( i=0; i< data.length; i++) {
					var html = '<div class="article" id="'
								+ data[i].seq + '">'
								+ data[i].name 
								+ data[i].content
								+ '</div>';
					$("#commentList").append(html);	
				}
			}
		}); */
		
		//xml
		$.ajax({
			url : "../getCommentsXml",
			data : requestData,
			dataType : 'xml',
			success : function(data) {
				var commentList = $(data).find("comment");
				for( i=0; i< commentList.length; i++) {
					var name = $(commentList[i]).find("name").html();
					var content = $(commentList[i]).find("content").html();
					var seq = $(commentList[i]).attr("seq");
					var html = '<div class="article" id="'
								+ seq + '">'
								+ name
								+ content
								+ '</div>';
					$("#commentList").append(html);	
				}
			}
		});
		
	}
	
	//댓글등록
	$("#btnCommentAdd").click(function(){
		var requestData = {name:    $("[name=name]").val(), 
						   content: $("[name=content]").val(), 
						   boardSeq:"${board.seq}" };
/* 		requestData = $("#commentFrm").serialzie();
		requestData.boardSeq = "${board.seq}" ; */
		$.ajax({
			url : "../insertComments",
			data : requestData,
			dataType : 'json',
			success : function(data) {				
				var html = '<div class="article" id="'
							+ data.seq + '">'
							+ data.name &nbsp
							+ data.content
							+ '</div>';
				$("#commentList").append(html);	
			}
		});		
	});
	
	getCommentsList();
});
</script>
</head>
<body>
	등록 후 확인<br>
	${ vo }
	<hr>
		제목 : ${ product_comments.c_title } <br>
		작성자 : ${ product_comments.c_name } <br>
		리뷰내용 : ${ product_comments.c_contents } <br>
		상품코드 : ${ product_comments.p_no } <br>
		등록자ID : ${ product_comments.insertid } <br>
		등록일 : ${ product_comments.insertdate } <br>
		첨부파일 : <a href="downloadProduct_comments?pc_no=${vo.pc_no}">${vo.uploadfile}</a><br>
		
		<a href="../updateProduct_comments">수정</a>
</body>
</html>