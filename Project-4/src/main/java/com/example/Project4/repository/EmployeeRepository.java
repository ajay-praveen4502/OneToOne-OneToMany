package com.example.Project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project4.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
