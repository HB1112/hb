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
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		if(id.equals("admin")&&pw.equals("1234")){
			Cookie cookie_id=new Cookie("id",id);
			Cookie cookie_pw=new Cookie("pw",pw);
			response.addCookie(cookie_id);
			response.addCookie(cookie_pw);
			out.println("쿠키 생성이 성공했습니다 <br>");
			out.println(id+"님 환영합니다");
		}else{
			out.println("쿠키 생성이 실패했습니다");
		}
	%>
</body>
</html>