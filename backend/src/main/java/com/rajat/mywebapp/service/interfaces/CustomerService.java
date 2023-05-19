package com.rajat.mywebapp.service.interfaces;

import com.rajat.mywebapp.models.dtos.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public abstract String addNewCustomer(CustomerDTO dto);
    public abstract void removeExistingCustomer(String customerID);
    public abstract CustomerDTO getCustomerByID(String customerID);
    public abstract List<CustomerDTO> getAllCustomers();
    public abstract String updateCustomer(String customerId,CustomerDTO dto);
}
