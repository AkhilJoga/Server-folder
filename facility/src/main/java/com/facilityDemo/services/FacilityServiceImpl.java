package com.facilityDemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facilityDemo.entity.Facility;

@Service
public class FacilityServiceImpl implements IFacilityService{

	
	@Autowired
	IFacilityServiceRepository iFacilityServiceRepository;
	
	@Override
	public Integer createFacility(Facility facility) {
		// TODO Auto-generated method stub
		Facility existedFacility = iFacilityServiceRepository.save(facility);
		return existedFacility.getGameId();
	}

}
