<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<style>
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
	
</style>
<body>
	<h1>글작성</h1>
	<form action="createPro" class="form" method="post">
		<input type="hidden" name="bno"/>
		<input type="text" name="writer" placeholder="작성자" class="text1">
		<input type="text" name="title" placeholder="제목" class="text1">
		<textarea rows="7" name="content" placeholder="내용" class="text1"></textarea>
		<button type="submit" onclick="clickBtn()">작성</button>
	</form>
	
	<a href="/">HOME</a>

	 <script>
	 	// 게시글 초기화
		function clickBtn(){
			setTimeout(function(){
				$('.text1').val('');	
			},300)
		}
	</script> 


</body>
</html>