package com.flm.oops;

public class Car {
	
	  int fuelCapacity = 40;
		Car(){
			System.out.println("print the object ");
		}
		
	
	public static void main(String[] args) {
		
		Fuelcar fc = new Fuelcar();
		fc.colorFuelcar();
	
		
		EvCars ev = new EvCars();
		ev.evCars();
		int evCost = ev.evCost;
		System.out.println(evCost);
		 String evBrand = ev.evBrand;
		 System.out.println(evBrand);
		 
		 
		 
		 HybridCar hc = new HybridCar();
		 hc.hybridCar();
		 
		 
		
	}
	


}
