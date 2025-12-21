package com;

public class Atm {
	
	private double balance ;
	private double depositAmount;
	private double withdrawAmount;
	
	
	public Atm() {
		super();
		
	}



	public double getBalance() {
		return balance;
	}


	public double getDepositAmount() {
		return depositAmount;
	}


	public double getWithdrawAmount() {
		return withdrawAmount;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}


	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}


	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	
	
	
	
	
	

}
