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
		session=request.getSession(false);
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
	%>
	아이디: <%=id %>
	비밀번호: <%=pw %>
	
</body>
</html>