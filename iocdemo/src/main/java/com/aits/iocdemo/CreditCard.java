package com.aits.iocdemo;

import org.springframework.stereotype.Component;

@Component("creditcard")
public class CreditCard implements PaymentProcessor {

	@Override
	public void doPayment() {

		System.out.println("Payment done through Credit card");
	
	}

}
