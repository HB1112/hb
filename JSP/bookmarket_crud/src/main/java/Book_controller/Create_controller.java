package Book_controller;

import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BookRepository;
import dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addBook")
public class Create_controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/addBook 매핑 Create_controller doGet()");
		//전처리
		//모델이동
		//뷰이동
		RequestDispatcher rs= req.getRequestDispatcher("addBook.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/addBook 매핑 Create_controller doPost()");
		//전처리
		req.setCharacterEncoding("UTF-8");
		//              bookmarket_crud(webapp) 
		String save=req.getServletContext().getRealPath("resources/images");
		System.out.println(save);
		MultipartRequest multi = new MultipartRequest(req, save, 5*1024*1024,"utf-8", new DefaultFileRenamePolicy());
		
		String bookId=multi.getParameter("bookId");
		String name=multi.getParameter("name");
		String unitPrice=multi.getParameter("unitPrice");
		String author=multi.getParameter("author");
		String publisher=multi.getParameter("publisher");
		String releaseDate=multi.getParameter("releaseDate");
		String description=multi.getParameter("description");
		String category=multi.getParameter("category");
		String unitsInStock=multi.getParameter("unitsInStock");
		String condition=multi.getParameter("condition");
		

		// 숫자 값으로 변경 및 유효성 검사
		Integer price;
		if(unitPrice.isEmpty()){
			price=0;
		}else{
			price=Integer.valueOf(unitPrice);
		}
		
		long stock;
		
		if(unitsInStock.isEmpty()){
			stock=0;
		}else{
			stock=Long.valueOf(unitsInStock);
		}
		// 여기까지 일반 텍스트 전처리
		// 저장된 이미지의 이름을 변수에 저장
		String fileName = multi.getFilesystemName("BookImage");
		
		Book bk = new Book();
		bk.setBookId(bookId);
		bk.setBookname(name);
		bk.setAuthor(author);
		bk.setPublisher(publisher);
		bk.setReleaseDate(releaseDate);
		bk.setBookdescription(description);
		bk.setCategory(category);
		bk.setBookcondition(condition);
		
		bk.setUnitsInStock(stock);
		bk.setUnitPrice(price);
		
		bk.setFilename(fileName);
		
		//모델이동
		BookRepository br = BookRepository.getInstance();
		br.addBook(bk);
		//뷰이동 CUD에서는 보여줄 뷰어가 없음
		resp.sendRedirect("books");
	}

}
