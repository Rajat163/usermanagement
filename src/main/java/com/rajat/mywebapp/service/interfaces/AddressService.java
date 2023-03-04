package com.rajat.mywebapp.service.interfaces;

import com.rajat.mywebapp.models.dtos.AddressDTO;
import com.rajat.mywebapp.models.dtos.CustomerDTO;
import com.rajat.mywebapp.models.entities.Customer;

public interface AddressService {
    public abstract void addNewAddress(AddressDTO dto, Customer customer);
    public abstract void updateAddress(String Id);
    public abstract void removeAddress(String Id);
}
