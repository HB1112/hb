<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! String makeitlower(String data){return data.toLowerCase();} %>
	<% out.println(makeitlower("Hello World!")); %>
	<p><%=makeitlower("ABCDEF") %></p>
	<p><a href="index.jsp">홈</a></p>
</body>
</html>