<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>
	<h1>공지사항 수정</h1>
	<form action="/notice/modify.do" method="post">
		<input type="text" name="subject" value="${notice.subject }"><br>
		<textarea name="contents" rows="30" cols="90">${notice.contents }</textarea><br>
		<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
		<input type="submit" value="수정완료">
		<input type="reset" value="취소">
	</form>

</body>
</html>