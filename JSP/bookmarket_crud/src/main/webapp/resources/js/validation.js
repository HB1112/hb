/**
 * 
 */

var newBook=document.querySelector("#newBook");
var btn=document.querySelector("#btn");
btn.addEventListener("click",CheckAddBook);

function CheckAddBook(){
	
	var fbookId=document.querySelector("#bookId");
	var fname=document.querySelector("#name");
	var funitPrice=document.querySelector("#unitPrice");
	var funitsInStock=document.querySelector("#unitsInStock")
	var fdescription=document.querySelector("#description");
	var bookId=fbookId.value;
	console.log(bookId);
	var name=fname.value;
	var unitPrice=funitPrice.value;
	var unitsInStock=funitsInStock.value;
	var description=fdescription.value;
	
	
	if(!check(/^ISBN[0-9]{4,11}$/,fbookId,"[도서코드]\nISBN과 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 ISBN으로 시작하세요")){
		return false;
	}
	if(name.length<4||name.length>50){
		alert("[도서명]\n최소 4자에서 최대 50자까지 입력하세요");
		fname.focus();
		return false;
	}
	if(unitPrice.length==0||isNaN(unitPrice)){
		alert("[가격]\n숫자만 입력하세요")
		funitPrice.focus()
		return false;
	}	
	if(unitPrice<0){
		alert("[가격]\n음수를 입력할 수 없습니다")
		funitPrice.focus()
		return false;
	}
	if(isNaN(unitsInStock)){
		alert("[재고 수]\n숫자만 입력하세요")
		funitPrice.focus()
		return false;
	}
	if(description.length<100){
		alert("[상세설명]\n최소 100자 이상 입력하세요")
		fdescription.focus()
		return false;
	}
	
	function check(regExp, e, msg){
		if(regExp.test(e.value)){
			return true;
		}
		alert(msg);
		e.focus();
		return false;
	}
	newBook.submit();
}
