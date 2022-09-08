<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
	<h1 align="center" >게시글 목록</h1>
	<br><br>
	<table align="center" border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>첨부파일</th>
		</tr>
		
		<c:forEach items="${bList }" var="board" varStatus="i">
		<tr>
			<td>${i.count }</td>
			<td>${board.boardTitle }</td>
			<td>${board.boardWriter }</td>
			<td>${board.bCreateDate }</td>
			<td>${board.boardCount }</td>
			<td>0</td>
		</tr>
		</c:forEach>
		<tr align="center" height="20">
			<td colspan="6">
				<a href="board/list.kh?page=1">1</a> 
				<a href="board/list.kh?page=2">2</a>
				<a href="board/list.kh?page=3">3</a>
				<a href="board/list.kh?page=4">4</a>
				<a href="board/list.kh?page=5">5</a>
				<a href="board/list.kh?page=6">6</a>
			</td>
		</tr> 
		
		
	</table>


</body>
</html>
