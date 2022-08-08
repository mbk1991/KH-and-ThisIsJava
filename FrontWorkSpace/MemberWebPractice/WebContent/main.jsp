<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/./css/mainStyle.css">
<title>메인 화면입니다.</title>
</head>
<body>
	<div id="header">
		<div id="header_logo">
			<h1>게시판</h1>
			<hr>
		</div>
		<div id="header_query">
			<form action="">
				<input type="text" id="query" placeholder="검색">	
				<input type="submit" id="query_submit" value="검색"><br><hr>	
			</form>
		</div>
		</div>
	</div>
	<div id="contents">
		<div id="boader_view" style="float:left width:90%%">
			<fieldset>
				<legend>게시글 목록</legend>
			</fieldset>
		</div>
		<div id="login_wrap" style="float:left">
			<form action ="">
			<fieldset>
				<legend>로그인</legend>
				<input type="text" mexlength="40" placeholder="아이디"><br>
				<input type="password" mexlength="18" placeholder="비밀번호">
				<input type="submit" value="로그인" id="login_btn">
			</fieldset>
			</form>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>