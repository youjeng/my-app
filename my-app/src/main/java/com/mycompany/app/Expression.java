package com.mycompany.app;

public interface Expression {

	Money reduce(Bank bank, String to);

	Expression plus(Expression amount);
	
	Expression times(int multiplier); 

}
