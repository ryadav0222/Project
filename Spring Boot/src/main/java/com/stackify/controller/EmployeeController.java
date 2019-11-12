package com.stackify.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackify.model.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService empServ;
	
		@RequestMapping("/hello")
		public List<Employee> getAll() 
		{
			return empServ.getAll();
		}
		
		@RequestMapping("/hello/{id}")
		public Optional<Employee> getEmployee(@PathVariable String id)
		{
			return empServ.getEmployee(id);
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/hello")
		public void addEmployee(@RequestBody Employee employee)
		{
			empServ.addEmployee(employee);
		}

		@RequestMapping(method=RequestMethod.PUT,value="/hello/{id}")
		public void updateEmployee(@RequestBody Employee employee,@PathVariable String id)
		{
			empServ.updateEmployee(id,employee);
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/hello/{id}")
		public void deleteEmployee(@PathVariable String id)
		{
			empServ.deleteEmployee(id);
		}

}
