<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Book" %>
    <%@ page import="dao.BookRepository" %>
    <%@ page import="com.oreilly.servlet.*" %>
    <%@ page import="com.oreilly.servlet.multipart.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="java.sql.*" %>
    <%@ include file = "dbconn.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");

	String save=request.getServletContext().getRealPath("\\resources\\images");
	System.out.println(save);
	MultipartRequest multi = new MultipartRequest(request, save, 5*1024*1024,"utf-8", new DefaultFileRenamePolicy());

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
	System.out.println(unitPrice);
	System.out.println(name);
	
	String fileName = multi.getFilesystemName("BookImage");

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
	
	
	PreparedStatement pstmt=null;
	
	String sql = "insert into book values(?,?,?,?,?,?,?,?,?,?,?)";
	
	pstmt=conn.prepareStatement(sql);
	pstmt.setString(1,bookId);
	pstmt.setString(2,name);
	pstmt.setInt(3,price);
	pstmt.setString(4, author);
	pstmt.setString(5, description);
	pstmt.setString(6, publisher);
	pstmt.setString(7,category);
	pstmt.setLong(8,stock);
	pstmt.setString(9,releaseDate);
	pstmt.setString(10,condition);
	pstmt.setString(11,fileName);
	pstmt.executeUpdate();
	
	if(pstmt!=null){
		pstmt.close();
	}if(conn!=null){
		conn.close();
	}
	
	response.sendRedirect("books.jsp");

%>