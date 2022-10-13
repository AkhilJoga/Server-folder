package com.bookAuthor.service;

import java.util.List;

import com.bookAuthor.entity.BookAuthor;

public interface IBookServicAuthor {
	
	public Integer saveBook(BookAuthor bookAuthor);
	
	public String deleteBook(Integer id);
	
	public List<BookAuthor> getBooks();
}
