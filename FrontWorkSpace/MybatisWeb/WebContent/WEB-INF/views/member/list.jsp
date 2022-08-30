<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
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
						<th>회원ID</th>
						<th>이름</th>
						<th>주소</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${mList }"  var="member" varStatus="index">
						<tr>
							<td>${index.count }</td>
							<td>${member.memberId}</td>
							<td><a href="/member/detail.do?memberId=${member.memberId }">${member.memberName }</a></td>
							<td>${member.memberAddress }</td>
							<c:if test="${sessionScope.member.memberId eq member.memberId }">
								<td><a class="btn btn-xs btn-warning" href="/member/modify.do">UPDATE</a></td>
							</c:if>
							<c:if test="${sessionScope.member.memberId eq member.memberId }">
								<td><a class="btn btn-xs btn-danger" href="/member/delete.do">DELETE</a></td>
							</c:if>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>




</body>
</html>