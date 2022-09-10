<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>
	<div>
		<form action="/member/modify.kh" method="post">
			<table align="center" border="1">
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="memberId" readonly value=${loginMember.memberId} }>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="memberPwd" value=${loginMember.memberPwd}>
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="memberName" readonly value=${loginMember.memberName}>
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="email" name="memberEmail" value=${loginMember.memberEmail}>
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="text" name="memberPhone" value=${loginMember.memberPhone}>
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<input type="text" name="memberAddr" value=${loginMember.memberAddr}>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="수정하기">
						<input type="reset" value = "취소하기">
						<input type="button" onclick="deleteConfirm();" value="탈퇴하기">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<script>
		function deleteConfirm(){
			if(window.confirm("정말로 탈퇴하시겠습니까?")){
			location.href='/member/remove.kh';
			}
		}
	</script>
	
</body>
</html>