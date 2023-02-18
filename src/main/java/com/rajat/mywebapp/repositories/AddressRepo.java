package com.rajat.mywebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.mywebapp.models.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
