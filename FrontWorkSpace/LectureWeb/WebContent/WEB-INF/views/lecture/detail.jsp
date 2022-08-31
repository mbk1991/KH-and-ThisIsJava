<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 상세보기</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../common/menuBar.jsp"></jsp:include><br><br>
<h3>강좌 상세 보기</h3>
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<tr>
			<td>강좌이름</td>
			<td>
				<input class="form-control" value="${lecture.lectureName}" readonly>
			</td>
		</tr>
		<tr>
			<td>강사이름</td>
			<td>
				<input class="form-control" value="${lecture.lectureInstructor}" readonly>
			</td>
		</tr>						
		<tr>
			<td>강좌소개</td>
			<td>
				<textarea class="form-control" rows="" cols="" readonly="readonly">${lecture.lectureIntroduce}</textarea>
			</td>
		</tr>
				<tr>
			<td>등록일자</td>
			<td>
				<input class="form-control" value="${lecture.regDate}" readonly>
			</td>
		</tr>
	</table>


</body>
</html>