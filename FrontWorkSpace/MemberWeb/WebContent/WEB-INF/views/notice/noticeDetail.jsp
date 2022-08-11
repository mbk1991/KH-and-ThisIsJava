<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<body>
	<h2>제목 : ${notice.subject }</h2>
 	<h6>글번호 : ${notice.noticeNo } / 글쓴이 : ${notice.memberId } / 작성일 : ${notice.regDate } </h6><br>
 	<hr>
 	<h3>글내용</h3>
 	<div>
 		${notice.contents }
 	</div>
 	<a href="/notice/modify.do?noticeNo=${notice.noticeNo }">수정 페이지 이동</a>
 	<a href="/notice/delete.do?noticeNo=${notice.noticeNo }">게시글 삭제</a>
		<form action="/notice/delete.do" method="post">
			<input type="hidden" name="noticeNo" value=${notice.noticeNo }>
			<input type="submit" value="게시글 삭제">
		</form>
	<div id="footer">
		<hr>
		<ul>
			<li><a href="/index.jsp">메인으로</a></li>
		</ul>
	</div>
</body>
</html>