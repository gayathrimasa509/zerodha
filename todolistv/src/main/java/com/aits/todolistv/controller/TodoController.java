package com.aits.todolistv.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aits.todolistv.Todo;
import com.aits.todolistv.repo.TodoRepository;
import com.aits.todolistv.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoRepository tr;
	
	@GetMapping("/todos/{id}")
	@ResponseBody
	public Optional<Todo> display(@PathVariable Long id){
		
		return tr.findById(id);
	}
	
	@PostMapping("/todos")
	@ResponseBody
	public Todo insert(@RequestBody Todo todo) {
		
		tr.save(todo);
		
		return todo;
	}
	
	@PutMapping("/todos/{id}")
	@ResponseBody
	public Todo update(@RequestBody Todo todo,@PathVariable Long id) {
		
		if(tr.existsById(id)) {
			todo.setId(id);
			tr.save(todo);
			return todo;
		}
		
		else {
			return null;
		}
	}
	
	@GetMapping("/todos")
	@ResponseBody
	public List<Todo> display(){
		
		return (List<Todo>) tr.findAll();
	}
	
}
