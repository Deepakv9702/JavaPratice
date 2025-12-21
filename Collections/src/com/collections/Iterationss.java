package com.collections;

import java.util.ArrayList;

public class Iterationss {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Deepak");
		Student s2 = new Student(2, "Deep");
		Student s3 = new Student(3, "Deepu");
		Student s4 = new Student(4, "Nani");
		
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		for(Student student: s) {
			
		}
		
		
	}

}

class Student{
	int id ;
	String name;
	
	public Student(){
		
	}
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
