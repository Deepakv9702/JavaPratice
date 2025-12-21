package com.flm.oops;

public class Student {

	int marks;
	int percentage;
	String grad;
	String rank;
	
	
	void pass() {
		if(marks >=50 && marks <=100);
		System.out.println("print " + marks);
	}
	void percentages() {
		percentage = (marks/100) ;
		System.out.println("print percentage ::" + percentage);
	}
	void grades() {
		if(percentage >=70 );
		System.out.println("print grades first rank" );
	}
	
}
