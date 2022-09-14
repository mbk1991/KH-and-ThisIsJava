<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>

<!-- include libraries(jQuery, bootstrap) -->
<!-- <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet"> -->
<!-- <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script> -->
<!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->

<!-- <!-- include summernote css/js --> -->
<!-- <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet"> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script> -->



</head>
<body>

<script>
		$(document).ready(function() {
	 		 $('#summernote').summernote();
		});
</script>


	<h1 align="center">게시글 등록 페이지</h1>
	<br><br>
	<form action="/board/register.kh" method="post" enctype="multipart/form-data">
		<table align="center" border="1">
			<tr>
				<td>제목</td>
				<td><input type="text" name="boardTitle"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="boardWriter" readonly value="${loginUser.memberName }"></td>
			</tr>
			<tr>
				<td>내용</td>
<!-- 				<td><textarea name="boardContents"></textarea></td> -->
				<td>
					<textarea id="summernote" cols ="30" rows="50" name="boardContents" style="width:100%; height:250px;">
					</textarea>
				</td>

				
			</tr>
			<tr>
				<td>첨부파일</td>
				<td><input type="file" name="uploadFile"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록">
					<input type="reset" value="취소">
				</td>
<!-- 				<td></td> -->
			</tr>
		</table>
	</form>
</body>
</html>