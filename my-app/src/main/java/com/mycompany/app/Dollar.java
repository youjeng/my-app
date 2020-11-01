package com.mycompany.app;

public class Dollar extends Money {

	public Dollar(float amount) {
		this.amount = amount;
	}
	
	Dollar times(float multiplier) {
		
		return new Dollar(amount * multiplier); 
		
	}
}
