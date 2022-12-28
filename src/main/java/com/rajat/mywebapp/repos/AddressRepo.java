package com.rajat.mywebapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.mywebapp.models.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
