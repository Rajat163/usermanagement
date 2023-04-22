package com.rajat.mywebapp.controllers;

import java.util.List;
import java.util.UUID;

import com.rajat.mywebapp.service.impl.CustomerServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rajat.mywebapp.models.dtos.CustomerDTO;


@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl service;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping()
    public String addCustomer(@RequestBody @NotNull CustomerDTO dto) {
        UUID id = service.addNewCustomer(dto);
        return "customer added successfully with ID: " + id;
    }
    //Temporarily disabling this functionlaity
   /* @PutMapping("/{id}")
    public  CustomerDTO updateCustomer(@RequestBody CustomerDTO dto, @PathVariable String id) {
        service.updateCustomer(id, dto);
        return getCustomer(id);
    }*/
    @GetMapping()
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomer(@PathVariable UUID id){
        return service.getCustomerByID(id);
    }
}
