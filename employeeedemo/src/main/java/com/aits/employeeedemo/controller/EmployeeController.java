package com.aits.employeeedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aits.employeeedemo.entity.Employee;
import com.aits.employeeedemo.service.EmployeeService;

@RestController
public class EmployeeController {

	//this class should communicate to service.. add Service class..
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/employeess")
	public ResponseEntity<Employee> insert(@RequestBody Employee emp){
		
		//send the object to service layer
		
		es.insert(emp);
		
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	}
	
	
	//http://localhost:8080/employeess/1?hike=500
	
	@PutMapping("employeess/{id}")
	public ResponseEntity<Employee> updateSalary(@RequestParam double hike,@PathVariable int id){
		
		Employee em=es.updateSalary(hike,id);
		
		return new ResponseEntity<Employee>(em,HttpStatus.OK);
		
	}
}