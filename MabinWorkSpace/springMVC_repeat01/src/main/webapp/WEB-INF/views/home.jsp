<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>MainPage</title>
</head>
<body>
<div id="header">
		<div></div>
		
			<div id="login-wrap">
				<form action="/member/login.kh" method="post">
					<table align="center" border="1">
					<c:if test="${sessionScope.loginUser eq null }">
						<tr>
							<td>아이디</td>
							<td>
								<input id="id" class="" type="text" name="memberId" value="" placeholder="아이디를 입력하세요.">
							</td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td>
								<input id="pwd" class="" type="password" name="memberPwd" value="" placeholder="비밀번호를 입력하세요.">
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" id="" class="" value="로그인">
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<a href="/member/joinView.kh">회원가입</a>
							</td>
						</tr>
						</c:if>
						<c:if test="${sessionScope.loginUser ne null}">
							<tr>
								<td colspan="2">
									${sessionScope.loginUser.memberName }님 환영합니다.
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<a href="/member/logout.kh">로그아웃</a> <a href="#">정보수정</a>
								</td>
							</tr>
						</c:if>
					</table>
				</form>
			</div>
		<div id="nav">
		
		</div>
	</div>



</body>
</html>
