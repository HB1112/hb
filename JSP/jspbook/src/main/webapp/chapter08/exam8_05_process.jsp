<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id=(String)request.getAttribute("id");
		String pw=(String)request.getAttribute("pw");
		String name=(String)request.getAttribute("name");
		String phone=(String)request.getAttribute("phone");
		String email=(String)request.getAttribute("email");
	
	%>
	<p> 아이디 : <%=id %>
	<p> 비밀번호 : <%=pw %>
	<p> 이름 : <%=name %>
	<p> 전화번호 : <%=phone %>
	<p> 이메일 : <%=email %>
	
</body>
</html>