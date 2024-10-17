<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#" name="loginForm">
		<p> 아이디 : <input type="text" name="id" id="id">
		<p> 비밀번호 : <input type="password" name="passwd" id="password">
		<p> <input type="submit" value="전송" id="sub">
	</form>
	<script>
	var submit = document.querySelector("#sub");
	submit.addEventListener("click",checkForm);
	
	function checkForm(){
		var formid = document.querySelector("#id");
		var id=formid.value;
		console.log(id);
		var formpassword = document.querySelector("#password");
		var password=formpassword.value;
		console.log(password);
		alert("아이디"+id+"\n"+"비밀번호"+password);
	}
	
</script>
</body>
</html>