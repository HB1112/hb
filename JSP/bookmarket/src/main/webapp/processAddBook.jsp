<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Book" %>
    <%@ page import="dao.BookRepository" %>
    <%@ page import="com.oreilly.servlet.*" %>
    <%@ page import="com.oreilly.servlet.multipart.*" %>
    <%@ page import="java.util.*" %>
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
	
	BookRepository dao = BookRepository.getInstance();
	Book newBook= new Book();
	newBook.setBookId(bookId);
	newBook.setName(name);
	newBook.setUnitPrice(price);
	newBook.setAuthor(author);
	newBook.setPublisher(publisher);
	newBook.setReleaseDate(releaseDate);
	newBook.setDescription(description);
	newBook.setCategory(category);
	newBook.setUnitsInStock(stock);
	newBook.setCondition(condition);
	newBook.setFilename(fileName);
	
	dao.addBook(newBook);
	
	response.sendRedirect("books.jsp");

%>