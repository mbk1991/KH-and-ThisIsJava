<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/member/indexStyle.css">
<title>MemberWeb</title>

</head>
<body>

	<div id="header">
		Hi! MemberWeb!<br>
		<hr>
	</div>
	<div id="contents">
		<c:if test="${sessionScope.memberId eq null}">
	
		<div id=login_wrap>
			<h1>로그인 페이지</h1>
				<form action ="/member/login.do" method=post">
					ID:<input type = "text" name = "member-id"><br>
					PW:<input type = "password" name = "member-pwd"><br>
					<input type="submit" value="로그인">
					<input type="reset" value="취소">
				</form>
			<hr>
		</div>
	</c:if>
	<c:if test="${sessionScope.memberId ne null }">
		${memberId }님 환영합니다.	
		<a href ="/member/logout.do">로그아웃</a>
	</c:if>
		<div id=navi>
			<ul>
				<li><a href = "/member/enroll.html">회원가입</a></li>
				<li><a href = "/member/view.do">회원조회</a></li>
			</ul>
		</div>
	</div>
</body>
</html>