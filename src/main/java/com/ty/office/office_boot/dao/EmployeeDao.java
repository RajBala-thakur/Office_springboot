package com.ty.office.office_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.office.office_boot.dto.Employee;
import com.ty.office.office_boot.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired EmployeeRepo repo;
	
	public Employee saveEmployee(Employee employee)
	{
		return repo.save(employee);
	}
	public Employee getById(int id)
	{
		return repo.findById(id).get();
	}
	public String deleteEmployee(int id)
	{
		repo.deleteById(id);
		return"deleted";
	}

}
