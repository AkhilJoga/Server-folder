package com.sportDemo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sports {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String firstName;
	String lastName;
	String email;
	String password;
	String mobile;
	String pan;
	String dob;
	Integer age;
	
	public Sports(String firstName, String lastName, String email, String password, String mobile, String pan,
			String dob, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.pan = pan;
		this.dob = dob;
		this.age = age;
	}

	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPan() {
		return pan;
	}

	public String getDob() {
		return dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
