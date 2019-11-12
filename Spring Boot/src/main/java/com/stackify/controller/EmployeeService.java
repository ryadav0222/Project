package com.stackify.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackify.model.Employee;
import com.stackify.repository.EmployeeRepository;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAll()
	{
		List<Employee>employee=new ArrayList<>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}
	
	public Optional<Employee> getEmployee(String id)
	{
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String id,Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id)
	{
		employeeRepository.deleteById(id);
	}
			
}
