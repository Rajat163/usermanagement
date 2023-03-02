package com.rajat.mywebapp.controllers;

import com.rajat.mywebapp.models.entities.dtos.AddressDTO;
import com.rajat.mywebapp.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@Autowired
	private AddressServiceImpl service;

	@PostMapping("/createAddress")
	public String addAddress(@RequestBody AddressDTO dto) {
		return "Address Added Successfully.....";
	}
}
