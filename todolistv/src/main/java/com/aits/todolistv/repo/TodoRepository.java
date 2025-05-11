package com.aits.todolistv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.todolistv.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	Todo findByCompleted(boolean completed);
}
