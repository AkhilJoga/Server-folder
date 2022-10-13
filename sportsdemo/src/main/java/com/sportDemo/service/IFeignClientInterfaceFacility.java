package com.sportDemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.sportDemo.entity.Facility;

@FeignClient(name="SPORTFACILITY")
public interface IFeignClientInterfaceFacility {
	
	@PostMapping("/createFacility")
	Integer createFacility(@RequestBody Facility facility);
}
