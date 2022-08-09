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
		<div id=login-wrap>
			<form action="">
				<fieldset>
					<legend>로그인</legend>
					<input type="text" name="id"><br>
					<input type="password" name="pwd"><br>
					<input type="submit" value="로그인">
				</fieldset>
			</form>
		</div>
	</div>
	<div class="main-footer">
		<ul>
			<li><a href="/view/enroll.jsp">회원가입</a></li>
			<li><a href="/view/allMemberList.jsp">전체회원조회</a></li>
		</ul>
	</div>
</body>
</html>