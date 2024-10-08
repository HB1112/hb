<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언문에 전역 메서드 -->
	<%! int sum(int a, int b){
			return a+b; 
		}
	%>
	<%
		out.println("2+3="+sum(2,3));
	%>
	<p>2+3=<%=sum(2,3) %></p>
	<p><a href="index.jsp">홈</a></p>
</body>
</html>