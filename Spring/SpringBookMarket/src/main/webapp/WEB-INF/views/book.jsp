<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
			<h1 class="display-3">도서 정보</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<c:choose>
					<c:when test="${ book.getBookImage() == null}">
						<img src="/SpringBookMarket/resources/images/${book.bookId}.png" style="width:100%">
					</c:when>
					<c:otherwise>
						<img src="/SpringBookMarket/resources/images/${book.getBookImage().getOriginalFilename()}" style="width:100%">
					</c:otherwise>
				</c:choose>
			</div>
			<div class="col-md-8">
				<h3>${book.name}</h3>
				<p>${book.description}
				<br>
				<p><b>도서코드 : </b><span class="badge badge-info">${book.bookId}</span>
				<p><b>저자</b> : ${book.author}
				<p><b>출판사</b> : ${book.publisher}
				<p><b>출판일</b> : ${book.releaseDate}
				<p><b>분류</b> : ${book.category}
				<p><b>재고수</b> : ${book.unitsInStock}
				<h4>${book.unitPrice}원</h4>
				<br>
				<p><a href="#" class="btn btn-primary">도서주문 &raquo;</a>
				<a href="<c:url value="/books"/>" class="btn btn-secondary">도서 목록 &raquo;</a>
			</div>
		</div>
	</div>
	<hr>
	<footer class="container">
		<hr>
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>










