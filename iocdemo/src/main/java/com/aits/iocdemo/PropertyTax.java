package com.aits.iocdemo;

public class PropertyTax implements Tax{

private double taxableAmount;
	
	private double taxAmount;
	
	private boolean isTaxPayed=false;
	
	private String taxType="Property";
	
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
		
		isTaxPayed=true;
	}
}
