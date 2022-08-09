<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
</head>
<body>
	<div class="admin-header">
		<h1>관리자 페이지</h1>
		<hr>
	</div>
	<div class="admin-contents">
		<ul>
			<li><a href="/alllist.do">회원 전체 조회</a></li>
		</ul>
		<hr>
	</div>
	<div class="admin-footer">
		<ul>
			<li><a href="/index.jsp">메인으로</a></li>
			<li><a href="/logout.do">로그아웃</a></li>
		</ul>
	</div>
</body>
</html>