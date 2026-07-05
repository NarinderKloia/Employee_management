package com.nav.EmployeeManagement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.EmployeeManagement.Entity.Branch;

@Service
public interface BranchServices {

    Branch addBranch(Branch Branch);

    List<Branch> getBranch();

    Branch updatBranch(Long id, Branch Branch);

    Branch getBranchById(Long id);

    String deleteBranch(Long id);

}