<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<style>
* {
	box-sizing: border-box;
}

form {
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-content: center;
	height: 30vh;
	padding: 0px 300px;
}

input {
	margin-bottom: 10px;
}

.textWriter {
	background-color: #abdbe3;
}
</style>
<body>
	<h1>상세보기</h1>
	<a href="../delete/${vo.bno}" type="submit" onclick="msg()">삭제</a>
	<form action="../updatePro" class="form" method="post">
		<input type="hidden" name="bno" value="${vo.bno}" /> <input
			type="text" name="writer" placeholder="작성자" class="textWriter"
			value="${vo.writer}" readonly="readonly"> <input type="text"
			name="title" placeholder="제목" value="${vo.title}">
		<textarea rows="7" name="content" placeholder="내용">${vo.content}</textarea>
		<button type="submit">수정</button>
	</form>
	<a href="/">HOME</a>
	<script>
		function msg() {
			alert('게시글 삭제 완료');
		}
	</script>


</body>
</html>