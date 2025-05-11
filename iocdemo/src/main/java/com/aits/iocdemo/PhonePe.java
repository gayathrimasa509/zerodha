package com.aits.iocdemo;

import org.springframework.stereotype.Component;

@Component("phonepe")
public class PhonePe implements PaymentProcessor {

	@Override
	public void doPayment() {

		System.out.println("Payment done through Phone pe");
	}

}
