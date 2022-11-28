package com.ty.office.office_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.office.office_boot.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
