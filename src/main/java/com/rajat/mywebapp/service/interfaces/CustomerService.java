package com.rajat.mywebapp.service.interfaces;

import com.rajat.mywebapp.models.dtos.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface CustomerService {
    public abstract UUID addNewCustomer(CustomerDTO dto);
    public abstract void removeExistingCustomer(String custID);
    public abstract CustomerDTO getCustomerByID(UUID custID);
    public abstract List<CustomerDTO> getAllCustomers();
    public abstract String updateCustomer(String custId,CustomerDTO dto);
}
