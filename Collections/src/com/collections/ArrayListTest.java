package com.collections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<String>();
//		li.add(10);
//		li.add(25.0);
//		li.add(false);
		li.add("Deepak");
//		li.add(new Employee("Deepak ", 28));
//		li.set(1,10);
		//li.remove(1);
		
		System.out.println(li);
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(li);
		System.out.println(a.isEmpty());
		System.out.println(li.contains("Java"));
		

	}

}
class Employee{
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}
