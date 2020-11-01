package com.mycompany.app;

public class Dollar extends Money {
	
	public Dollar(float amount) {
		this.amount = amount;
	}
	
	public Money times(float multiplier) {
		
		return new Dollar(amount * multiplier); 
		
	}
}
