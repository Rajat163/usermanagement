package com.rajat.mywebapp.service.impl;

import com.rajat.mywebapp.models.dtos.AddressDTO;
import com.rajat.mywebapp.models.entities.Address;
import com.rajat.mywebapp.repositories.AddressRepo;
import com.rajat.mywebapp.service.interfaces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo repo;

    @Override
    public void addNewAddress(AddressDTO dto) {
        Address address = new Address();
        if (dto.getAddressLine1() != null) {
            address.setAddressLine1(dto.getAddressLine1());
        }

        if (dto.getAddressLine2() != null) {
            address.setAddressLine2(dto.getAddressLine2());
        }

        if (dto.getCity() != null) {
            address.setCity(dto.getCity());
        }

        if (dto.getCountry() != null) {
            address.setCountry(dto.getCountry());
        }

        if (dto.getPincode() > 0) {
            address.setPincode(dto.getPincode());
        }

        address.setPrimaryAddress(dto.isPrimaryAddress());
        repo.save(address);
    }

    @Override
    public void updateAddress(String Id) {

    }

    @Override
    public void removeAddress(String Id) {

    }
}
