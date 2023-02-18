package com.rajat.mywebapp.service.interfaces;

import com.rajat.mywebapp.dtos.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    public abstract void addNewCustomer(CustomerDTO dto);
    public abstract void removeExistingCustomer(String custID);
    public abstract CustomerDTO getCustomerByID(String custID);
    public abstract List<CustomerDTO> getAllCustomers();
    public abstract CustomerDTO updateCustomer(String custId,CustomerDTO dto);
}
