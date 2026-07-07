package com.nav.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.EmployeeManagement.Entity.Employee;
import com.nav.EmployeeManagement.Services.impl.EmpServicesImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class EmpController {
    public final EmpServicesImpl service;

    @PostMapping
    Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    };

    @GetMapping("/getall")
    List<Employee> getEmployee() {
        return service.getEmployee();
    };

    @PutMapping("/{id}")
    Employee updatEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return service.updatEmployee(id, employee);
    };

    @GetMapping("/{id}")
    Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    };

    @DeleteMapping("/{id}")
    String deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    };

}
