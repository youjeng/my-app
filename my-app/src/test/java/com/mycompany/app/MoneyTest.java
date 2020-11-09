package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
		
		Money fivefranc = Money.franc(5);
		assertEquals(Money.franc(10), fivefranc.times(2));
		assertEquals(Money.franc(15), fivefranc.times(3));
	}
	
	@Test
	public void testEquality() {
		assertEquals(Money.dollar(5), new Money(5, "USD"));
		assertNotEquals(Money.dollar(5), new Money(8, "USD"));
		
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(8));
		
		assertNotEquals(Money.franc(5), Money.dollar(5));
	}
	
	@Test
	public void francDoesNotEqualDollar() {
		assertNotEquals(Money.franc(5), Money.dollar(5));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	public void testAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Expression reduced = bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
	@Test
	public void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augmend);
		assertEquals(five, sum.addmend);
	}
	
	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Expression result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}
	
	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Expression result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}	 
	
	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank = new Bank();
		bank.addRate("CHF","USD", 2);
		Money result = bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1), result);	
	}
	
	@Test
	public void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
		assertEquals(1, new Bank().rate("CHF", "CHF"));
	}

}
