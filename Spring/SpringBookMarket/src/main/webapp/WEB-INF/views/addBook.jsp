<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
			<h1 class="display-3">
				<spring:message code="addBook.form.title.label"/>
			</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="float-right">
			<form:form action="${pageContext.request.contextPath}/logout" method="post">
				<input type="submit" class="btn btn-sm btn-success" value="Logout">
			</form:form>
		</div>
		<br><br>
		<form:form modelAttribute="NewBook" action="./add?${_csrf.parameterName}=${_csrf.token}" class="form-horizontal" enctype="multipart/form-data">
		<filedset>
		<legend><spring:message code="addBook.form.subtitle.label"/></legend>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.bookId.label"/></label>
				<div class="col-sm-3">
					<form:input path="bookId" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.name.label"/></label>
				<div class="col-sm-3">
					<form:input path="name" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.unitPrice.label"/></label>
				<div class="col-sm-3">
					<form:input path="unitPrice" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.author.label"/></label>
				<div class="col-sm-3">
					<form:input path="author" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.description.label"/></label>
				<div class="col-sm-5">
					<form:textarea path="description" cols="50" rows="2" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.publisher.label"/></label>
				<div class="col-sm-3">
					<form:input path="publisher" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.category.label"/></label>
				<div class="col-sm-3">
					<form:input path="category" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.unitsInStock.label"/></label>
				<div class="col-sm-3">
					<form:input path="unitsInStock" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.releaseDate.label"/></label>
				<div class="col-sm-3">
					<form:input path="releaseDate" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.condition.label"/></label>
				<div class="col-sm-3">
					<form:radiobutton path="condition" value="New" />New
					<form:radiobutton path="condition" value="Old" />Old
					<form:radiobutton path="condition" value="E-book" />E-book
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label"><spring:message code="addBook.form.bookImage.label"/></label>
				<div class="col-sm-7">
					<form:input path="bookImage" type="file" class="form-control"/>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="<spring:message code="addBook.form.button.label"/>"/>
				</div>
			</div>
		</filedset>
		</form:form>
		<hr>
	</div>
	<hr>
	<footer class="container">
		<hr>
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>










