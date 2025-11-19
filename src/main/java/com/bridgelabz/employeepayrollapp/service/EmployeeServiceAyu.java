package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.Interface.IEmployeeAyu;
import com.bridgelabz.employeepayrollapp.model.EmployeeAyu;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceAyu implements IEmployeeAyu {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeAyu> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeAyu getEmployeeById(int id) {
        Optional<EmployeeAyu> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public EmployeeAyu addEmployee(EmployeeAyu employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeAyu updateEmployee(int id, EmployeeAyu updatedEmployee) {
        if (employeeRepository.existsById(id)) {
            updatedEmployee.setId(id);
            return employeeRepository.save(updatedEmployee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
