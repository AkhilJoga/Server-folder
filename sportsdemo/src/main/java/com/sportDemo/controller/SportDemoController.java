package com.sportDemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sportDemo.entity.Facility;
import com.sportDemo.entity.Sports;
import com.sportDemo.service.IFeignClientInterfaceFacility;
import com.sportDemo.service.SportServiceImpl;

@RestController
public class SportDemoController {
		
	@Autowired
	SportServiceImpl sportServiceImpl;
	
	@Autowired
	IFeignClientInterfaceFacility iFeignClientInterfaceFacility;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createSportUser")
	public Integer createSportUser(@RequestBody Sports sport) {
		return sportServiceImpl.createSportUser(sport);	
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("findById/{id}")
	public Optional<Sports> getById(@PathVariable Integer id) {
		return sportServiceImpl.getById(id);
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("updateSport/{id}")
	public Integer updateSportUser(@RequestBody Sports sport,@PathVariable Integer id) {
		return sportServiceImpl.editSportUser(sport,id);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createFacility")
	public Integer createFacility(@RequestBody Facility facility) {
	Integer facilitySaved = iFeignClientInterfaceFacility.createFacility(facility);
	return facilitySaved ;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getByEmail/{email}")
	public Sports getByEmail(@PathVariable String email){
		Sports sport = sportServiceImpl.findByemail(email);

		return sport;
		
	}
	
}
