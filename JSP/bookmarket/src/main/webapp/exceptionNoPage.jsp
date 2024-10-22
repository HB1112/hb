<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Book" %>
    <%@ page import="dao.BookRepository" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>페이지 오류</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
		<div class="jumbotron">
			<div class="container">
				<h2 class="alert alert-danger">요청하신 페이지를 찾을 수 없습니다.</h2>
			</div>
		</div>
		<div class="container">
			<p> <%=request.getRequestURL() %>
			<p> <a href="books.jsp" class="btn btn-secondary"> 도서 목록&raquo;</a>
		</div>	
</body>
</html>