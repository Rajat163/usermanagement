package com.rajat.mywebapp.models.entities;

import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;


@Transactional
@Entity
@Table(name = "customer")
@Data
public class Customer {
	@Id
	@GeneratedValue
	@UuidGenerator()
	@Column(name = "id", length = 128)
	private String Id;
	private String firstName;
	private String lastName;
	private int age;
	private int orders;
	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
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