<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
	<h1 align="center">${board.boardNo }번 게시물 수정하기</h1>
	<br><br>
	<form action="#" method="post">
		<table align="center" width="500" border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="boardTitle" value="${board.boardTitle }"></input>
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" name="boardWriter" readonly value="${board.boardWriter }"></input>
				</td>
			</tr>
			<tr height="300">
				<td>내용</td>
				<td><textarea cols="30" name="boardContents">${board.boardContents }</textarea><td>
			</tr>
			<tr>
				<td>첨부파일</td>
				<td>
					<input type="file" name="reloadFile">
					<a href="#">${board.boardFilename }</a>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button onclick="/board/modifyView.kh?boardNo=${board.boardNo}">수정</button>
				</td>
<!-- 				<td></td> -->
			</tr>
		</table>
	</form>
<!-- 댓글 등록 -->
	<table>
	
	</table>

<!-- 댓글 목록 -->
		
		
		
		<script>
			function deleteBoard(){
// 				event.preventDefault(); //하이퍼링크이동방지
				if(window.confirm("정말 삭제하시겠습니까")){
					location.href="/board/remove.kh";
				}
			}
		</script>
		
</body>
</html>