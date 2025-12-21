package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class OldProjectsssss {
	
	
	@Id
	private int EmpId;
	private String Emailid;
	private int salary;

	public OldProjectsssss() {

	}

	public int getEmpId() {
		return EmpId;
	}

	public String getEmailid() {
		return Emailid;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public OldProjectsssss(int empId, String emailid, int salary) {
		super();
		EmpId = empId;
		Emailid = emailid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "OldProject [EmpId=" + EmpId + ", Emailid=" + Emailid + ", salary=" + salary + "]";
	}

}
