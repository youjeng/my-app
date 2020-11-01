package com.mycompany.app;

public class Money {
	
	protected float amount;
	
	public Money() {
		
	}
	
	public Money(float amount) {
		this.amount = amount;
	}

	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(object.getClass());
	}
}
