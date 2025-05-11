package com.aits.TrainBookingSystem;

import org.springframework.stereotype.Component;

@Component("trainservice")
public class TrainService implements TransportService {

	@Override
	public void bookTicket(String src,String dest) {

		System.out.println("Travelling through train from "+src+" to "+dest);
	}

}
