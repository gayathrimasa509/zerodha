package com.aits.employeeedemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aits.employeeedemo.entity.Employee;
import com.aits.employeeedemo.exception.EmployeeNotFound;
import com.aits.employeeedemo.exception.HikeIsInvalidException;
import com.aits.employeeedemo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	//business logic
	@Autowired
	EmployeeRepository er;
	
	public void insert(Employee emp) {
		
		er.save(emp);
	}

	@Transactional
	public Employee updateSalary(double hike,int id){
		// TODO Auto-generated method stub
		
		//condition is sal should not hike more than 1000
		
		Employee emp=er.findById(id).orElseThrow(()->new EmployeeNotFound("emp not found"));
		
		if(hike>1000) {
			
			throw new HikeIsInvalidException("Hike is not Valid"); 
		}
		
		emp.setSal(emp.getSal()+hike);
		
		er.save(emp);
		return emp;
		
		
	}
}
