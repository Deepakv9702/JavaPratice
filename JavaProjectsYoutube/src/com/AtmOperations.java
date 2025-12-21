package com;

public class AtmOperations implements AtmInterface{
	
	Atm atm = new Atm();

	@Override
	public void viewBalance() {
		System.out.println("avabile bal " + atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("depositedAmount ::" + depositAmount );
		
	}

	@Override
	public void viewMiniStatement() {
		
	}

}
