package com.model.many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String name;
	private String mobileNumber;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<Order> orders;

	public Person(String string, String string2) {
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}

	public int getPersonId() {
		return personId;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Person(int personId, String name, String mobileNumber) {
		super();
		this.personId = personId;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}
