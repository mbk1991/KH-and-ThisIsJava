<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="/resources/css/menubar-style.css">
	<title>MainPage</title>
</head>
<body>
	<div id="header">
		<div id="header-wrap">
			<div class="" id="logo"></div>
			<div class="" id="site-title">MySpringSite</div>
			<div class="" id="login-area">
				<form action="">
					<table border="1">
						<tr>
							<td>아이디</td>
							<td>
								<input type="text" name="memberId">
							</td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td>
								<input type="password" name="memberPwd">
							</td>
						</tr>
							<tr>
							<td><button>로그인</button></td>
							<td><button type="reset">취소</button></td>
						</tr>
						<tr>
							<td colspan="2">
								<a href="/joinView">회원가입</a>
							</td>
						</tr>
					
					
					</table>
				
				
				</form>
			
			</div>
		</div>
		<div id="nav">
			<ul>
				<li class="menu" onclick="location.href='/home.kh';" >HOME</li>
				<li class="menu" onclick="" >공지사항</li>
				<li class="menu" onclick="" >자유게시판</li>
				<li class="menu" onclick="" >사진게시판</li>
			</ul>
		</div>
	</div>
	<div id="contents"></div>
	<div id="footer"></div>
</body>
</html>
