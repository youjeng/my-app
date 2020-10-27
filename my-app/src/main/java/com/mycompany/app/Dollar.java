package com.mycompany.app;

public class Dollar {

	public float amount;

	public Dollar(float amount) {
		this.amount = amount;
	}

	public void times(float multiplier) {
		amount *= multiplier;
		
	}

}
