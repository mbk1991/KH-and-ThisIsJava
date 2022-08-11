<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
</head>
<body>
	<form action="/member/modify.do" method="post">
		<fieldset>
			<legend>회원 상세 정보</legend>
			<ul>
				<li>아이디 : <input type="text" name="member-id" value="${member.memberId }" readonly></li><br>
				<li>비밀번호 : <input type="password" name="member-pwd"></li><br>
				<li>이름 : <input type="text" name="member-name" value="${member.memberName }" readonly></li><br>
				<li>나이 : <input type="text" name="member-age" value="${member.memberAge }" readonly></li><br>
				<li>이메일 : <input type="text" name="member-email" value="${member.memberEmail }"></li><br>
				<li>폰번호 : <input type="text" name="member-phone" value="${member.memberPhone }"></li><br>
				<li>주소 : <input type="text" name="member-address" value="${member.memberAddress }"></li><br>
				<li>성별 : <input type="radio" name="gender" value="M" <c:if test="${member.memberGender eq 'M'}">checked</c:if>>남 
				<input type="radio" name="gender" value="F" <c:if test="${member.memberGender == 'F'}">checked</c:if>>여					
				</li><br>
				<li>취미 : <input type="text" name="member-hobby" value="${member.memberHobby }"></li><br>
				<input type="submit" value="수정하기">
				<input type="reset" value="취소">
			</ul>
		</fieldset>
	</form>
	<br>
	<a href="/index.jsp">메인페이지로 이동</a>
	<a href="/member/delete.do">회원 탈퇴</a>
<!-- 쿼리문을 생각해보자!
	 DELETE FROM MEMBER_TBL WHERE MEMBER_ID = ?;
	 쿼리스트링을 이용해서 memberId값을 넘겨줘도 되지만
	 서버에서 처리해서 악의적인 탈퇴가 일어나지 않도록 할 수 있음.
	 127.0.0.1:9999/member/delete.do?memberId=khuser01
 -->
</body>
</html>






