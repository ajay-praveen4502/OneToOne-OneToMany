package com.example.Project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project4.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
