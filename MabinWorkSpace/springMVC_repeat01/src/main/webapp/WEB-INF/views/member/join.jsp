<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 창</title>
</head>
<body>
	<div>
		<form action="/member/join.kh" method="post">
			<table align="center" border="1">
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
					<td>이름</td>
					<td>
						<input type="text" name="memberName">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="email" name="memberEmail">
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="text" name="memberPhone">
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<input type="text" name="memberAddr">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="가입하기">
						<input type="reset" value = "취소하기">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>