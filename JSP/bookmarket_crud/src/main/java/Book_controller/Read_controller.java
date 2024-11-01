package Book_controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.BookRepository;
import dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/books")
public class Read_controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("1. books url 매핑 doget() 실팽");
		//전처리
		//모델이동
		BookRepository br = BookRepository.getInstance(); 
		if(br == null) {
			System.out.println("2. BookRepository 객체 리턴 못받음");
		}
		ArrayList<Book> arr = br.getAllBooks();
		if(arr == null) {
			System.out.println("3. 리스트 정보를 전달받지 못함");
		}
		//뷰이동
		req.setAttribute("list", arr);
		RequestDispatcher rs= req.getRequestDispatcher("books.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
