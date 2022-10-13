package com.useCase.services;

import java.util.List;
import java.util.stream.Stream;

import com.useCase.entity.Student;

@FunctionalInterface
interface GetbyFaculty{
	 List<Student> getByfaculty(String faculty);
}