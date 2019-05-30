package com.springboot.springbootrestapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootrestapi.dao.EmployeeDao;
import com.springboot.springbootrestapi.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;	
	
	/*To create student*/
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeDao.create(emp);
	}
	
	/*get all students*/
	@GetMapping("/employees")
	public List<Employee> getallEmployees(){
		return employeeDao.findAll();
	}
	
	/*get student by id*/
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empid){
		Employee emp=employeeDao.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	
	/*update student details*/
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid, @Valid @RequestBody Employee empDetails){
		Employee emp=employeeDao.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		emp.setId(empDetails.getId());
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setExpertise(empDetails.getExpertise());
		emp.setCreatedAt(empDetails.getCreatedAt());
		Employee updateEmployee=employeeDao.create(emp);
		return ResponseEntity.ok().body(updateEmployee);
	}
	
	/*DElete student*/
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long empid){
		Employee emp=employeeDao.findOne(empid);	
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		employeeDao.delete(emp);
		return ResponseEntity.ok().build();
	}
}
