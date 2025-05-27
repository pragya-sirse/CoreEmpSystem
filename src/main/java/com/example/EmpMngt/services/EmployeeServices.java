package com.example.EmpMngt.services;

import com.example.EmpMngt.model.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
