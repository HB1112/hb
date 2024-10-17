<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="8_4" method="post" id="form">
		<p> 아이디 : <input type="text" name="id" id="id">
		<p> 비밀번호 : <input type="password" name="pw" id="pw">
		<p> <input type="button" value="전송" id="btn">	
	</form>
	<script type="text/javascript">
		var form = document.querySelector("#form");
		var btn = document.querySelector("#btn");
		btn.addEventListener("click",checkLogin);
		
		function checkLogin(){
			var fid=document.querySelector("#id");
			var fpw=document.querySelector("#pw");
			var id = fid.value;
			var pw = fpw.value;
			
			for(var i = 0; i<id.length; i++){
				var ch = id.charAt(i);
				if((ch<'a'||ch>'z')&&(ch>'A'||ch<'Z')&&(ch>'0'||ch<'9')){
					alert("아이디는 영문 소문자만  입력 가능합니다");
					fid.select();
					return false;
				}
				if(isNaN(pw)){
					alert("비밀번호는 숫자만 입력 가능합니다")
					fpw.select();
					return false;
				}
				form.submit();
			}
			
		}
	
	</script>
</body>
</html>