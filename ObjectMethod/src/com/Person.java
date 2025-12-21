package com;

public class Person {

	int ages = 2023232;
	String names = "zzzzz"; /////////// person 4

	int age; /////// person 1
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	} ////////////// person 2

	public Person() {
		System.out.println("newworlrf");

	} //////////// person3

	public static void main(String[] args) {

		Person person1 = new Person();

		person1.age = 20;
		person1.name = "asdf";
		System.out.println(person1.age);
		System.out.println(person1.name);

		Person person2 = new Person(30, "new");
		System.out.println(person2.age);
		System.out.println(person2.name);

		Person person3 = new Person();
		person3.setAge(26);
		person3.setName("nnnnnn");
		System.out.println(person3.getAge());
		System.out.println(person3.getName());

		Person person4 = new Person();
		System.out.println(person4.ages);
		System.out.println(person4.names);

		boolean equals = person1.equals(person2);
		System.out.println(equals);

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

}
