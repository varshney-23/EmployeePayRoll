package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.Interface.IEmployeeAyu;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeAyu iemployeeayu;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return iemployeeayu.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return iemployeeayu.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return iemployeeayu.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        return iemployeeayu.updateEmployee(id, updatedEmployee);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        iemployeeayu.deleteEmployee(id);
    }
}
