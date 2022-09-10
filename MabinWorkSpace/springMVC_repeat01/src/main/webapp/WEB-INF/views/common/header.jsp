<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<div></div>
		<div id="login-wrap">
			<form action="/member/join.kh" method="post">
				<table align="center" border="1">
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
							<a href="#">회원가입</a>
						</td>
						<td></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

</body>
</html>