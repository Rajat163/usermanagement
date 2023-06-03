package com.rajat.mywebapp.controllers;

import java.util.List;

import com.rajat.mywebapp.service.impl.CustomerServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rajat.mywebapp.models.dtos.CustomerDTO;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl service;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping()
    public String addCustomer(@RequestBody @NotNull CustomerDTO dto) {
        String id = service.addNewCustomer(dto);
        return "customer added successfully with ID: " + id;
    }

    @PutMapping("/{id}")
    public  String updateCustomer(@RequestBody CustomerDTO dto, @PathVariable String id) {
        service.updateCustomer(id, dto);
        return "Customer Updated Successfully with ID: "+id;
    }
    @GetMapping()
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomer(@PathVariable String id){
        return service.getCustomerByID(id);
    }
}
