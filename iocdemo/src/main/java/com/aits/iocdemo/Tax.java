package com.aits.iocdemo;

public interface Tax {

	void setTaxableAmount(double amt);
	
	void calculateTaxAmount();
	
	double getTaxAmount();
	
	String getTaxType();
	
	boolean isTaxPayed();
	
	void payTax(String paymode);
	
}
