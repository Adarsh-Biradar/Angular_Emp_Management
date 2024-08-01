package com.backend.Backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Backend.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
