package com.flm.animal;

public class AcRemote extends Remote{
	
	@Override
	void turnon() {
		System.out.println("turn on remote ");
	}
	
	static void turnoff() {
		System.out.println("tv trurn off");
	}


}
