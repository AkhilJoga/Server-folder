package com.digitalAuthor.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digitalAuthor.entity.Author;

@Repository
public interface IDigitalAuthorJpa extends JpaRepository<Author,Integer>{

	@Query(value="select * from Author where email = (:email)",nativeQuery = true)
	Author getByEmail(@Param("email") String email);
	
}
