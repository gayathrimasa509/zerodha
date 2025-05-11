package com.aits.iocdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IncomeTax implements Tax{
	
//	//@AutoWired
//	CreditCard cd;
//	
//	//Constructor Injection  and Setter method
//	public IncomeTax(CreditCard cd) {
//		
//		this.cd=cd;
//	}
	
	//PaymentProcessor p;
	
    //public IncomeTax(@Qualifier("phonepe")PaymentProcessor p) {
		
		//this.p=p;
	//}
	
	Map<String,PaymentProcessor> pp;
	
	public IncomeTax(Map<String, PaymentProcessor> pp) {
		
		this.pp=pp;
	}
	
	
    private double taxableAmount;
	
	private double taxAmount;
	
	private boolean isTaxPayed=false;
	
	private String taxType="Savings";
	
	@Override
    public void setTaxableAmount(double amt) {
	
		this.taxableAmount=amt;
    }
	
	@Override
	public void calculateTaxAmount() {
		
		if(this.taxableAmount >=0 && this.taxableAmount<=500000) {
			
			this.taxableAmount=(this.taxableAmount *0.05);
		}
		
		else if(this.taxableAmount >=500000 && this.taxableAmount<=1000000) {
			
			this.taxableAmount=(this.taxableAmount *0.10);
		}
		
        else if(this.taxableAmount >=1000000 && this.taxableAmount<=1500000) {
			
			this.taxableAmount=(this.taxableAmount *0.15);
		}
		
		System.out.println(this.taxableAmount);
		
	}
	
	@Override
	public double getTaxAmount() {
		
		return this.taxAmount;
	}
	
	@Override
	public String getTaxType() {
		
		return this.taxType;
	}
	
	@Override
	public boolean isTaxPayed() {
		
		return isTaxPayed;
	}
	
	@Override
	public void payTax(String paymode) {
		
		//PaymentProcessor p=pp.get(paymode);
		
		pp.get(paymode).doPayment();
		
		isTaxPayed=true;
	}

}
