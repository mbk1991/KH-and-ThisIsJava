<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../common/menuBar.jsp"></jsp:include><br>
	<br>

	<h3>회원 정보 수정</h3>
	<form action="/lecture/modify.do" method="post">
		<input type="hidden" name="lectureNo" value="${lecture.lectureNo}">
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<td>강좌명</td>
				<td>
					<input type="text" class="form-control" name="lectureName" value="${lecture.lectureName }">
				</td>
			</tr>
			<tr>
				<td>강사명</td>
				<td>
					<input type="text" class="form-control" name="lectureInstructor" value="${lecture.lectureInstructor }">
				</td>
			</tr>
			<tr>
				<td>강좌소개</td>
				<td>
					<textarea type="text" class="form-control" name="lectureIntroduce">
						${lecture.lectureIntroduce }
					</textarea></td>
			</tr>
		</table>
		<div>
			<a href="#">취소</a> 
			<input type="submit" class="btn btn-sm btn-success" value="수정">
		</div>
	</form>

</body>
</html>