package com.codeclan.example.employeetrackingservice.repositories;

import com.codeclan.example.employeetrackingservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
