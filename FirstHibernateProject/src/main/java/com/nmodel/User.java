package com.nmodel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



public class User {
	
	@Id
	private int userId;
	private String name;
	
	private Passport passport;

	public User(int userId, String name, Passport passport) {
		super();
		this.userId = userId;
		this.name = name;
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", passport=" + passport + "]";
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
