package com.aits.employeeedemo.exception;

public class EmployeeNotFound extends RuntimeException {

    public EmployeeNotFound(String message) {
        
    	super(message);
    }
}


//Handling exceptions globally

//i can throw same exceptions multiple times in the code..instead of using try catch everywhere if there is one block which has to be executed