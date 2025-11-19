package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.Interface.IEmployeeAyu;
import com.bridgelabz.employeepayrollapp.model.EmployeeAyu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeAyu iemployeeayu;

    @GetMapping("/all")
    public List<EmployeeAyu> getAllEmployees() {
        return iemployeeayu.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeeAyu getEmployeeById(@PathVariable int id) {
        return iemployeeayu.getEmployeeById(id);
    }

    @PostMapping("/add")
    public EmployeeAyu addEmployee(@RequestBody EmployeeAyu employee) {
        return iemployeeayu.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public EmployeeAyu updateEmployee(@PathVariable int id, @RequestBody EmployeeAyu updatedEmployee) {
        return iemployeeayu.updateEmployee(id, updatedEmployee);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        iemployeeayu.deleteEmployee(id);
    }
}
