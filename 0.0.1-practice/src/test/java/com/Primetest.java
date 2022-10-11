package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Primetest {
	
	
	@Test
	
	public void evaluateExpression() {
		Prime p=new Prime();
		boolean	sol = p.checkPrime(8);
		assertEquals(false,sol);
		boolean	sol1 = p.checkPrime(6);
		assertEquals(false,sol);
		boolean	sol2 = p.checkPrime(4);
		assertEquals(false,sol);
	}
	

}
