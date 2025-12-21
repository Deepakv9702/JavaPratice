package com;

public class Test {
	public static void main(String[] args) {

		Runnable e = new MyThread3();

		Thread f = new Thread(e);

		f.start();

	}

}
