<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="chapter04.exam04_07_person" scope="request" />
	<p> 아이디 : <%=person.getId() %>
	<p> 이 름 : <%=person.getName() %>
	<%
		person.setId(20230824);
		person.setName("홍길동");
	%>
	<jsp:include page="exam4_07.jsp" />
</body>
</html>