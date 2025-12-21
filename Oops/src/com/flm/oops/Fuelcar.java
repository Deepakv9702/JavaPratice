package com.flm.oops;

public class Fuelcar extends Car{
	
	void colorFuelcar() {
		System.out.println("Filling the pertrol");
		System.out.println("enter the no :::" + " " + this.fuelCapacity);
		System.out.println("enter the no :::" + " " + super.fuelCapacity);
	}
	
	public Fuelcar() {
		super();
		System.out.println("enter the car 1");
	}

//	 Fuelcar() {
//		
//	}
	
	int fuelCapacity = 50;

}
