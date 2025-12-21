package com;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100000);

		ArrayList li = new ArrayList();
		li.add(28);
		li.add("deepak");
		li.add("new wolrd");
		li.add(new Employee("nani", 28));
		li.add(1, 28.0);
		li.remove(1);
		li.isEmpty();

		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		System.out.println(li.contains("j"));
		System.out.println(numbers);

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("nani", 28));

	}

}

class Employee {
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
