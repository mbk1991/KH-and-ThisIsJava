<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
<title>My Spring Web Page</title>
<!-- 	<link href="../../resources/css/menubar-style.css" rel=stylesheet">  상대경로-->
<link href="/resources/css/menubar-style.css" rel="stylesheet">
</head>
<body>
	<h1 align="center">Welcom out Website!!</h1>
	<hr>
		<div class="login-area">
			<c:if test="${empty loginUser}">
				<form action="/member/login.kh" method="post">
					<table align="right">
						<tr>
							<td>아이디 :</td>
							<td><input type="text" name="member-id"></td>
							<td rowspan="2"><input type="submit" value="로그인"></td>
						</tr>
						<tr>
							<td>비밀번호 :</td>
							<td><input type="password" name="member-pwd"></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="3"><a href="/member/joinView.kh">회원가입</a></td>
	
						</tr>
					</table>
				</form>
			</c:if>
		<c:if test="${sessionScope.loginUser.memberId ne null }">
			<table align="right">
				<tr>
					<td colspan="2"><b>${sessionScope.loginUser.memberName }</b>님 환영합니다.</td>
					<td></td>
				</tr>
				<tr>
					<td><a href="/member/mypage.kh">정보수정</a></td>
					<td><a href="/member/logout.kh">로그아웃</a></td>
				</tr>
			</table>
		</c:if>
	</div>
	<div class="nav-area">
		<div class="menu" onclick="location.href='/home.kh'">Home</div>
		<div class="menu" onclick="shoNoticeList();">공지사항</div>
		<div class="menu" onclick="location.href='/board/list.kh';">자유게시판</div>
		<div class="menu" onclick="">사진게시판</div>
	</div>

	<script>
		function showNoticeList() {
			location.href = "";
		}
	</script>

</body>
</html>
