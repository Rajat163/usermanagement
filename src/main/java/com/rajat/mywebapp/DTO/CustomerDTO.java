package com.rajat.mywebapp.DTO;

import java.util.List;

import com.rajat.mywebapp.models.Address;
import com.rajat.mywebapp.models.Customer;

public class CustomerDTO {
    private String firstName;
    private String lastName;
    private int age;
    private int orders;
    private List<Address> addresses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Customer writeToNewCustomer() {
         Customer customer = new Customer();
        if(getFirstName() != null ){customer.setFirstName(firstName);}
        if(getLastName() != null){customer.setLastName(lastName);}
        customer.setAge(age);
        customer.setOrders(orders);
        customer.setAddresses(addresses);
        return customer;

    }
}
