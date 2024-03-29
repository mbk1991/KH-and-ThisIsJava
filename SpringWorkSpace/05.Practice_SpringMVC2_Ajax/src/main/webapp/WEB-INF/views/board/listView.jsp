<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
<style>
	a{
		text-decoration: none;
		color:inherit;
		height:80%;
	}
	a:hover{
		color:green;
		font-style: oblique;
	}

</style>
</head>
<body>
	<div id="contents">
		<div id="board-wrap">
			<h1 align="center">게시글 목록</h1>
			<br><br>
			<table align="center" border="1">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
					<th>첨부파일</th>
				</tr>
				
				<c:if test="${!empty bList }">
					<c:forEach items="${bList }" var="board" varStatus="i">
						<tr>
							<td>${i.count }</td>
							<td><a href="/board/detail.kh?boardNo=${board.boardNo }">${board.boardTitle }</a></td>
							<td>${board.boardWriter }</td>
							<td>${board.bCreateDate }</td>
							<td>${board.boardCount }</td>
							<td>
								<c:if test="${empty board.boardFilename }">X</c:if>
								<c:if test="${!empty board.boardFilename }">O</c:if>
							</td>
						</tr>
					</c:forEach>
									<tr align="center" height="20">
					<td colspan="6">
					
								<c:if test="${startNavi > 1 }">
									<a href="/board/${urlVal }.kh?page=${startNavi - 1 }&searchCondition=${searchCondition}&searchValue=${searchValue}">[이전]</a>
								</c:if>
								<c:forEach var="p" begin="${startNavi }" end="${endNavi }">
									<c:if test="${p eq currentPage }"><b>${p }</b></c:if>
									<c:if test="${p ne currentPage }"><a href="/board/${urlVal }.kh?page=${p }&searchCondition=${searchCondition}&searchValue=${searchValue}" >${p }</a></c:if>
								</c:forEach>
								<c:if test="${endNavi < maxPage  }">
									<a href="/board/${urlVal }.kh?page=${endNavi + 1 }&searchCondition=${searchCondition}&searchValue=${searchValue}">[다음]</a>
								</c:if>
					</td>
				</tr>
				</c:if>
				<c:if test="${empty bList }">
					<tr>
						<td colspan="6" align="center"> 데이터가 존재하지 않습니다.</td>
					</tr>
				</c:if>

				<tr>
					<td colspan="5" align="center">
					<form action="/board/search.kh" method="get">
						<select name="searchCondition" >
							<option value="all"<c:if test="${searchCondition eq 'all' }">selected</c:if>>전체</option>
							<option value="writer" <c:if test="${searchCondition eq 'writer' }">selected</c:if>>작성자</option>
							<option value="title"<c:if test="${searchCondition eq 'title' }">selected</c:if>>제목</option>
							<option value="contents"<c:if test="${searchCondition eq 'contents' }">selected</c:if>>내용</option>
						</select>
						<input type="text" name="searchValue" value="${searchValue }">
						<button>검색</button>
					</form>
					</td>
					<td>
<!-- 						<button onclick="location.href='/board/writeView.kh';">글 작성하기</button> -->
						<button onclick="loginCheck(${!empty loginUser.memberId});">글 작성하기</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
<script>
	function loginCheck(loginStatus){
		if(loginStatus){
			location.href="/board/writeView.kh";
		}else{
			if(window.confirm("로그인을 해주세요..")){
				location.href="/home.kh";
			}
		}
	}
</script>
</html>