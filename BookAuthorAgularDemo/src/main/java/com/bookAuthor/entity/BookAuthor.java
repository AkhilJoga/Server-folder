package com.bookAuthor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookAuthor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String title;
	
	private String category;
	
	private String image;
	
	private float price;
	
	private String pulisher;
	
	private boolean active;

	
	public BookAuthor() {
		super();
	}

	public BookAuthor(Integer id, String title, String category, String image, float price, String pulisher,
			boolean active, String content) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.image = image;
		this.price = price;
		this.pulisher = pulisher;
		this.active = active;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getImage() {
		return image;
	}

	public float getPrice() {
		return price;
	}

	public String getPulisher() {
		return pulisher;
	}

	public boolean isActive() {
		return active;
	}

	public String getContent() {
		return content;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String content;
	
	
	
}
