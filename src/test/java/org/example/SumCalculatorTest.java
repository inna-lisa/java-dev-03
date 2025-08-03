package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
	private SumCalculator sumCalculator;

	@BeforeEach
	void setUp() {
		sumCalculator = new SumCalculator();
	}

	@Test
	void testSumOfOneWorksCorrect(){
		int actual = sumCalculator.sum(1);
		int expected = 1;

		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testSumOfNumbersWorksCorrect(){
		int actual = sumCalculator.sum(3);
		int expected = 6;

		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testAssertThrowForNull(){
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> sumCalculator.sum(0));
	}

	@AfterEach
	void tearDown() {
		sumCalculator = null;
	}
}