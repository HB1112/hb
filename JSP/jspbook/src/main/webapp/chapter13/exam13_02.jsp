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
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
	
		out.println("설정된 세션의 속성 값 [1] : "+id+"<br>");
		out.println("설정된 세션의 속성 값 [2] : "+pw);
	%>
	
</body>
</html>