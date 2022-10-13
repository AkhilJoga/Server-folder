package com.sportDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer gameId;
	Integer playerId;
	String email;
	String firstName;
	String lastName;
	String dateofGame;
	String timeofGame;
	
	public Facility(Integer playerId, String email, String firstName, String lastName, String dateofGame,
			String timeofGame) {
		super();
		this.playerId = playerId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofGame = dateofGame;
		this.timeofGame = timeofGame;
	}
	public Facility() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getPlayerId() {
		return playerId;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDateofGame() {
		return dateofGame;
	}
	public String getTimeofGame() {
		return timeofGame;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateofGame(String dateofGame) {
		this.dateofGame = dateofGame;
	}
	public void setTimeofGame(String timeofGame) {
		this.timeofGame = timeofGame;
	}
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	
	
}
