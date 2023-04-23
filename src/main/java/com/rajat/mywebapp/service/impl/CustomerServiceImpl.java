package com.rajat.mywebapp.service.impl;

import com.rajat.mywebapp.models.dtos.AddressDTO;
import com.rajat.mywebapp.models.dtos.CustomerDTO;
import com.rajat.mywebapp.models.entities.Customer;
import com.rajat.mywebapp.repositories.CustomerRepo;
import com.rajat.mywebapp.service.interfaces.CustomerService;
import com.rajat.mywebapp.utils.ApplicationUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private AddressServiceImpl addressService;

    @Override
    public UUID addNewCustomer(CustomerDTO dto) {
        try {
            Customer customer = repo.save(mapper.map(dto, Customer.class));
            if (dto.getAddresses() != null) {
                dto.getAddresses().forEach(addressDTO -> {
                    addressService.addNewAddress(addressDTO, customer);
                });
            }
            return customer.getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void removeExistingCustomer(UUID custID) {
        try{
            repo.delete(repo.findById(custID));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustomerDTO getCustomerByID(UUID custID) {
        try{
            Customer customer = repo.findById(custID);
            if(customer == null){
                throw new NoSuchElementException();
            }
           return mapper.map(customer, CustomerDTO.class);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

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
    public UUID updateCustomer(UUID custId, CustomerDTO dto) {
        try {
            Customer customer = repo.findById(custId);
            if(customer == null){
                throw  new NoSuchElementException();
            }
            else {
                customer.setFirstName(dto.getFirstName()!= null? dto.getFirstName() : customer.getFirstName());
                customer.setLastName(dto.getLastName()!= null? dto.getLastName() : customer.getLastName());
                customer.setAge(dto.getAge()!= 0? dto.getAge() : customer.getAge());
                customer.setOrders(dto.getOrders()!=0? dto.getOrders() : customer.getOrders());
                repo.save(customer);
                return customer.getId();
            }
    } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
