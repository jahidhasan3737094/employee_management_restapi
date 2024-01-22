package com.learn.employee_management.service;

import com.learn.employee_management.model.Employee;
import com.learn.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;

    //add employee data
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee>getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Integer id,Employee newEmployee){
        Employee oldEmployee=this.employeeRepository.findById(id).get();
        oldEmployee.setFirstName(newEmployee.getFirstName());
        oldEmployee.setLastName(newEmployee.getLastName());
        oldEmployee.setLocation(newEmployee.getLocation());
        oldEmployee.setSalary(newEmployee.getSalary());
        oldEmployee.setNoOfYearsOfExperience(newEmployee.getNoOfYearsOfExperience());
        this.employeeRepository.save(oldEmployee);

        return oldEmployee;
    }
//delete employee
    public void deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
    }
    //search specific employee

    public Employee searchEmployee(Integer id){
        Employee employee=this.employeeRepository.findById(id).get();
        return employee;
    }
}
