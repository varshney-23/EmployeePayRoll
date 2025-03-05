package com.bridgelabz.employeepayrollapp.repository;


import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
