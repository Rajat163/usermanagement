package com.rajat.mywebapp.service.impl;

import com.rajat.mywebapp.models.dtos.AddressDTO;
import com.rajat.mywebapp.models.dtos.CustomerDTO;
import com.rajat.mywebapp.models.entities.Address;
import com.rajat.mywebapp.models.entities.Customer;
import com.rajat.mywebapp.repositories.AddressRepo;
import com.rajat.mywebapp.service.interfaces.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addNewAddress(AddressDTO dto, Customer customer) {
      Address address = mapper.map(dto,Address.class);
      address.setCustomer(customer);
        repo.save(address);
    }

    @Override
    public void updateAddress(String Id) {

    }

    @Override
    public void removeAddress(String Id) {

    }
}
