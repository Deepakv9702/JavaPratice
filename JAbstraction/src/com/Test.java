package com;

public class Test {
	
	public static void main(String[] args) {
		
		
		Lion lion = new Lion();
		lion.sound();
		lion.sleeping();
		
		Dog dog = new Dog();
		dog.sound();
		dog.sleeping();
		
		
		VechileCar v = new VechileCar();
		v.start();
		System.out.println(Vehicle.price);
		
		
		Airtel a = new Airtel();
		a.calling();
		
		
		
		Jio j = new Jio();
		j.calling();
		
	}
	
	
	

}
