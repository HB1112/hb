<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="8_5" method="post" id="form">
		<p> 아이디 : <input type="text" name="id" id="id">
		<p> 비밀번호 : <input type="password" name="passwd" id="passwd">
		<p> 이름 : <input type="text" name="name" id="name">
		<p> 연락처 : <select name="phone1" id="phone1">
					<option value="010">010</option>
					<option value="011">010</option>
					<option value="016">010</option>
					<option value="017">010</option>
					<option value="019">010</option>
				</select>-<input type="text" maxlength="4" size="4" name="phone2" id="phone2">
				-<input type="text" maxlength="4" size="4" name="phone3" id="phone3">
		<p> 이메일 : <input type="text" name="email" id="email">
		<p> <input type="button" value="가입하기" id="btn">

	</form>
	
	<script>
		var form = document.querySelector("#form");
		var btn = document.querySelector("#btn");
		btn.addEventListener("click", checkMember);
		function checkMember(){
			var fid = document.querySelector("#id");
			var fpw = document.querySelector("#passwd");
			var fname = document.querySelector("#name");
			var fphone1 = document.querySelector("#phone1");		
			var fphone2 = document.querySelector("#phone2");
			var fphone3 = document.querySelector("#phone3");
			var femail = document.querySelector("#email");
			
			var id=fid.value;
			var pw=fpw.value;
			var name= fname.value;
			var phone = fphone1.value+"-"+fphone2.value+"-"+fphone3.value;
			var email=femail.value;
			
			var regExpId=/^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
			var regExpName=/^[가-힣]*$/;
			var regExpPasswd=/^[0-9]*$/;
			var regExpPhone=/^\d{3}-\d{3,4}-\d{4}$/;
			var regExpEmail=/^[0-9a-zA-z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
			
			if(!regExpId.test(id)){
				alert("아이디는 문자로 시작해주세요!");
				fid.select();
				return false;
			}
			if(!regExpName.test(name)){
				alert("이름은 한글만 입력해주세요!");
				
				return false;
			}
			if(!regExpPasswd.test(pw)){
				alert("비밀번호는 숫자만 입력해주세요!");
				
				return false;
			}
			if(!regExpPhone.test(phone)){
				alert("연락처 입력을 확인해주세요");
				
				return false;
			}
			if(!regExpEmail.test(email)){
				alert("이메일 입력을 확인해주세요");
				
				return false;
			}
			form.submit();
			
		}
		
	
	</script>
</body>
</html>