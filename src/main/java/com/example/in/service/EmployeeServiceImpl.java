package com.example.in.service;

import com.example.in.entity.Employee;
import com.example.in.repo.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j2
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee emp=employeeRepository.save(employee);
        System.out.println("Employee with ID :{}"+emp.getEmployeeId()+"Saved Successfully");
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees=employeeRepository.findAll();
        log.info("All Employees {}",allEmployees);
        return allEmployees;
    }

    @Override
    public Employee getEmployee(Integer eid) {
        Employee emp=employeeRepository.findById(eid).get();
        log.info(emp);
        return emp;
    }
}
