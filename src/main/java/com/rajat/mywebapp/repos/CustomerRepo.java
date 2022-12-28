package com.rajat.mywebapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.mywebapp.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
