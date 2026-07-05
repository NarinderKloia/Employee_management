package com.nav.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.EmployeeManagement.Entity.Branch;
@Repository
public interface BranchRepo extends JpaRepository<Branch, Long> {

}
