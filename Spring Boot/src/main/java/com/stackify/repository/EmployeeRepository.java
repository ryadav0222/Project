package com.stackify.repository;

import org.springframework.data.repository.CrudRepository;

import com.stackify.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String>
{

}
