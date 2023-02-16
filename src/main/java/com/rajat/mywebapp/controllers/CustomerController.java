package com.rajat.mywebapp.controllers;

import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.mywebapp.DTO.CustomerDTO;
import com.rajat.mywebapp.models.Customer;
import com.rajat.mywebapp.repos.CustomerRepo;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepo repo;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/createCustomer")
    public String addCustomer(@RequestBody @NotNull CustomerDTO dto) {
        Customer customer = dto.writeToNewCustomer();
        repo.save(customer);
        return "customer added successfully...";
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @GetMapping("/getCustomer/{custId}")
    public Optional<Customer> getCustomer(@PathVariable int custId) {
        Optional<Customer> customer = repo.findById(custId);
        return customer;
    }

    @PutMapping("/updateCustomer/{custId}")
    public String updateCustomer(@RequestBody CustomerDTO dto, @PathVariable int custId) {
        Customer customerToUpdate ;
        try {
            customerToUpdate = repo.findById(custId).orElseThrow();
            dto.updateExistingCustomer(customerToUpdate);
            repo.save(customerToUpdate);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return "customer updated successfully";
    }


}
