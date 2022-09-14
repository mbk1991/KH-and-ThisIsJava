<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <!-- 서머노트를 위해 추가해야할 부분 -->
  <script src="/resources/js/summernote/summernote-lite.js"></script>
  <script src="/resources/js/summernote/lang"></script>
  <link rel="stylesheet" href="/resources/css/summernote-lite.css">
  <link rel="stylesheet" href="/resources/css/text.css">
  <!--  -->


<script>
		$(document).ready(function() {
			$('#summernote').summernote({
				height: 300,                 // 에디터 높이
				minHeight: null,             // 최소 높이
				maxHeight: null,             // 최대 높이
				focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
				lang: "ko-KR",					// 한글 설정
				placeholder: '최대 2048자까지 쓸 수 있습니다',	//placeholder 설정
				callbacks: {	//여기 부분이 이미지를 첨부하는 부분
					onImageUpload : function(files) {
						uploadSummernoteImageFile(files[0],this);
					},
					onPaste: function (e) {
						var clipboardData = e.originalEvent.clipboardData;
						if (clipboardData && clipboardData.items && clipboardData.items.length) {
							var item = clipboardData.items[0];
							if (item.kind === 'file' && item.type.indexOf('image/') !== -1) {
								e.preventDefault();
							}
						}
					}
				}
	});
        
        

	/**
	* 이미지 파일 업로드
	*/
	function uploadSummernoteImageFile(file, editor) {
		data = new FormData();
		data.append("file", file);
		$.ajax({
			data : data,
			type : "POST",
			url : "/uploadSummernoteImageFile",
			contentType : false,
			processData : false,
			success : function(data) {
            	//항상 업로드된 파일의 url이 있어야 한다.
				$(editor).summernote('insertImage', data.url);
			}
		});
	}
		});
</script>

</head>
<body>

	<h1>글 작성</h1><hr><br>
	<form action="/board/registPost.kh" method="post" enctype="multipart/form-data">
		<table align="center" border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="boardTitle">
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" name="boardWriter" value="${sessionScope.loginUser.memberId }">
				</td>
			</tr>
			<tr>
				<td colspan="2">내용</td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea id="summernote" name="boardContents" rows="20" cols="40">
					</textarea>
				</td>
			</tr>
			<tr>
				<td>파일첨부</td>
				<td>
					<input type="file" name="uploadFile">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button>저장하기</button>
					<button type="reset">취소하기</button>
				</td>
			</tr>
		</table>
	</form>
	

	
	
	
	
</body>
</html>