package com.rajat.mywebapp.controllers;

import java.util.List;
import com.rajat.mywebapp.service.impl.CustomerServiceImpl;
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
import com.rajat.mywebapp.models.entities.dtos.CustomerDTO;


@RestController
public class CustomerController {
    @Autowired
    CustomerServiceImpl service;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/createCustomer")
    public String addCustomer(@RequestBody @NotNull CustomerDTO dto) {
        service.addNewCustomer(dto);
        return "customer added successfully...";
    }

    @GetMapping("/getAllCustomers")
    public List<CustomerDTO> getAll() {
        return service.getAllCustomers();
    }

    @GetMapping("/getCustomer/{custId}")
    public CustomerDTO getCustomer(@PathVariable String custId) {
        CustomerDTO customer = service.getCustomerByID(custId);
        return customer;
    }

    @PutMapping("/updateCustomer/{custId}")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO dto, @PathVariable String custId) {
        CustomerDTO customer = service.updateCustomer(custId, dto);
        return customer;
    }
}
