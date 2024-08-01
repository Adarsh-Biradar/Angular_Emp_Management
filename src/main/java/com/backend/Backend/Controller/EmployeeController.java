package com.backend.Backend.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.Backend.model.Employee;
import com.backend.Backend.service.EmployeeService;

@RestController
@RequestMapping("employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        try {
            String result = employeeService.addEmployee(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error adding employee");
        }
    }
}
