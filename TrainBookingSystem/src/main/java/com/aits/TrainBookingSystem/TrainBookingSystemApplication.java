package com.aits.TrainBookingSystem;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class TrainBookingSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TrainBookingSystemApplication.class, args);
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TrainBookingSystemApplication.class);

		TransportSystem ts=context.getBean(TransportSystem.class);
	
		//Scanner s=new Scanner(System.in);
		
		//String st=s.next();
		
		//ts.payTicket(st, "hyd", "tirupathi");
		
		ts.printobj();
	}

}
