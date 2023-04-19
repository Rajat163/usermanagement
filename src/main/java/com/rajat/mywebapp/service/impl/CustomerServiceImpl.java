package com.rajat.mywebapp.service.impl;

import com.rajat.mywebapp.models.dtos.AddressDTO;
import com.rajat.mywebapp.models.dtos.CustomerDTO;
import com.rajat.mywebapp.models.entities.Customer;
import com.rajat.mywebapp.repositories.CustomerRepo;
import com.rajat.mywebapp.service.interfaces.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private AddressServiceImpl addressService;

    @Override
    public long addNewCustomer(CustomerDTO dto) {
        Customer customer = repo.save(mapper.map(dto, Customer.class));
        if (dto.getAddresses() != null) {
            dto.getAddresses().forEach(addressDTO -> {
                addressService.addNewAddress(addressDTO,customer);
            });
        }
        return customer.getId();
    }


    @Override
    public void removeExistingCustomer(String custID) {

    }

    @Override
    public CustomerDTO getCustomerByID(String custID) {
        Optional<Customer> customer = repo.findById(Integer.parseInt(custID));
        CustomerDTO dto = mapper.map(customer, CustomerDTO.class);
        return dto;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = repo.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        customers.forEach(customer -> {
            CustomerDTO dto = mapper.map(customer, CustomerDTO.class);
            customerDTOS.add(dto);
        });
        return customerDTOS;
    }

    @Override
    public String updateCustomer(String custId, CustomerDTO dto) {
        Optional<Customer> customer = repo.findById(Integer.parseInt(custId));
        String result = "failed";
        if (customer != null) {
          repo.save(mapper.map(dto, Customer.class));
          result = "Customer Updated Successfully.....";
        }
        return result;
    }

}
