package com.mycompany.app;

public class Franc extends Money {

	

	public Franc(float amount) {
		this.amount = amount;
	}
	
	public Franc times(float multiplier) {
		return new Franc(amount * multiplier);	
	}

}