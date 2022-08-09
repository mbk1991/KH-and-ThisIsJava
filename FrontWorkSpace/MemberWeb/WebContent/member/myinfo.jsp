<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="/member/myinfoStyle.css">
<title>회원 상세 정보</title>
</head>
<body>
	<form action="/member/modify.do">
		<fieldset>
			<legend><b>회원가입</b></legend>
				<ul>
					<li>아이디 : <input type = "text" name="member-id" value="${member.memberId }" readonly></li><br>
					<li>비밀번호 : <input type = "password" name="member-pwd" value="${member.memberPwd }"></li><br>
					<li>이름 : <input type = "text" name="member-name" value="${member.memberName }" readonly></li><br>
					<li>나이 : <input type = "text" name="member-age" value="${member.memberAge }" readonly></li><br>
					<li>이메일 : <input type = "email" name="member-email" value="${member.memberEmail }"></li><br>
					<li>폰번호 : <input type = "text" name="member-phone" value="${member.memberPhone }"></li><br>
					<li>주소 : <input type = "text" name="member-address" value="${member.memberAddress }"></li><br>
					
			<%-- 		<li>성별 : 
					<c:if test="${member.memberGender == 'M'}">
						<label>남<input type = "radio" name="gender" readonly value ="M" checked="checked"></label>
						<label>여<input type = "radio" name="gender" readonly value="F" ></label>
					</c:if>
					<c:if test="${member.memberGender == 'F'}">
						<label>남<input type = "radio" name="gender" value ="M" readonly ></label>
						<label>여<input type = "radio" name="gender" value="F" checked="checked" readonly></label>
					</c:if></li><br> --%>
					
					<li>성별 : 
						<label>남<input type = "radio" name="gender"  value ="M" <c:if test="${member.memberGender =='M' }">checked</c:if>></label>
						<label>여<input type = "radio" name="gender"  value="F" <c:if test="${member.memberGender =='F' }">checked</c:if>></label>
					
					<li>취미 : <input type = "text" name ="member-hobby" value="${member.memberHobby }"></li><br>
					<input type="submit" value="수정하기">
					<input type="reset" value="취소">
				</ul>
		</fieldset>
	</form>
	<br>
	<a href ="/index.jsp">메인페이지로 이동</a>
	<a href ="/member/delete.do">회원 탈퇴</a>
	<!--쿼리문을 생각해보자
		DELETE FROM MEMBER_TBL WHERE WHERE MEMBER_ID = ?;
	  -->
</body>
</html>