<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<h1 align="center">회원정보 수정</h1>
	<div class="">
		<form action="/member/modify.kh" method="post">
			<table>
				<tr>
					<td> * 아이디</td>
					<td>
						<input type="text" id="memberId" name="memberId" value="${member.memberId }"  readonly>
					</td>
				</tr>
				<tr>
					<td> * 비밀번호</td>
					<td>
						<input type="password" name="memberPwd">
					</td>
				</tr>
				<tr>
					<td> * 이름</td>
					<td>
						<input type="text" name="memberName" value="${member.memberName }" readonly>
					</td>
				</tr>				
				<tr>
					<td> * 이메일</td>
					<td>
						<input type="text" name="memberEmail" value="${member.memberEmail }">
					</td>
				</tr>	
				<tr>
					<td> * 전화번호</td>
					<td>
						<input type="text" name="memberPhone" value="${member.memberPhone }">
					</td>
				</tr>
				<tr>
					<td> * 우편번호</td>
					<td>
						<input type="text" name="post" value="${addrInfos[0] }">
					</td>
				</tr>
				<tr>
					<td> * 주소</td>
					<td>
						<input type="text" name="address" value="${addrInfos[1] }">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="수정하기">
						<button type="button" onclick="removeMember();">탈퇴하기</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<script>
		function removeMember() {
			if(confirm("탈퇴하시겠습니까?")) {
				location.href = "/member/remove.kh";
			}
		}
	</script>
</body>
</html>