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

import com.nav.EmployeeManagement.Entity.Branch;
import com.nav.EmployeeManagement.Services.BranchServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/branch")
@RequiredArgsConstructor
public class BranchController {
    public final BranchServices services;

    @PostMapping
    Branch addBranch(@RequestBody Branch Branch) {
        return services.addBranch(Branch);
    };

    @GetMapping
    List<Branch> getBranch() {
        return services.getBranch();
    };

    @PutMapping("/{id}")
    Branch updatBranch(@PathVariable Long id, @RequestBody Branch Branch) {
        return services.updatBranch(id, Branch);
    };

    @GetMapping("/{id}")
    Branch getBranchById(@PathVariable Long id) {
        return services.getBranchById(id);
    };

    @DeleteMapping("/{id}")
    String deleteBranch(@PathVariable Long id) {
        return services.deleteBranch(id);
    };

}
