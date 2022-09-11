<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
</head>
<body>
	<div id="header">
		<h1>자유게시판</h1><hr><br>
	</div>
	<div id="contents">
		<table align="center" border="1">
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일자</td>
				<td>첨부파일</td>
				<td>조회수</td>
			</tr>
			<c:forEach items="${bList}" var="board" varStatus="i">
				<tr>
					<td>${board.boardNo }</td>
					<td>${board.boardTitle }</td>
					<td>${board.boardWriter }</td>
					<td>${board.createDate }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4">
					<c:if test="${naviStart>startPage }">
						<a href="/board/freeboardList.kh?page=${naviStart-1 }">[이전]</a>
					</c:if>
					<c:forEach begin="${naviStart }" var="i" end="${naviEnd }" >
						<a href="/board/freeboardList.kh?page=${i}">${i}</a>
					</c:forEach>
					<c:if test="${naviEnd<endPage }">
						<a href="/board/freeboardList.kh?page=${naviEnd+1 }">[다음]</a>
					</c:if>
				</td>
			</tr>
			
		</table>	
	</div>
	<div id="footer">
		<button onclick="location.href='/board/registpostView.kh';">작성하기</button>
	</div>
</body>
</html>