package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private int empId;
	private String email;
	@Id
	private double salary;
	
	
	public Employee() {
		
	}




	public int getEmpId() {
		return empId;
	}




	public String getEmail() {
		return email;
	}




	public double getSalary() {
		return salary;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public Employee(int empId, String email, double salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}
	
	


}
