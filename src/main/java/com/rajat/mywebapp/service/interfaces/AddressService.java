package com.rajat.mywebapp.service.interfaces;

import com.rajat.mywebapp.dtos.AddressDTO;

public interface AddressService {
    public abstract void addNewAddress(AddressDTO dto);
    public abstract void updateAddress(String Id);
    public abstract void removeAddress(String Id);
}
