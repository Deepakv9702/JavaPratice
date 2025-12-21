package com.nmodel;

public class Passport {
	
	private int passportNumber;
	private String issusedPlace;
	
	
	public Passport() {
		
	}


	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", issusedPlace=" + issusedPlace + "]";
	}


	public int getPassportNumber() {
		return passportNumber;
	}


	public String getIssusedPlace() {
		return issusedPlace;
	}


	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}


	public void setIssusedPlace(String issusedPlace) {
		this.issusedPlace = issusedPlace;
	}


	public Passport(int passportNumber, String issusedPlace) {
		super();
		this.passportNumber = passportNumber;
		this.issusedPlace = issusedPlace;
	}

}
