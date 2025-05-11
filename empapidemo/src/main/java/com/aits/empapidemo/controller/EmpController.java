package com.aits.empapidemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aits.empapidemo.EmpRepository;
import com.aits.empapidemo.Employeee;



@Controller
public class EmpController {

	@Autowired
	EmpRepository er;
	
	@GetMapping("/employees/{id}")
	@ResponseBody
    public Optional<Employeee> display(@PathVariable Long id) {
		
		return er.findById(id);
		
	}
	
	@PostMapping("/employees")
	@ResponseBody
	public Employeee insert(@RequestBody Employeee emp) {
		
		er.save(emp);
		
		return emp;
	}
	
	@PutMapping("/employees/{id}")
	@ResponseBody
	public Employeee update(@RequestBody Employeee emp,@PathVariable Long id) {
		
		
		if(er.existsById(id)) {
			
		emp.setId(id);
			er.save(emp);
			
			return emp;
			
		}
		
		else {
			
			return null;
		}
		
		
	}
	
	@GetMapping("/employees")
	@ResponseBody
	public List <Employeee> display(){
		
		return (List<Employeee>) er.findAll();
	}
}
