<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	실습리스트
	
	
	<p><a href="2_1">예제 2-1</a></p>
	<p><a href="2_2">예제 2-2</a></p>
	<p><a href="2_3">예제 2-3</a></p>
	<p><a href="2_4">예제 2-4</a></p>
	<p><a href="2_5">예제 2-5</a></p>
	<p><a href="2_6">예제 2-6</a></p>
	<p><a href="2_7">예제 2-7</a></p>
	<hr>
	<p><a href="3_1">예제 3-1</a></p>
	<p><a href="3_2">예제 3-2</a></p>
	<p><a href="3_3">예제 3-3</a></p>
	<p><a href="3_4">예제 3-4</a></p>
	<p><a href="3_6">예제 3-6</a></p>
	<p><a href="3_7">예제 3-7</a></p>
	<p><a href="3_9">예제 3-9</a></p>
	<p><a href="3_10">예제 3-10</a></p>
	<p><a href="3_11">예제 3-11</a></p>
	<hr>
	<p><a href="4_1">예제 4-1</a></p>
	<p><a href="4_2">예제 4-2</a></p>
	<p><a href="4_3">예제 4-3</a></p>
	<p><a href="4_4">예제 4-4</a></p>
	<p><a href="4_5">예제 4-5</a></p>
	<p><a href="4_6">예제 4-6</a></p>
	<p><a href="4_7">예제 4-7</a></p>
	<p><a href="4_8">예제 4-8</a></p>
	
	<% 
		String id="admin";
		String name="hb";
	%>
	<form action="4_0" method="post">
		<p><input type="text" name="id"/>
		<p><input type="text" name="name"/>
		<p><input type="submit" value="전송"></input>
	</form>
	<p><a href="4_0?id=<%=id%>&name=<%=name%>">예제 4-0</a></p>
	
	<p><a href="4_9">예제 4-9</a></p>
	<p><a href="4_10">예제 4-10</a></p>
	<p><a href="4_11">예제 4-11</a></p>
	<hr>
	<form action="5_1" method="post">
		<p> 예제 5-1
		<p> 아 이 디 : <input type ="text" name="id">
		<p> 비밀번호 : <input type ="text" name="passwd">
		<p> <input type="submit" value="전송"/>
	</form>
	<p><a href="5_2">예제 5-2</a></p>
	<p><a href="5_3">예제 5-3</a></p>
	<p><a href="5_4">예제 5-4</a></p>
	<p><a href="5_5">예제 5-5</a></p>
	<p><a href="5_7">예제 5-7</a></p>
	<p><a href="5_8">예제 5-8</a></p>
	<hr>
	<p><a href="6_1">예제 6-1~5</a></p>
	<p><a href="6_6">예제 6-6</a></p>
	<hr>
	<p><a href="7_1">예제 7-1</a></p>
	<p><a href="7_1_one">예제 7-1_one</a></p>
	<p><a href="7_2">예제 7-2</a></p>
	<p><a href="7_3">예제 7-3</a></p>
	<hr>
	<p><a href="8_1">예제 8-1</a></p>
	<p><a href="8_2">예제 8-2</a></p>
	<p><a href="8_3">예제 8-3</a></p>
	<p><a href="8_4">예제 8-4</a></p>
	<p><a href="8_5">예제 8-5</a></p>
	<hr>
	<p><a href="9_1">예제 9-1</a></p>
	<p><a href="9_2">예제 9-2</a></p>
	<p><a href="9_3">예제 9-3</a></p>
</body>
</html>