package org.testapp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


public class CalculatorTest {
	
	@DisplayName("Test Positive Numbers Addition")
	@Test
	public void testPositiveNumber() {
		Calculator c = new Calculator();
		int res = c.add(3, 2);
		Assertions.assertEquals(5,res,"Addition is 5");
	}
	
	@DisplayName("Test Negative Numbers Addition")
	@Test
	public void testNegativeNumber() {
		Calculator  c = new Calculator();
		int res = c.add(-1, -2);
		Assertions.assertEquals(-3,res,"Addition is right");
	}
	
	@Disabled
	@Test
	public void tesDivPositiveNumber() {
		Calculator c = new Calculator();
		int res = c.div(10, 0);
		Assertions.assertThrows(ArithmeticException.class,()->{
			System.out.println("Division is"+res);
		});
	}
}
