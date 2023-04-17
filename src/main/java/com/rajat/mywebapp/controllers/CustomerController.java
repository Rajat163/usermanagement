package com.rajat.mywebapp.controllers;

import java.util.List;
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
        service.addNewCustomer(dto);
        return "customer added successfully...";
    }
    @PutMapping()
    public  CustomerDTO updateCustomer(@RequestBody CustomerDTO dto, @PathVariable String custId) {
        service.updateCustomer(custId, dto);
        return getCustomer(custId);
    }
    @GetMapping()
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @RequestMapping(params = "custId",method = RequestMethod.GET)
    public CustomerDTO getCustomer(@RequestParam String custId){
        return service.getCustomerByID(custId);
    }
}
