package com.digitalAuthor.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.digitalAuthor.entity.Author;
import com.digitalAuthor.entity.Book;

public interface IDigitalBookServiceJpa extends JpaRepository<Book,Integer> {

	@Query(value="select * from Book where authorId = (:authorId)",nativeQuery = true)
	List<Book> getByAuthorId(@Param("authorId") Integer authorId);
	
	@Query(value="select * from Book where title = (:title)",nativeQuery = true)
	Book getByTitle(@Param("title") String title);
	
	@Query(value="select * from Book where publisher = (:publisher)",nativeQuery = true)
	List<Book> getByAuthor(@Param("publisher") String publisher);
	
	@Query(value="select * from Book where releaseDate = (:releaseDate)",nativeQuery = true)
	List<Book> getByReleaseDate(@Param("releaseDate") String releaseDate);

	
}
