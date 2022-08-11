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
		<c:if test="${sessionScope.memberId == null }">
			<div id="login-wrap">
				<form action="/login.do">
					<fieldset>
						<legend>로그인</legend>
						<input type="text" name="id"><br>
						<input type="password" name="pwd"><br>
						<input type="submit" value="로그인">
					</fieldset>
				</form>
			</div>
		</c:if>
		<c:if test="${sessionScope.memberId != null }">
			<div id="mymenu-wrap">
				${sessionScope.memberId }님 환영합니다.	
				<ul>
					<li><a href="/view/memberpage.jsp">마이페이지</a></li>
					<c:if test="${sessionScope.adminCheck != null }">
						<li><a href="/view/adminpage.jsp">관리자페이지</a></li>
					</c:if>
				</ul>
			</div>
		</c:if>
		<hr>
	</div>
	<div class="main-footer">
		<ul>
			<li><a href="/view/enroll.jsp">회원가입</a></li>
			<li><a href="/view/allMemberList.jsp">전체회원조회</a></li>
		</ul>
	</div>
</body>
</html>