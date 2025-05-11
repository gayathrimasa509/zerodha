package com.aits.TrainBookingSystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("busservice")
@Scope("prototype")
public class BusService implements TransportService {

	@Override
	public void bookTicket(String src,String dest) {
		
		System.out.println("Travelling through Bus from "+src+ " to "+dest);
	}

}
