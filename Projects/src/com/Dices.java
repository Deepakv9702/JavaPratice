package com;

import java.util.Random;

public class Dices {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("start the dices ");
		System.out.println(sb);

		Random r = new Random();

		int sum = 0;

		for (int i = 0; i <= 6; i++) {

			int dicevalue = r.nextInt(1, 7);
			System.out.println("dice value " + dicevalue );
			sum += dicevalue;

			if (sum == 1) {
				break;
			}
		}

		System.out.println("dice sum" + " "+sum);

	}

}
