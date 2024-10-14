<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="chapter06.exam06_01_set" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id =(String)request.getAttribute("id");
		String password =(String)request.getAttribute("password");
		String name =(String)request.getAttribute("name") ;
		String phone1 =(String)request.getAttribute("phone1") ;
		String phone2 =(String)request.getAttribute("phone2") ;
		String phone3 =(String)request.getAttribute("phone3");
		String gender =(String)request.getAttribute("gender");
		String[] hobby =(String[])request.getAttribute("hobby");
		String hobby2 =(String)request.getAttribute("hobby2") ;
		String hobby3 =(String)request.getAttribute("hobby3") ;
		String comment =(String)request.getAttribute("comment");
	%>

		<p> 회원 정보
		
		<p>아이디 : <%=id %>
		<p>비밀번호 : <%=password %>
		<p>이름 : <%=name%>
		<p>연락처 : <%=phone1%>-<%=phone2%>-<%=phone3 %>
		<p>성별 : <%=gender %>
		<p>취미 : <%
				if(hobby !=null) {
					for(int i = 0; i < hobby.length;i++) {
						out.println(" "+hobby[i]);
					}
				}
				%>	
		
		<p>가입인사 : <%=comment %>	
	
</body>
</html>