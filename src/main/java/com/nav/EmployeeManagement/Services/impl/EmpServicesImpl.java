package com.nav.EmployeeManagement.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.EmployeeManagement.Entity.Branch;
import com.nav.EmployeeManagement.Entity.Employee;
import com.nav.EmployeeManagement.Repository.BranchRepo;
import com.nav.EmployeeManagement.Repository.EmpRepo;
import com.nav.EmployeeManagement.Services.EmpServices;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpServicesImpl implements EmpServices {
    public final EmpRepo repo;
    public final BranchRepo bRepo;

    @Override
    public Employee addEmployee(Employee employee) {

        Branch branch = bRepo.findById(employee.getBranch().getId())
                .orElseThrow(() -> new RuntimeException("Branch not found"));

        employee.setBranch(branch);

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
    public String deleteEmployee(Long id) {
        Employee emp = getEmployeeById(id);
        String name = emp.getName();
        repo.deleteById(id);
        return name + " has been successfully deleted from database";
    }

}
