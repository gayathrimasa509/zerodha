package com.aits.employeeedemo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.aits.employeeedemo.entity.Employee;
import com.aits.employeeedemo.exception.EmployeeNotFound;
import com.aits.employeeedemo.exception.HikeIsInvalidException;
import com.aits.employeeedemo.repo.EmployeeRepository;
import com.aits.employeeedemo.service.EmployeeService;
 

//@SpringBootTest
class EmployeeServiceTest {
 
    @InjectMocks
    private EmployeeService employeeService;
 
    @Mock
    private EmployeeRepository employeeRepository;
    
    //EmployeeRepository er=Mockito.mock(EmployeeRepository.class);
    
    @BeforeEach
    void setUp() {
       MockitoAnnotations.openMocks(this); //or @SpringBootTest before class
       //the above line or the line 23 both creates the mock object we can use only one..
        
        //employeeService=new EmployeeService(employeeRepository);
    }
 
    @Test
    void testInsertEmployee() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        emp.setSal(3000);
 
     //before going for actual insertion call..you are giving a caution..if you find the code like save()..just return emp  
      Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
 
     // Assertions.assertThrows(emp,() -> employeeService.insert(emp)) ;
// Assertions.assertEquals(emp,emp);
     
       Assertions.assertDoesNotThrow(() -> employeeService.insert(emp));
    }
 
    @Test
    void testUpdateSalarySuccess() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        emp.setSal(3000);
 
       Mockito.when(employeeRepository.findById(1)).thenReturn(Optional.of(emp));
        Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
 
        Employee updatedEmp = employeeService.updateSalary(500, 1);
 
        
        
        Assertions.assertEquals(3500, updatedEmp.getSal());
        assertEquals("John", updatedEmp.getName());
        assertEquals(1, updatedEmp.getId());
    }
 
    @Test
    void testUpdateSalary_EmployeeNotFound() {
        when(employeeRepository.findById(1)).thenReturn(Optional.empty());
 
        Exception ex = assertThrows(EmployeeNotFound.class, () -> employeeService.updateSalary(500, 1));
        assertEquals("emp not found", ex.getMessage());
    }
    @Test
    void testUpdateSalary_HikeMoreThanAllowed() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        emp.setSal(3000);
 
        when(employeeRepository.findById(1)).thenReturn(Optional.of(emp));
 
        Exception ex = assertThrows(HikeIsInvalidException.class, () -> employeeService.updateSalary(1500, 1));
        assertEquals("Hike is not Valid", ex.getMessage());
    }
    
    
    
}