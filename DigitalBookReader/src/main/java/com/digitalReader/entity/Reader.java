package com.digitalReader.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer paymentId;
	String name;
	String email;
	Integer bookId;
	
	public Reader(Integer paymentId, String name, String email, Integer bookId) {
		super();
		this.paymentId = paymentId;
		this.name = name;
		this.email = email;
		this.bookId = bookId;
	}
	
	public Integer getPaymentId() {
		return paymentId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

}
