package com.bridgelabz.employeepayrollapp.Interface;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IamEmployee {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int id, Employee updatedEmployee);
    void deleteEmployee(int id);
}
