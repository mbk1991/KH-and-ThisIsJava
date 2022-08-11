<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
	<h1>공지사항</h1>
	<table border="1" >
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
		</tr>
		
		<c:forEach items="${nList }" var="notice"  varStatus="i">
		<tr>
			<!--${i.count} 로 할 수도 있다. -->
<!-- 			최신 글 순으로 정렬 시 순번 내림차순 고민  -->
			<td>${notice.noticeNo }</td>
			<td><a href="/notice/detail.do?noticeNo=${notice.noticeNo}">${notice.subject }</a></td>
<!-- 			데이터가 없으면 익명으로 처리하는 방법 고민 -->
			<td>${notice.memberId }</td>
			<td>${notice.regDate }</td>
		</tr>
		 </c:forEach>
		 <tr>
		 	<td colspan="4">
		 		<a href="/notice/list.do?currentPage=1">1</a> <a href="/notice/list.do?currentPage=2">2</a> <a href="/notice/list.do?currentPage=3">3</a> <a href="/notice/list.do?currentPage=4">4</a> <a href="/notice/list.do=currentPage=5">5</a> <a href="/notice/list.do=currntPage=6">다음</a>
		 	</td>
		 </tr>
	</table>
	
		<div id="footer">
		<hr>
		<ul>
			<li><a href="/index.jsp">메인으로</a></li>
		</ul>
	</div>
</body>
</html>