package com.rajat.mywebapp.controllers;

import com.rajat.mywebapp.dtos.AddressDTO;
import com.rajat.mywebapp.utils.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@Autowired
	AddressUtil util;

	@PostMapping("/createAddress")
	public String addAddress(@RequestBody AddressDTO dto) {
		util.addNewAddress(dto);
		return "Address Added Successfully.....";
	}
}
