<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
</head>
<body>
	<h3>로그인</h3>
	<form action="/member/enroll.do">
		<input type="text" id="id" placeholder="아이디"><br>
		<input type="password" id="pwd" placeholder="비밀번호">
		<input type="submit" value="로그인">
	</form>
	<hr>
	<ul>
		<li><a href="/member/enroll.html">회원가입</a></li>
		<li><a href="">회원조회</a></li>
	</ul>
</body>
</html>