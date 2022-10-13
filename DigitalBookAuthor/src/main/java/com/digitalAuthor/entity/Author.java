package com.digitalAuthor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	String name;
	String email;
	String password;
	String re_password;
	
	public Author(Integer id, String name, String email, String password, String re_password) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.re_password = re_password;
	}
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getRe_password() {
		return re_password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}
	
	
	
}
