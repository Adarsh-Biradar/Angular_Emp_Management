package com.backend.Backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Backend.model.Employee;
import com.backend.Backend.repo.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        
        return employeeRepo.findAll();
    }

    public String addEmployee(Employee employee) {
        try {
            employeeRepo.save(employee);
            logger.info("Successfully added employee with ID");
            return "Success";
        } catch (Exception e) {
            logger.error("Error adding employee", e);
            return "Failure";
        }
    }
}
