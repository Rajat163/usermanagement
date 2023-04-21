package com.rajat.mywebapp.models.entities;

import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Transactional
@Entity
@Table(name = "customer")
@Data
public class Customer {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id",length =255)
	private UUID id;
	private String firstName;
	private String lastName;
	private int age;
	private int orders;
	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}