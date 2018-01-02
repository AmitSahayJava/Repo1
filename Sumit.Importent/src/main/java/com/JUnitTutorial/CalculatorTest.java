package com.JUnitTutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    Calculator c=new Calculator();
	@Test
	public void testAdd() {
		assertEquals(30, c.add(10, 20));
	}

	@Test
	public void testSub() {
		assertEquals(10, c.sub(30, 20));
	}

}
