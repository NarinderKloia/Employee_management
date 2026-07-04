package com.nav.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.EmployeeManagement.Entity.Employee;
import com.nav.EmployeeManagement.Services.impl.EmpServicesImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class EmpController {
    public final EmpServicesImpl service;

    Employee addEmployee(Employee employee) {
        return service.addEmployee(employee);
    };

    List<Employee> getEmployee() {
        return service.getEmployee();
    };

    Employee updatEmployee(Long id, Employee employee) {
        return service.updatEmployee(id, employee);
    };

    Employee getEmployeeById(Long id) {
        return service.getEmployeeById(id);
    };

    void deleteEmployee(Long id) {
        service.deleteEmployee(id);
    };

}
