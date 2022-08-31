<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 목록</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<jsp:include page="../common/menuBar.jsp"></jsp:include><br><br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<table class="table table-hover table-condensed">
				<colgroup>
					<col width="80" align="center">
					<col width="200">
					<col width="200">
					<col width="400">
				</colgroup>
				<thead>
					<tr>
						<th>No</th>
						<th>강좌명</th>
						<th>강사명</th>
						<th>등록일자</th>
						<th>개강여부</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${lecList}"  var="lecture" varStatus="index">
						<tr>
							<td>${index.count }</td>
							<td><a href="/lecture/lectureDetail.do?lectureNo=${lecture.lectureNo }">${lecture.lectureName}</a></td>
							<td>${lecture.lectureInstructor}</td>
							<td>${lecture.regDate }</td>
							<td>${lecture.useYn}</td>
							<td><a class="btn btn-xs btn-warning" href="/lecture/modify.do?lectureNo=${lecture.lectureNo }">UPDATE</a></td>
							<td><a class="btn btn-xs btn-danger"  onclick="lectureDelete(${lecture.lectureNo});">DELETE</a></td>
						</tr>
					</c:forEach>
					
					<tr>
						<td><button class="btn btn-lg btn-danger" onclick="location.href='/lecture/regist.do'">강좌등록</button></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>


<script>
	function lectureDelete(lectureNo){
		var check = confirm("정말 삭제하시겠습니까?");
		if(check){
			location.href="/lecture/delete.do?lectureNo="+lectureNo;
		}
		return false;
	}
</script>


</body>
</html>