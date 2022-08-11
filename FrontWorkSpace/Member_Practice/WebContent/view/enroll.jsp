<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
</head>
<body>
	<div class="enroll-header">
		<h1>회원 가입 페이지</h1>
		<hr>
	</div>
	<div class="enroll-contents">
		<div id="enroll-wrap">
			<form action="/enroll.do" method="post">
				아이디<br><input type="text" name="id" placeholder="아이디"><br>
				비밀번호<br><input type="password" name="pwd" placeholder="비밀번호"><br>
				이름<br><input type="text" name="name" placeholder="이름"><br>
				전화번호<br><input type="text" name="phone" placeholder="전화번호"><br>
				이메일<br><input type="email" name="email" placeholder="이메일"><br>
				<input type="submit" value="가입하기">			
			</form>
		</div>
		<hr>
	</div>
	<div class="enroll-footer">
		<ul>
			<li><a href="/index.jsp">메인으로</a></li>
		</ul>
	</div>
</body>
</html>