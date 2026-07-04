package com.nav.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nav.EmployeeManagement.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
