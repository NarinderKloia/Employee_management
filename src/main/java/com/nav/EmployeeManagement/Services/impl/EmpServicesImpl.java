package com.nav.EmployeeManagement.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.EmployeeManagement.Entity.Employee;
import com.nav.EmployeeManagement.Repository.EmpRepo;
import com.nav.EmployeeManagement.Services.EmpServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpServicesImpl implements EmpServices {
    public final EmpRepo repo;

    @Override
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee updatEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);
        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setBranch(employee.getBranch());
        return repo.save(existing);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new RuntimeException("Employee not found by this id"));
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

}
