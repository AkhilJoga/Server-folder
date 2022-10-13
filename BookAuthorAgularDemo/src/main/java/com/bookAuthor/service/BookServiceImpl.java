package com.bookAuthor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bookAuthor.entity.BookAuthor;



@Service
public class BookServiceImpl implements IBookServicAuthor {

	@Autowired
	IBookServiceRepository ibookServiceRepository;

	@Override
	public Integer saveBook(BookAuthor bookAuthor) {
		// TODO Auto-generated method stub
		BookAuthor savedBook = ibookServiceRepository.save(bookAuthor);	
		return savedBook.getId();
	}

	@Override
	public String deleteBook(Integer id) {
		// TODO Auto-generated method stub
		String msg="No data found.";
		if(ibookServiceRepository.existsById(id)) {
		ibookServiceRepository.deleteById(id); 
		return "Deleted the book";
	}
	return msg;
	}

	@Override
	public List<BookAuthor> getBooks() {
		// TODO Auto-generated method stub
		return ibookServiceRepository.findAll();
	}
	
}
