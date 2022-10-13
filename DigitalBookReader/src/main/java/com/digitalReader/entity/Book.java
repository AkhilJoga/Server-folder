package com.digitalReader.entity;


public class Book {
	

	private Integer id;
	private Integer authorID;
	String title;
	String category;
	String publisher;
	String image;
	String price;
	String releaseDate;
	String active;
	String content;
	
	public Book(Integer id, String title, String category, String publisher, String image, String price, String releaseDate,
			String active, String content) {
		super();
		this.setId(id);
		this.title = title;
		this.category = category;
		this.publisher = publisher;
		this.image = image;
		this.price = price;
		this.releaseDate = releaseDate;
		this.active = active;
		this.content = content;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getImage() {
		return image;
	}
	public String getPrice() {
		return price;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public String getActive() {
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
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuthorID() {
		return authorID;
	}

	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}
	
	
}
