<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 2px solid black;
	}
	td {
		padding: 0px 10px;
	}
	
	.btn {
		margin-top: 10px;
	}
	
	
</style>
</head>
<body>
	<h1>전체글조회</h1>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
			<td>작성일자</td>
			<td>조회수</td>
		</tr>
		
		<c:forEach items="${list}" var="list">
		<tr>
			<td>${list.bno}</td>
			<td>
				<a href="selectOne/${list.bno}">${list.title}</a>
			</td>
			
			<td>${list.content}</td>
			<td>${list.writer}</td>
			<td>${list.regdate}</td>
			<td>${list.viewcnt}</td>
		</tr>
		</c:forEach>
		
	</table>
	<a href="/">HOME</a>
	
	<script>
	
	</script>

	
</body>
</html>