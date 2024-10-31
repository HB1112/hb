<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="dto.Book" %>
    <%@ page import="dao.BookRepository" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/bookmarket_crud/resources/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>도서 목록</title>
</head>
<body>
	<div class="container py-4">
	<%@ include file="menu.jsp" %>
	<%
		System.out.println("4. Books.jsp 뷰로 이동");
		ArrayList<Book> arr = (ArrayList<Book>)request.getAttribute("list");
		if(arr == null){
			System.out.println("5. list 전달 안됨");
		}
	%>
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">도서목록</h1>
				<p class="col-md-8 fs-4">BookList</p>
			</div>
		</div>

		<div class="row align-items-md-stretch text-center">
			<%
				for(int i =0; i<arr.size(); i++){
					
					Book bk = arr.get(i);
					System.out.println(bk.getBookId());
			%>		
			<div class="col-md-4">
				<div class="h-100 p-2">
					<img src="./resources/images/<%=bk.getFilename() %>" style="width : 250px; height : 350px"/>
					<h5><b><%=bk.getBookname() %></b></h5>
					<p><%=bk.getAuthor() %></p>
					<br><%=bk.getPublisher() %> | <%=bk.getReleaseDate() %>
					<p><%=bk.getBookdescription() %></p>
					<p><%=bk.getUnitPrice() %>원</p>		
					<p><a href="book?id=<%=bk.getBookId() %>" class="btn btn-secondary" role="button">상세 정보 &raquo;></a></p>			
				</div>
			</div>
			<%
				}
			%>
		</div>
		<%@ include file="footer.jsp" %>
	</div>

</body>
</html>