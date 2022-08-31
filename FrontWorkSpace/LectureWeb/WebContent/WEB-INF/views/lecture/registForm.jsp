<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../common/menuBar.jsp"></jsp:include><br><br>
<h1 align="center">강좌등록</h1>
<form action="/lecture/regist.do" method="post">
	<table>
		<tr>
			<td>강좌명</td>
			<td>
				<input type="text" name="lectureName">
			</td>
		</tr>
		<tr>
			<td>강좌소개</td>
			<td>
				<input type="text" name="lectureIntroduce">
			</td>
		</tr>
		<tr>
			<td>강사명</td>
			<td>
				<input type="text" name="instructorName">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div>
					<input type="reset" value="취소">
					<input type="submit" value="등록">
				</div>
			</td>
		</tr>
	</table>
</form>


</body>
</html>