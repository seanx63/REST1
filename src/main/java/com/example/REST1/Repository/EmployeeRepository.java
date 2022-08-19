package com.example.REST1.Repository;

import com.example.REST1.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT p FROM Employee p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.title LIKE CONCAT('%', :query, '%')")
    List<Employee> searchEmployees(String query);
}