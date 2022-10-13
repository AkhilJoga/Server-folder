package com.facilityDemo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facilityDemo.entity.Facility;

@Repository
public interface IFacilityServiceRepository extends JpaRepository<Facility,Integer> {

	
}
