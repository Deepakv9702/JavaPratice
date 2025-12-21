package com.flm.poly;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(Calculator.sum());
		System.out.println(sum(10,25));
	}
	
		
	static int sum() {
		int a = 10+ 20;
		return a;
		
	}
	
	static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	

}
