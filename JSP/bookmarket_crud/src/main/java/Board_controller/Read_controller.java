package Board_controller;

import java.io.IOException;
import java.util.ArrayList;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardRepository;
import dao.BookRepository;
import dto.Board;
import dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/BoardListAction")
public class Read_controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Board Create_controller doGet()");
		int limit = 5; // 한페이지에 출력할 글의 갯수를 제한
		//전처리
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		
		//모델이동
		BoardRepository br = BoardRepository.getInstance();
		ArrayList<Board> arr = br.getAllBoard();
		int total_record = br.getTotalCount();
		int total_page=0;
		if(total_record % limit==0) {
			total_page = total_record/limit;
		}else {
			total_page = (total_record/limit)+1;
		}
		
		//뷰이동
		req.setAttribute("total_page", total_page); // 출력할 페이지의 갯수
		req.setAttribute("total_record", total_record); //전체 글의 갯수
		req.setAttribute("list", arr); // 전체글을 담은 객체
		req.setAttribute("pageNum", pageNum); // 현재 페이지 번호
		RequestDispatcher rs= req.getRequestDispatcher("list.jsp");
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
