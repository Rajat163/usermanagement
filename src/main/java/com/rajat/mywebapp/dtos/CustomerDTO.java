package com.rajat.mywebapp.dtos;

import java.util.List;

import com.rajat.mywebapp.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDTO {
    private String firstName;
    private String lastName;
    private int age;
    private int orders;
    private List<AddressDTO> addresses;

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

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    //Method to write details of new customer
    public Customer writeToNewCustomer() {
        Customer customer = new Customer();

        if (this.getFirstName() != null) {
            customer.setFirstName(firstName);
        }
        if (this.getLastName() != null) {
            customer.setLastName(lastName);
        }
        if (this.getAge() > 0) {
            customer.setAge(age);
        }
        if (this.getOrders() > 0) {
            customer.setOrders(orders);
        }
        if (this.getAddresses() != null) {
            for (AddressDTO address : addresses) {

            }
        }
        return customer;

    }

    // Method to update the details of existing customer
    public void updateExistingCustomer(Customer customerToUpdate) {
        if (this.getFirstName() != null) {
            customerToUpdate.setFirstName(this.getFirstName());
        }
        if (this.getLastName() != null) {
            customerToUpdate.setLastName(this.getLastName());
        }
        if (this.getAge() > 0) {
            customerToUpdate.setAge(this.getAge());
        }
        if (this.getOrders() > 0) {
            customerToUpdate.setOrders(this.getOrders());
        }
    }
}
