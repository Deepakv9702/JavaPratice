package com;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
	
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("enter the number 1 ::");
		int num1 = sc.nextInt();
		
		System.out.println("enter the number 2 ::");
		int num2 = sc.nextInt();
		
		
		
		int num3 = num1/num2;
		System.out.println("after division " + num3);
	} catch(ArithmeticException e) {
		
		System.out.println(e);
		System.out.println("byeeee.......");
	}catch (Exception e) {
		System.out.println(e);
	}
		
	}

}
