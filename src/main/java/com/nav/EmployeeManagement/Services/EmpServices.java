package com.nav.EmployeeManagement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.EmployeeManagement.Entity.Employee;

@Service
public interface EmpServices {
    Employee addEmployee(Employee employee);

    List<Employee> getEmployee();

    Employee updatEmployee(Long id, Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);

}