package com.sportDemo.service;

import java.util.Optional;

import com.sportDemo.entity.Facility;
import com.sportDemo.entity.Sports;

public interface ISportService {

	Integer createSportUser(Sports sport);
	
	Optional<Sports> getById(Integer id);
	
	Integer editSportUser(Sports sport,Integer id);
	
	Sports findByemail(String email);
	
	
}
