<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 프로그램</title>
</head>
<body>
	<div class="main-header">
		<h1>메인 페이지</h1>
		<hr>
	</div>
	<div class="main-contents">
		<c:if test="${sessionScope.id == null }">
			<div id="login-wrap">
				<form action="/login.do" method="post">
					<fieldset>
						<legend>로그인</legend>
						<input type="text" name="id"><br>
						<input type="password" name="pwd"><br>
						<input type="submit" value="로그인">
					</fieldset>
				</form>
			</div>
		</c:if>
		<c:if test="${sessionScope.id != null }">
			<div id="mymenu-wrap">
				${sessionScope.id }님 환영합니다.	
				<ul>
					<li><a href="/mypage.do">마이페이지</a></li>
					<li><a href="/logout.do">로그아웃</a>
					<c:if test="${sessionScope.adminCheck == 'Y' }">
						<li><a href="/admin.do">관리자페이지</a></li>
					</c:if>
				</ul>
			</div>
		</c:if>
		<hr>
	</div>
	<div class="main-footer">
		<ul>
			<li><a href="/enroll.do">회원가입</a></li>
			<li><a href="/alllist.do">전체회원조회</a></li>
		</ul>
	</div>
</body>
</html>