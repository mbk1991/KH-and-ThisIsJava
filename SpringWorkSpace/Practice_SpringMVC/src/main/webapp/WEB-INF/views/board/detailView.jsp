<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
</head>
<body>
	<h1 align="center">${board.boardNo }번 게시물 상세 보기</h1>
	<br><br>
		<table align="center" width="500" border="1">
			<tr>
				<td>제목</td>
				<td>
					${board.boardTitle }
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>
					${board.boardWriter }
				</td>
			</tr>
				<tr>
				<td>작성날짜</td>
				<td>
					${board.bCreateDate }
				</td>
			</tr>
				<tr>
				<td>조회수</td>
				<td>
					${board.boardCount }
				</td>
			</tr>
			<tr height="300">
				<td>내용</td>
				<td>
					${board.boardContents }
					<c:if test="${board.boardFileRename ne null }">
						<img alt="본문이미지" src="/resources/buploadFiles/${board.boardFileRename }"
						width="80%" height="50%">
					</c:if>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button onclick="location.href='/board/modifyView.kh?boardNo=${board.boardNo}';">수정</button>
					<button onclick="deleteBoard();">삭제하기</button>
				</td>
<!-- 				<td></td> -->
			</tr>
		</table>
<!-- 댓글 등록 -->
	<form action="/board/addReply.kh" method="post">
	<input type="hidden" name="refBoardNo" value="${board.boardNo}">
	<table align="center" width="500" border="1">
		<tr>
			<td>
				<textarea name="replyContents" row="3" cols="55"></textarea>
			</td>
			<td>
				<button>등록하기</button>
			</td>
		</tr>
	</table>
	</form>
<!-- 댓글 목록 -->
	<table align="center" width="500" border="1">
	<c:forEach items="${rList}" var="reply" >
		<tr>
			<td width="100">${reply.replyWriter }</td>
			<td>${reply.replyContents}</td>
			<td>${reply.rUpdateDate }</td>
			<td>
				<a href="#" onclick="modifyView(this,'${reply.replyContents}',${reply.replyNo });">수정</a>
				<a href="#" onclick="removeReply(${reply.replyNo});">삭제</a>
			</td>
		</tr>
	</c:forEach>
	</table>		
		
		
		<script>
			function deleteBoard(){
// 				event.preventDefault(); //하이퍼링크이동방지
				if(window.confirm("정말 삭제하시겠습니까")){
					location.href="/board/remove.kh";
				}
			}
			function removeReply(replyNo){
				event.preventDefault();
				console.log(replyNo);
				if(confirm("정말 삭제하시겠습니까?")){
					var $delForm = $("<form>");
					$delForm.attr("action","/board/removeReply.kh ");
					$delForm.attr("method","POST");
					$delForm.append("<input type='hidden' name='replyNo' value='"+replyNo+"'>");
					$delForm.appendTo("body");
					$delForm.submit();
					
					console.log("확인");
				}
			}
			
			
			function modifyView(obj,replyContents,replyNo){
				alert("ddd");
				event.preventDefault();
				var $tr = $("<tr>");
				$tr.append("<td colspan='3'><input type='text' size='50' value='"+replyContents+"'></td>");
				$tr.append("<td><button onclick='modifyReply("+replyNo+",this);'>수정</button></td>");
				console.log($tr[0]);
				console.log(obj);
				$(obj).parent().parent().after($tr);
			}
			
			function modifyReply(rNo,obj){
				var inputTag = $(obj).parent().siblings().eq(0).children();
				console.log("inputTag" + inputTag);
// 				var inputTag = $(obj).parent().prev().children();
// 				var replyContents = $("#modifyInput").val();
				var replyContents = inputTag.val();
				console.log(replyContents);
				console.log(rNo);
				
				var $form = $("<form>");
				$form.attr("action","/board/modifyReply.kh");
				$form.attr("method","post");
				console.log($form);
				$form.append("<input type='hidden' value='"+replyContents+"' name='replyContents'>");
				$form.append("<input type='hidden' value='"+rNo+"' name='replyNo'>")
				console.log($form[0]);
				$form.appendTo("body");
				$form.submit();
			}
		</script>
		
</body>
</html>