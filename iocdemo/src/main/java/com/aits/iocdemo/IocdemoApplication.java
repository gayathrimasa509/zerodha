package com.aits.iocdemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocdemoApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(IocdemoApplication.class, args);
		
		//Tax t=new IncomeTax();
		
		//Spring to create object of Income Tax
		
		// specify the path for spring of apContext.xml....so that it reads the file and creates the obj
		
//	Two ways in creating a object in IOC
//  1. using Annotations for creating the object
				
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocdemoApplication.class);
		
		IncomeTax t=context.getBean(IncomeTax.class);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Payment mode");
		
		String paymode=s.next();
		
		t.setTaxableAmount(500000);
		
		t.calculateTaxAmount();
		
		t.payTax(paymode);
		
		//2. using applicationContext.xml file for creating the object
		
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
//      PropertyTax p=(PropertyTax) context.getBean("propertyTax");
		
//		p.setTaxableAmount(1000000);
		
//		p.calculateTaxAmount();
		
//		p.payTax();
		
	
	}

}
