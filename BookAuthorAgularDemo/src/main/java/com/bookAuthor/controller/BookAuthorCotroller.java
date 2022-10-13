package com.bookAuthor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookAuthor.entity.BookAuthor;
import com.bookAuthor.service.BookServiceImpl;
import com.bookAuthor.service.IBookServicAuthor;

@RestController
public class BookAuthorCotroller {

	@Autowired
	IBookServicAuthor bookServiceImpl;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createBookAuthor")
	public void  createBookAuthor(@RequestBody BookAuthor bookAuthor) {
			bookServiceImpl.saveBook(bookAuthor);
	}
	
	@CrossOrigin(origins ="https://localhost:4200")
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable Integer id) {
		return bookServiceImpl.deleteBook(id);
	}
	
	@CrossOrigin(origins ="https://localhost:4200")
	@GetMapping("/getBooks")
	public List<BookAuthor> getBooks(){
		return bookServiceImpl.getBooks();
	}
	
	
}
