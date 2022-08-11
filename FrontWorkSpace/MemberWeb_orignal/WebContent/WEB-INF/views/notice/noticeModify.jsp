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
		<input type="text" name="subject" value="${notice.subject }">
		<textarea rows="30" cols="90" name="contents">${notice.contents }</textarea><br><br>
		<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
<!-- 		UPDATE NOTICE_TBL SET SUBJECT = '', CONTENTS = '' WHERE NOTICE_NO = 22; -->
		<input type="submit" value="수정완료">
		<input type="reset" value="취소">
	</form>
</body>
</html>