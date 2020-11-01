package com.mycompany.app;

public abstract class Money {
	
	protected float amount;
	
	public abstract Money times(float multiplier);
	
	public static Money dollar(float amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(float amount) {
		return new Franc(amount);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& this.getClass().equals(object.getClass());
	}
}
