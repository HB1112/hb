<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" href ="/SpringBookMarket/resources/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>도서목록</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class = "navbar-brand" href="./home">Home</a>
				<a class = "navbar-brand" href="./books">Books</a>
			</div>
		</div>
	</nav>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">로그인</h1>
		</div>
	</div>
	
	<div class="container col-md-4">
		<div class="text-center">
			<h3>Please Login</h3>
		</div>
		<% if (request.getAttribute("error") != null) { %>
    		<div class="alert alert-danger">UserName과 Password가 올바르지 않습니다 <br></div>
		<% } %>
		<form class="form-signin" action="<c:url value="/login"/>" method="post">
			<div class="form-group row">
				<input type="text" name="username" class="form-control" placehoer="UserName" required autofocus>
			</div>
			<div class="form-group row">
				<input type="password" name="password" class="form-control" placehoer="Password" required >
			</div>
			<div class="form-group row">
				<button class="btn btn-lg btn-success btn-block" type = "submit">로그인</button>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
			</div>
		</form>
	</div>
	<hr>
	<footer class="container">
		<hr>
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>










