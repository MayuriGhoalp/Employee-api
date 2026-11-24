package com.example.employee_app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_app.Entity.Employee;
import com.example.employee_app.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private final EmployeeRepository employeeRepository;
	
	public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
	  @PostMapping
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }
	  @GetMapping
	  public List<Employee> getAllEmployees() {
	      return employeeRepository.findAll();
	  }

}
