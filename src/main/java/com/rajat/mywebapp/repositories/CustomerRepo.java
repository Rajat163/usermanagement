package com.rajat.mywebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.mywebapp.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
