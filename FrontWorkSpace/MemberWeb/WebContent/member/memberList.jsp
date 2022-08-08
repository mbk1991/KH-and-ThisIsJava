<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원 정보</title>
</head>
<body>
	<h1>관리자: 회원관리 페이지</h1>
	<table border = "1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>이메일</th>
			<th>휴대폰</th>
			<th>주소</th>
			<th>성별</th>
			<th>취미</th>
			<th>가입날짜</th>
		</tr>
		<c:forEach items="${mList }" var="member">
		<tr>
			<td>${member.memberId }</td>
			<td>${member.memberName }</td>
			<td>${member.memberAge }</td>
			<td>${member.memberEmail }</td>
			<td>${member.memberPhone }</td>
			<td>${member.memberAddress }</td>
			<td>${member.memberGender }</td>
			<td>${member.memberHobby }</td>
			<td>${member.enrollDate }</td>
		</tr><br>
		</c:forEach>
	
	</table>

</body>
</html>