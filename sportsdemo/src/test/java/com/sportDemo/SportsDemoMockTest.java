package com.sportDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sportDemo.service.ISportServiceRepository;
import com.sportDemo.service.SportServiceImpl;

@ExtendWith(MockitoExtension.class)
public class SportsDemoMockTest {

	@Mock
	ISportServiceRepository iSportServiceRepository;
	
	SportServiceImpl sportServiceImpl;
	
	@Test
	public void testSave() {
		
	}
	
}
