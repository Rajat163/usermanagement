package com.rajat.mywebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.mywebapp.models.entities.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer>{
        public Customer findById(String uuid) throws RuntimeException;
}
