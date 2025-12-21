package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	private int studentId;
	private String name;
	
	
	private Student() {
		
	}


	public int getStudentId() {
		return studentId;
	}


	public String getName() {
		return name;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	

}
