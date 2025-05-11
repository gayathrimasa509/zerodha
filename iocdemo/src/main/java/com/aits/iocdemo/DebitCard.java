package com.aits.iocdemo;

import org.springframework.stereotype.Component;

@Component("debitcard")
public class DebitCard implements PaymentProcessor {

	@Override
	public void doPayment() {

		System.out.println("Payment done through Debit card");
	}

}
