package com.digitalAuthor.services;

import java.util.List;

import com.digitalAuthor.entity.Author;
import com.digitalAuthor.entity.Book;

public interface IDigitalAuthorService {

	public Integer createAuthor(Author author);
	
	public Integer getAuthorIdByEmail(String email,String password);
	
	public Integer createBook(Book book);
	
	public List<Book> getAllBooks(Book book);
	
}
