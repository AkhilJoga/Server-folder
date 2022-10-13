package com.sportDemo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportDemo.entity.Sports;

@Repository
public interface ISportServiceRepository extends JpaRepository<Sports,Integer> {

	@Query(value="select * from sports where email = (:email)",nativeQuery = true)
	Sports getByemail(@Param("email") String email);
	
}
