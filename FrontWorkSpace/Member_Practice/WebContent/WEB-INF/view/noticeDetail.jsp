<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글</title>
</head>
<body>
	<div id="detail-header">
		<h1>공지사항 상세보기</h1>
		<hr>
	</div>
	<div id="detail-contents">
		<h2>제목: ${notice.subject }</h2>
		<hr>
		<h4>글번호 : ${notice.noticeNo } 작성자 : ${notice.memberId } 작성시간 : ${notice.regDate }</h4>
		<hr>
		<div id="contents-wrap">
			${notice.contents }
		</div>
	</div>
	<div id="detail-footer"></div>


</body>
</html>