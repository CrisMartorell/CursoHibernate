package com.openwebinars.hibernate.primerproyectohbn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
//Propiedades	
	
	@Id
	private int id;
	private String userName;
	private String userMessage;
	
//Constructor
	public User() {
		
	}

//Getters
	public int getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserMessage() {
		return userMessage;
	}
	
	
//Setters

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
}
