<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 웹</title>
</head>
<body>
	<c:if test="${sessionScope.memberId eq null }">
		<h1>로그인 페이지</h1>
		<form action="/member/login.do" method="post">
			ID : <input type="text" name="member-id"><br>
			PW : <input type="password" name="member-pwd"><br>
			<input type="submit" value="로그인">
			<input type="reset" value="취소">
			<a href="/member/enroll.html">회원가입</a>
		</form>
	</c:if>
	<c:if test="${sessionScope.memberId ne null }">
		${memberId }님 환영합니다.
		<a href="/member/logout.do">로그아웃</a><br>
<!-- 		로그아웃 링크를 누르면 해당 URL을 주소표시줄에 치는 것과 같고 -->
<!-- 		그 방식은 get방식임. -->
		<a href="/member/list.do">전체 회원조회</a><br>
		<a href="/member/mypage.do?memberId=${memberId }">마이페이지</a><br>
		<a href="/notice/list.do">공지사항 목록</a><br>
		<a href="/notice/write.do">공지사항 작성</a><br>
<!-- 		마이페이지를 출력할 때 필요한 쿼리문은 -->
<!-- 		어떻게 작성해야될까요?
			SELECT * FROM MEMBER_TBL
			WHERE MEMBER_ID = '현재로그인한 아이디';
			현재 로그인한 아이디 == ${memberId }
 -->
	</c:if>
</body>
</html>







