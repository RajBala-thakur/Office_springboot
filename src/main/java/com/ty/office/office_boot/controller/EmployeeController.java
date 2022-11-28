package com.ty.office.office_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.office.office_boot.dao.EmployeeDao;
import com.ty.office.office_boot.dto.Employee;

@RestController
public class EmployeeController {
	@Autowired EmployeeDao dao;
	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return dao.saveEmployee(employee);
	}
	@GetMapping("get")
	public Employee FindById(@RequestParam int  id)
	{
		return dao.getById(id);
	}
	@DeleteMapping("delete")
	public String deleteEmployee(@RequestParam int id)
	{
		return dao.deleteEmployee(id);
		
	}

}
