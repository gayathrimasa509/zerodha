package com.aits.employeeedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import com.aits.employeeedemo.entity.Employee;
import com.aits.employeeedemo.repo.EmployeeRepository;

@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository er;
	
	@Test
	@Rollback(false)
	void testSaveAndFindById() {
		
		Employee emp=new Employee();
		emp.setName("John");
		emp.setSal(1000);
		
		Employee emp1=er.save(emp);
		
		
		
		assertFalse(5>10);  //negative test
		assertTrue(5<10);    //positive test
		
//		Employee emp5=null;
//		assertNull(emp5);
		
		assertThrows(ArithmeticException.class,()-> {int c=(5/0);});
		//assertThrows(NullPointerException.class,()-> {int c=(5/0);});
		//the above line throws error because we are giving the parameter contains ArithmeticException
		
		
		//Never compare two objects
		//assertEquals(emp,emp1);
		assertEquals("John",emp1.getName());
		assertEquals(1000,emp1.getSal());
		
		Optional<Employee> emp2=er.findById(1);
		
		assertEquals("Ram",emp2.get().getName());
		}
}
