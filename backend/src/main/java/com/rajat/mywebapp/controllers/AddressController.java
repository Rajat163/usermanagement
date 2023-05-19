package com.rajat.mywebapp.controllers;
import com.rajat.mywebapp.models.dtos.AddressDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@PostMapping("/createAddress")
	public String addAddress(@RequestBody AddressDTO dto) {
		return "Address Added Successfully.....";
	}
}
