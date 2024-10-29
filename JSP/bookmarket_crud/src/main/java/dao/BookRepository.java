package dao;


import java.sql.*;
import java.util.ArrayList;

import dto.Book;

public class BookRepository {
	
	// 싱글턴
	private static BookRepository instance = new BookRepository();
	// 싱글턴
	public static BookRepository getInstance() {
		return instance;
	}
	// 생성자
	public BookRepository() {
		
	}
	
	public Connection dbconn() {
		Connection conn= null;
		try {
			String url="jdbc:mysql://localhost:3306/bookmarketdb_crud";
			String user="root";
			String password = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("데이터베이스 연결이 성공했습니다");
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결이 실패했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
	
	// 전체 책 DTO를 ArrayList에 묶어서 전송
	public ArrayList<Book> getAllBooks() {
		// Book 객체 묶음
		ArrayList<Book> listOfBooks = new ArrayList<Book>();
		//step1 : 데이터베이스 연결
		Connection conn=dbconn();
		//step2 : 쿼리 전송
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="select * from book";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				//DTO의 변수이름 , Repository의 변수이름, Database 컬럼 이름
				// 변수 < DTO < ArrayList<DTO>
				 String bookId = rs.getString("bookId");
				 String bookname = rs.getString("bookname");
				 int unitPrice = rs.getInt("unitPrice");
				 String author = rs.getString("author");
				 String bookdescription = rs.getString("bookdescription");
				 String publisher = rs.getString("publisher");
				 String category = rs.getString("category");
				 long unitsInStock = rs.getLong("unitsInStock");
				 String releaseDate = rs.getString("releaseDate");
				 String bookcondition = rs.getString("bookcondition");
				 String filename = rs.getString("fileName");
				 //int quantity = rs.getInt("quantity");
				 
				 Book bk = new Book();
				 bk.setBookId(bookId);
				 bk.setBookname(bookname);
				 bk.setUnitPrice(unitPrice);
				 bk.setAuthor(author);
				 bk.setBookdescription(bookdescription);
				 bk.setPublisher(publisher);
				 bk.setCategory(category);
				 bk.setUnitsInStock(unitsInStock);
				 bk.setReleaseDate(releaseDate);
				 bk.setBookcondition(bookcondition);
				 bk.setFilename(filename);
				 //bk.setQuantity(quantity);
				 listOfBooks.add(bk);
			}
		}catch(Exception e) {
			System.out.println("getAllBooks() 쿼리 전송 실패");
		}
		
		return listOfBooks;
	}
	public Book getBookById(String bookId) {
		Book bookById = null;
		for(int i =0; i<listOfBooks.size(); i++) {
			Book book=listOfBooks.get(i);
			if(book!=null && book.getBookId()!=null && book.getBookId().equals(bookId)) {
				bookById = book;
				break;
			}
		}
		return bookById;
	}
	public void addBook(Book book) {
		listOfBooks.add(book);
		System.out.println(listOfBooks.size());
	}
}
