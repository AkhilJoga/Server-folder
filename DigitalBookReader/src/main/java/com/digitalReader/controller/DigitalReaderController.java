package com.digitalReader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.digitalReader.entity.Book;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DigitalReaderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/searchBooks")
	public List<Book> SearchBooks(@RequestBody Book book){
		List<Book> books = this.restTemplate.getForObject("http://localhost:1001/getAllBooks"+book, List.class);
		return books;
	}
	
	
	
}
