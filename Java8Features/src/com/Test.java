package com;

public class Test {

	public static void main(String[] args) {
		Vehicle bike = new Bike();
		bike.start();

		Vehicle lorry = new Vehicle() {

			@Override
			public void start() {
				System.out.println("lorry driver");

			}

		};
		lorry.start();
		
		Vehicle cars  = ()->{System.out.println("Car Started alskda;skdfja;lsdkfjas;ldf ");};
		cars.start();

	}

}
