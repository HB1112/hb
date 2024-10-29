 <%@ page contentType="text/html; charset=UTF-8" %>
 <header class="pb-3 mb-4 border-bottom">
 	<div class="container">
 		<div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
 			<a href="./" class="d-flex align-items-center text-dark text-decoration-none">
     			<svg  width="32" height="32" fill="currentColor" class="bi bi-house-fill" viewBox="0 0 16 16">
  					<path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L8 2.207l6.646 6.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5Z"/>
  					<path d="m8 3.293 6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6Z"/>
				</svg>   
        		<span class="fs-4">Home</span>
     		 </a> 
     		 <ul class="nav nav-pills">
     		 	<!-- R 전체 도서 가져오기 -->
     		 	<li class="nav-item"><a href="books" class="nav-link">도서 목록</a></li>
     		 	<!-- C 도서 입력 -->
     		 	<li class="nav-item"><a href="addBook" class="nav-link">도서 등록</a></li>
     		 	<!-- U 도서 수정 -->
     		 	<li class="nav-item"><a href="editBook?edit=update" class="nav-link">도서 수정</a></li>
     		 	<!-- D 도서 삭제 -->
     		 	<li class="nav-item"><a href="editBook?edit=delete" class="nav-link">도서 삭제</a></li>
     		 </ul>
 		</div>
 	</div>
       
    </header>    