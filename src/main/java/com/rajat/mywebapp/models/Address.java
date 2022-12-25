package com.rajat.mywebapp.models;

public class Address {
	private int id;
	private String adressLine1;
	private String addressLine2;
	private String city;
	private int pincode;
	private boolean isPrimaryAddress;
	private String country;
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine) {
		this.adressLine1 = adressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public boolean isPrimaryAddress() {
		return isPrimaryAddress;
	}

	public void setPrimaryAddress(boolean isPrimaryAddress) {
		this.isPrimaryAddress = isPrimaryAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
