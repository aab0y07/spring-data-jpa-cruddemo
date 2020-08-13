package com.aaboy07.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaboy07.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
}
