package com.rajat.mywebapp.models.entities;

import java.util.List;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Transactional
@Entity
@Table(name = "customer")
public class Customer {
	@Column(name = "cust_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private int orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	/*public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
*/
/*
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/
}