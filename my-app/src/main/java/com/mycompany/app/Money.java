package com.mycompany.app;

public abstract class Money {
	
	protected float amount;
	protected String currency;
	
	public Money(float amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	protected String currency() {
		return currency;
	}
	
	
	public abstract Money times(float multiplier);
	
	public static Money dollar(float amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(float amount) {
		return new Franc(amount, "CHF");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& this.getClass().equals(object.getClass());
	}
}
