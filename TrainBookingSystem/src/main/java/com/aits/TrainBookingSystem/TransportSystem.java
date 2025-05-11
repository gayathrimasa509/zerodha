package com.aits.TrainBookingSystem;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransportSystem  {

//	Map<String,TransportService> pp;
//	
//	public TransportSystem(Map<String, TransportService> pp) {
//		
//		this.pp=pp;
//	}
//	
//	@Override
//	public void payTicket(String serviceType,String src,String dest) {
//		TransportService t=pp.get(serviceType);
//		t.bookTicket(src, dest);
//	}
	
	@Autowired
	BusService bs1;
	
	@Autowired
	BusService bs2;
	public void printobj() {
		System.out.println("busservice object id is "+bs1);
		System.out.println("busservice object id is "+bs2);
	}

	

}
