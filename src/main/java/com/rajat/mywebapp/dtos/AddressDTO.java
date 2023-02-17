package com.rajat.mywebapp.dtos;

import com.rajat.mywebapp.models.Address;

public class AddressDTO {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private int pincode;
    private boolean isPrimaryAddress;
    private String country;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        isPrimaryAddress = primaryAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address writeToNewAddress() {
        Address address = new Address();
        if (this.getAddressLine1() != null) {
            address.setAddressLine1(this.getAddressLine1());
        }
        if (this.getAddressLine2() != null) {
            address.setAddressLine2(this.getAddressLine2());
        }
        if (this.getCity() != null) {
            address.setCity(this.getCity());
        }
        if (this.getPincode() > 0) {
            address.setPincode(this.getPincode());
        }

        address.setPrimaryAddress(this.isPrimaryAddress);

        if (this.country != null) {
            address.setCountry(this.country);
        }
        return address;
    }
}
