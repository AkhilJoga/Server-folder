package com.sportDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportDemo.entity.Facility;
import com.sportDemo.entity.Sports;
import com.sportDemo.exception.ResourceNotFoundException;

@Service
public class SportServiceImpl implements ISportService {

	@Autowired
	ISportServiceRepository iSportServiceRepository;
	
	@Override
	public Integer createSportUser(Sports sport) {
		// TODO Auto-generated method stub
		Sports existSport = iSportServiceRepository.save(sport);
		return existSport.getId();
	}

	@Override
	public Optional<Sports> getById(Integer id) {
		// TODO Auto-generated method stub
		return iSportServiceRepository.findById(id);
	}

	@Override
	public Integer editSportUser(Sports sport,Integer id) {
		// TODO Auto-generated method stub
		Sports updatedSports = iSportServiceRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Sport data not exist with id: " + id));
		
		updatedSports.setAge(sport.getAge());
		updatedSports.setDob(sport.getDob());
		updatedSports.setEmail(sport.getEmail());
		updatedSports.setFirstName(sport.getFirstName());
		updatedSports.setLastName(sport.getLastName());
		updatedSports.setMobile(sport.getMobile());
		updatedSports.setPan(sport.getPan());
		updatedSports.setPassword(sport.getPassword());
		
		iSportServiceRepository.save(updatedSports);
		return updatedSports.getId();
	}
//
//	@Override
//	public Integer createFacility(Facility facility) {
//		// TODO Auto-generated method stub
//		Facility existingFacility = iSportFacilityRepository.save(facility);
//		Integer facilityId = existingFacility.getPlayerId();
//		return facilityId;
//	}

	@Override
	public Sports findByemail(String email) {
		// TODO Auto-generated method stub
		Sports sport = iSportServiceRepository.getByemail(email);
		if(!sport.getId().equals(null)) {
			return sport;
		}
		return null;
	}

}
