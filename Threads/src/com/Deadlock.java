

package com;

public class Deadlock {
	
	
	public static void main(String[] args) {
		
		
		ThreadsD t1 = new ThreadsD();
		ThreadD2 t2 = new ThreadD2();
		
		
		t1.start();
		t2.start();
		
	}

}
