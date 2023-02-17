package com.rajat.mywebapp.utils;

import com.rajat.mywebapp.dtos.AddressDTO;
import com.rajat.mywebapp.models.Address;
import com.rajat.mywebapp.repos.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressUtil {
    @Autowired
    AddressRepo repo;

    public void addNewAddress(AddressDTO dto) {
        Address address = dto.writeToNewAddress();
        repo.save(address);
    }
}
