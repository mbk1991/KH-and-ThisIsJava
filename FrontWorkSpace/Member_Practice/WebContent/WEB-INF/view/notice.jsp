<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 공지</title>
</head>
<body>
	<div id="notice-header">
		<h1>관리자 공지사항</h1>
		<hr>
	</div>
	<div id="notice-contents">
		<div id="board-wrap">
			<table border="1px">
				<thead>
					<tr>
						<th>글 번호</th>
						<th>글 제목</th>
						<th>작성자</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${nList }" var="notice" >
					<tr>
						<td>${notice.noticeNo }</td>
						<td><a href="/notice/detail.do?noticeNum=${notice.noticeNo }">${notice.subject }</a></td>
						<td>${notice.memberId }</td>
						<td>${notice.regDate }</td>
					</tr>
					</c:forEach>
				</tbody>
				<tfoot></tfoot>
			</table>		
		</div>
	</div>
	<div id="notice-footer">
		<div id="pagenavi">
		
			${currentPageStr }
<!-- 			<a href="/notice.do?currentPage=1">1</a>  -->
<!-- 			<a href="/notice.do?currentPage=2">2</a> -->
<!-- 			<a href="/notice.do?currentPage=3">3</a> -->
<!-- 			<a href="/notice.do?currentPage=4">4</a> -->
<!-- 			<a href="/notice.do?currentPage=5">5</a> -->
			
		</div>
	</div>

</body>
</html>
