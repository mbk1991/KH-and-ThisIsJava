<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
	<h1>공지사항</h1>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${nList }" var="notice" varStatus="i">
			<tr>
				<td>${notice.noticeNo }</td>
<!-- 				어떻게 하면 내림차순으로 나오게 할 수 있을까? -->
<%-- 				<td>${notice.noticeNo }</td> --%>
				<td><a href="/notice/detail.do?noticeNo=${notice.noticeNo }">${notice.subject }</a></td>
				<td>${notice.memberId }</td>
<!-- 				데이터가 없으면 익명으로 표시할 수 있을까? -->
				<td>${notice.regDate }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4">
				${pageNavi }
			</td>
		</tr>
	</table>
</body>
</html>