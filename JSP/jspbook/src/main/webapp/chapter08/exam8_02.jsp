<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../8_2" method="post" id="form">
		<p> 아이디 : <input type="text" name="id" id="id">
		<p> 비밀번호 : <input type="password" name="passwd" id="pw">
		<p> <input type="button" value="전송" id="btn">
	</form>
	<script>
		var form = document.querySelector("#form");
		var btn = document.querySelector("#btn");
		btn.addEventListener("click",checkLogin);
		function checkLogin(){
			var fid=document.querySelector("#id");
			var id=fid.value;
			var fpw=document.querySelector("#pw");
			var pw=fpw.value;
			if(id==""){
				alert("아이디를 입력해주세요")
				fid.focus();
				return ;
			}else if(pw==""){
				alert("비밀번호를 입력해주세요")
				fpw.focus();
				return ;
			}
			form.submit();
		}
		
	</script>
</body>
</html>