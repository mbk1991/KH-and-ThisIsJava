<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
</head>
<body>
	<fieldset>
		<legend><b>회원가입</b></legend>
			<ul>
				<li>아이디 : <input type = "text" name="member-id" value="${member.memberId }"></li><br>
				<li>비밀번호 : <input type = "password" name="member-pwd" ></li><br>
				<li>이름 : <input type = "text" name="member-name" value="${member.memberName }"></li><br>
				<li>나이 : <input type = "text" name="member-age" value="${member.memberAge }"></li><br>
				<li>이메일 : <input type = "email" name="member-email" value="${member.memberEmail }"></li><br>
				<li>폰번호 : <input type = "text" name="member-phone" value="${member.memberPhone }"></li><br>
				<li>주소 : <input type = "text" name="member-address" value="${member.memberAddress }"></li><br>
				<li>성별 : <label>남<input type = "radio" name="gender" value ="M"></label> <label>여<input type = "radio" name="gender" value="F"></label></li><br>
				<li>취미 : <input type = "text" name ="member-hobby" placeholder="취미"></li><br>
			</ul>
	</fieldset>
</body>
</html>