package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBookList(){
		System.out.println("BookServiecImple getAllBookList()");
		return bookRepository.getAllBookList();
	}
	public List<Book> getBookListByCategory(String category){
		System.out.println("BookServiceImpl getBookListByCategory()");
		List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
		return booksByCategory;
	}
	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
		System.out.println("BookServiceImpl getBookListByFilter()");
		Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
		return booksByFilter;
	}
	@Override
	public Book getBookById(String bookId) {
		System.out.println("BookServiceImpl getBookById()");
		Book bookById = bookRepository.getBookById(bookId);
		return bookById;
	}
	@Override
	public void setNewBook(Book book) {
		bookRepository.setNewBook(book);
		
	}
	
}
