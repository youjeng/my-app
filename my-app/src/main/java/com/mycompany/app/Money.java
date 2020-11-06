package com.mycompany.app;

public class Money {
	
	protected float amount;
	protected String currency;
	
	public Money(float amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	protected String currency() {
		return currency;
	}
	
	
	public static Money dollar(float amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(float amount) {
		return new Money(amount, "CHF");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& this.currency == money.currency;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}

	public Money times(float multiplier) {
		
		return new Money(amount * multiplier, this.currency); 
		
	}
	
	
}
