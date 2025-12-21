package com.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	
	public static void main(String[] args) {
		
		
		
		HashMap<Integer,String> names = new HashMap<Integer, String>();
		
		names.put(1, "Fayaz");
		names.put(2, "Mohan");
		names.put(3, "Nani");
		names.put(4, "Deepak");
		
		
		names
			.entrySet()
			.stream()
			.forEach(entry ->System.out.println(entry.getValue() + "-" + entry.getValue()));
		
		
		
		Map<String , String > courses = new HashMap<String,String>();
		courses.put("String1 ", "Courese1");
		courses.put("String2 ", "Courese2");
		courses.put("String3 ", "Courese3");
		courses.put("String4 ", "Courese4");
		
		
		

			
		
	}

}
