package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplicationDollar() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testEqualityDollar() {
		assertEquals(Money.dollar(5), new Dollar(5, "USD"));
		assertNotEquals(Money.dollar(5), new Dollar(8, "USD"));
	}
	
	@Test
	public void testMultiplicationFranc() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(8));
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
	
	

}
