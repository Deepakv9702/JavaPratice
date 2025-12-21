package com;

import java.util.Random;

public class Mathsss {

	public static void main(String[] args) {
		System.out.println(Math.abs(-10));
		System.out.println(Math.max(100, 11));
		System.out.println(Math.min(100, 11));

		System.out.println(Math.round(5.4));
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.floor(5.9));
		System.out.println(Math.pow(2, 3));

		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(125));

		System.out.println(Math.tan(Math.PI / 4));

		System.out.println(Math.random());
		
		Random r = new Random();
		System.out.println(r.nextInt(1000,9999));
	}

}



