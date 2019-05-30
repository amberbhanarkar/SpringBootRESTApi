package com.springboot.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootrestapi.model.Employee;
import com.springboot.springbootrestapi.model.repository.EmployeeRepository;
@Service
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*To create a employee*/
	public Employee create(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	/*Read employee Details*/
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/*Update employee details*/
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	
	/*Delete a Employee*/
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
