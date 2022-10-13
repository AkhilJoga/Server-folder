package com.bookAuthor.service;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookServiceRepository extends JpaRepository<com.bookAuthor.entity.BookAuthor,Integer> {

}
