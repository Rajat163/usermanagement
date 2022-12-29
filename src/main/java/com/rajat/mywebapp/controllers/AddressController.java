package com.rajat.mywebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rajat.mywebapp.models.Address;
import com.rajat.mywebapp.repos.AddressRepo;

public class AddressController {
	
	@Autowired
	AddressRepo repo ;

	@PostMapping("/createAddress")
	public Address addAddress(@RequestBody Address address) {
		repo.save(address);
		return address;

	}
}
