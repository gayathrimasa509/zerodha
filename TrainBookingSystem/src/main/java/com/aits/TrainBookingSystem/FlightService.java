package com.aits.TrainBookingSystem;

import org.springframework.stereotype.Component;

@Component("flightservice")
public class FlightService implements TransportService {

	@Override
	public void bookTicket(String src,String dest) {

		System.out.println("Travelling through Flight from "+src+" to "+dest);
	}

}
