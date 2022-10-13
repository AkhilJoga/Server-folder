package com.useCase.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;

import com.useCase.services.IUseCaseServiceRepository;
import com.useCase.services.UseCaseServiceImpl;

@ExtendWith(MockitoExtension.class)

@Service
public class UseCaseTest {
	
	@Mock 
	IUseCaseServiceRepository iUseCaseServiceRepository;
	
	UseCaseServiceImpl useCaseServiceImpl;
	
	@BeforeEach void setUp() {
		useCaseServiceImpl = new UseCaseServiceImpl();
	}
	
	 @Test void getUseCase() {
		 useCaseServiceImpl.getAll();
		 verify(iUseCaseServiceRepository).findAll();
	 }
	
	
	
}
