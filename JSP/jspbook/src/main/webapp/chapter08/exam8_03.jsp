<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="8_3" method="post" id="form">
		<p> 아이디 : <input type="text" name="id" id="id">
		<p> 비밀번호 : <input type="password" name="pw" id="pw">
		<p> <input type="button" value="전송" id="btn">	
	</form>
	<script>
		
		var btn=document.querySelector("#btn");
		btn.addEventListener("click", checkLogin);
		var form = document.querySelector("#form")
		
		function checkLogin(){
			var fid=document.querySelector("#id");
			var fpw=document.querySelector("#pw");
			var id = fid.value;
			console.log(id.length);
			var pw = fpw.value;
			console.log(pw.length);
			if(id.length < 4 || id.length >12){
				alert("아이디는 4~12자 이내로 입력 가능합니다!");
				fid.focus();
				return false;
			}
			if(pw.length < 4){
				alert("비밀번호는 4자 이상으로 입력해야 합니다!");
				fpw.focus();
				return false;
			}
			form.submit();
		}
	</script>
</body>
</html>