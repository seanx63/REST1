package com.example.REST1.Service;

import com.example.REST1.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> searchEmployees(String query);

    Employee createEmployee(Employee product);
}
