package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passport {
	
	@Id
	private int passportNumber;
	private String issuedPlace;
	
	
	public Passport() {
		
	}


	public Passport(int passportNumber, String issuedPlace) {
		super();
		this.passportNumber = passportNumber;
		this.issuedPlace = issuedPlace;
	}


	public int getPassportNumber() {
		return passportNumber;
	}


	public String getIssuedPlace() {
		return issuedPlace;
	}


	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}


	public void setIssuedPlace(String issuedPlace) {
		this.issuedPlace = issuedPlace;
	}


	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", issuedPlace=" + issuedPlace + "]";
	}
	
	

}
