package com.rajat.mywebapp.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String adressLine1;
	private String addressLine2;
	private String city;
	private int pincode;
	private boolean isPrimaryAddress;
	private String country;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private Customer customer;
}