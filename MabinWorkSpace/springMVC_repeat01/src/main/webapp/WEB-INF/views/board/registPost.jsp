<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
	<h1>글 작성</h1><hr><br>
	<form action="/board/registPost.kh" method="post" enctype="multipart/form-data">
		<table align="center" border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="boardTitle">
				</td>
			</tr>
			<tr>
				<td colspan="2">내용</td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea name="boardContents" rows="20" cols="40">
					</textarea>
				</td>
			</tr>
			<tr>
				<td>파일첨부</td>
				<td>
					<input type="file" name="uploadFile">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button>저장하기</button>
					<button type="reset">취소하기</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>