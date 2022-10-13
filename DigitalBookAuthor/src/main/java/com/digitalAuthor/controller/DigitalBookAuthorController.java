package com.digitalAuthor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalAuthor.entity.Author;
import com.digitalAuthor.entity.Book;
import com.digitalAuthor.services.DigitalAuthorServiceImpl;


@RestController
public class DigitalBookAuthorController {
	
	@Autowired
	DigitalAuthorServiceImpl digitalAuthorServiceImpl;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createDigitalAuthor")
	public Integer createAuthor(@RequestBody Author author) {
		return digitalAuthorServiceImpl.createAuthor(author);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getByEmail/{email}/{password}")
	public Integer getIDByEmail(@PathVariable("email") String email,@PathVariable("password") String password) {
		System.out.println("Email"+email+"password"+password);
		return digitalAuthorServiceImpl.getAuthorIdByEmail(email, password);
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createBookForAuthor")
	public Integer creatBookForAuthor(@RequestBody Book book) {
		//book.setAuthorID(authorId);
		return digitalAuthorServiceImpl.createBook(book);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getBookList/{authorId}")
	public List<Book> getBookListAuthor(@PathVariable("authorId") Integer authorId){
		return  digitalAuthorServiceImpl.getByAuthorID(authorId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getAllBooks")
	public List<Book> getAllBooks(@RequestBody Book book){
		return digitalAuthorServiceImpl.getAllBooks(book);
	}
	

}
