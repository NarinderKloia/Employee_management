package com.nav.EmployeeManagement.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.EmployeeManagement.Entity.Branch;
import com.nav.EmployeeManagement.Repository.BranchRepo;
import com.nav.EmployeeManagement.Services.BranchServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BranchServicesImpl implements BranchServices{
    
    public final BranchRepo repo;

    @Override
    public Branch addBranch(Branch Branch) {
       return repo.save(Branch);
    }

    @Override
    public List<Branch> getBranch() {
       return repo.findAll();
    }

    @Override
    public Branch updatBranch(Long id, Branch Branch) {
        Branch existing = getBranchById(id);
        existing.setBranchName(Branch.getBranchName());
       return repo.save(existing);
    }

    @Override
    public Branch getBranchById(Long id) {
        return repo.findById(id).orElseThrow(
            ()-> new RuntimeException("Brach not found")
        );
    }

    @Override
    public String deleteBranch(Long id) {
      repo.deleteById(id);
      return "Deleting succeessfully";
    }

    
}