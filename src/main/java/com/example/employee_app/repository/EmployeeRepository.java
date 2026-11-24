package com.example.employee_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_app.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
