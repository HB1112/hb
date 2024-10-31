package dao;


import java.sql.*;
import java.util.ArrayList;

import dto.Book;

public class BookRepository {
	
	// 싱글턴
	private static BookRepository instance = new BookRepository();
	// 싱글턴
	public static BookRepository getInstance() {
		System.out.println("2. bookrepository 객체 전달을 위한 getInstance() 실행");
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
		System.out.println("3. 리파지토리 getallbooks()");
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
				// 후처리
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
	
	//하나의 책 DTO를 리턴
	public Book getBookById(String bookId) {
		Book bookById = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//데이터베이스 연결
		Connection conn = dbconn();
		//쿼리전송
		String sql="select * from book where bookid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bookId);
			rs=pstmt.executeQuery();
			//ResultSet을 객체로 전환
			if(rs.next()) {
				 String dbbookId = rs.getString("bookId");
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
				 
				 Book bk = new Book();
				 bk.setBookId(dbbookId);
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
				 
				 bookById = bk;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bookById;
	}
	
	public void addBook(Book book) {
		System.out.println("리파지토리의 addBook함수 실행");
		//데이터베이스 연결
		Connection conn = dbconn();
		//sql 전송
		PreparedStatement pstmt=null;
		String sql = "insert into book values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,book.getBookId());
			pstmt.setString(2,book.getBookname());
			pstmt.setInt(3,book.getUnitPrice());
			pstmt.setString(4, book.getAuthor());
			pstmt.setString(5, book.getBookdescription());
			pstmt.setString(6, book.getPublisher());
			pstmt.setString(7,book.getCategory());
			pstmt.setLong(8,book.getUnitsInStock());
			pstmt.setString(9,book.getReleaseDate());
			pstmt.setString(10,book.getBookcondition());
			pstmt.setString(11,book.getFilename());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	public void deleteBook(String bookId) {
		//데이터 베이스 연결
		Connection conn = dbconn();
		PreparedStatement pstmt = null;
		//sql 전송
		try {
			String sql = "delete from book where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,bookId);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	// 하나의 dto를 수정
	public void updateBook(Book book) {
		
		//데이터 베이스 연결
		Connection conn = dbconn();
		//sql 전송
		PreparedStatement pstmt = null;
		String sql = null;
		String filename = book.getFilename();
		try {
			if(filename!=null) {
				sql = "update book set bookname=?, unitPrice=?, author=?, bookdescription=?, publisher=?, category=?,unitsInStock=?,releaseDate=?, bookcondition=?, fileName=? where bookid=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,book.getBookname());
				pstmt.setInt(2,book.getUnitPrice());
				pstmt.setString(3,book.getAuthor());
				pstmt.setString(4, book.getBookdescription());
				pstmt.setString(5, book.getPublisher() );
				pstmt.setString(6, book.getCategory());
				pstmt.setLong(7,book.getUnitsInStock());
				pstmt.setString(8,book.getReleaseDate());
				pstmt.setString(9,book.getBookcondition());
				pstmt.setString(10,book.getFilename());
				pstmt.setString(11,book.getBookId());
				
			}else {
				sql= "update book set bookname=?, unitPrice=?, author=?, bookdescription=?, publisher=?, category=?,unitsInStock=?,releaseDate=?, bookcondition=? where bookid=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,book.getBookname());
				pstmt.setInt(2,book.getUnitPrice());
				pstmt.setString(3,book.getAuthor());
				pstmt.setString(4, book.getBookdescription());
				pstmt.setString(5, book.getPublisher() );
				pstmt.setString(6, book.getCategory());
				pstmt.setLong(7,book.getUnitsInStock());
				pstmt.setString(8,book.getReleaseDate());
				pstmt.setString(9,book.getBookcondition());
				pstmt.setString(10,book.getBookId());
			}
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
