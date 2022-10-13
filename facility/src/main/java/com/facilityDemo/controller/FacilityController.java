package com.facilityDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facilityDemo.entity.Facility;
import com.facilityDemo.services.FacilityServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FacilityController {

	@Autowired
	FacilityServiceImpl facilityServiceImpl;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createFacility")
	public Integer createFacility(@RequestBody Facility facility) {
		return facilityServiceImpl.createFacility(facility);
	}
}
