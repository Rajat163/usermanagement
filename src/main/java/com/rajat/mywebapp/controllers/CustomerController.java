package com.rajat.mywebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.mywebapp.models.Customer;
import com.rajat.mywebapp.repos.CustomerRepo;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepo repo;

	@PostMapping("/createCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		repo.save(customer);
		return "customer added successfully...";
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAll() {
		return repo.findAll();
	}

}
