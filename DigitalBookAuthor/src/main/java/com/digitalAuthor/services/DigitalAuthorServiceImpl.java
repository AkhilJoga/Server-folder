package com.digitalAuthor.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalAuthor.entity.Author;
import com.digitalAuthor.entity.Book;

@Service
public class DigitalAuthorServiceImpl implements IDigitalAuthorService {

	@Autowired
	IDigitalAuthorJpa iDigitalAuthorJpa;
	
	@Autowired
	IDigitalBookServiceJpa iDigitalBookServiceJpa;
	
	@Override
	public Integer createAuthor(Author author) {
		// TODO Auto-generated method stub
		 Author existedAuthor = iDigitalAuthorJpa.save(author);
		return existedAuthor.getId();
	}

	@Override
	public Integer getAuthorIdByEmail(String email,String password) {
		// TODO Auto-generated method stub
		
		Author author = iDigitalAuthorJpa.getByEmail(email);
		
		if(author.getPassword().equals(password)) {
			return author.getId();
		}
		return null;
	}

	@Override
	public Integer createBook(Book book) {
		// TODO Auto-generated method stub
		Book existing = iDigitalBookServiceJpa.save(book);
		return existing.getId();
	}
	

	public List<Book> getByAuthorID(Integer authorId){
		return iDigitalBookServiceJpa.getByAuthorId(authorId);
	}

	@Override
	public List<Book> getAllBooks(Book book) {
		// TODO Auto-generated method stub
		List<Book> existedBooks = iDigitalBookServiceJpa.findAll();
		List<Book> returnedBook = new ArrayList<Book>() ;
		
//		for(Book b : existedBooks) {
//			if(
//			(b.getPublisher().equals(book.getPublisher()))
//			|| (b.getReleaseDate().equals(book.getReleaseDate()))
//			|| (b.getTitle().equals(book.getTitle()))
//			|| (b.getCategory().equals(book.getCategory()))
//				) {
//				returnedBook.add(b);
//			}
//		}
		
		return existedBooks;
	}

}
