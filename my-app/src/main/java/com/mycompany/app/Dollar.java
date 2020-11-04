package com.mycompany.app;

public class Dollar extends Money {
	
	
	public Dollar(float amount, String currency ) {
		super(amount, currency);
	}
	
	public Money times(float multiplier) {
		
		return Money.dollar(amount * multiplier); 
		
	}

}
