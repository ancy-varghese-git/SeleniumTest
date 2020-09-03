package com.ann.casestudyone;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BasicMathOperationsTests {

	BasicMathOperations basicMathOperationsUnderTest = new BasicMathOperations();

	@Test
	public void testAdd() {
		Assertions.assertEquals(55, basicMathOperationsUnderTest.add(10, 45));
	}

	@Test
	public void testSubtract() {
		Assertions.assertEquals(70, basicMathOperationsUnderTest.subtract(87, 17));
	}

	@Test
	public void testMultiply() {
		Assertions.assertEquals(55, basicMathOperationsUnderTest.multiply(5, 11));
	}

	@Test
	public void testDivide() {
		Assertions.assertEquals(16, basicMathOperationsUnderTest.divide(64, 4));
	}

	@Test
	public void testMod() {
		Assertions.assertEquals(1, basicMathOperationsUnderTest.mod(65, 8));
	}

	@Test
	public void testDoubleNumber() {
		Assertions.assertEquals(10, basicMathOperationsUnderTest.doubleNumber(5));
	}
	
	@Test
	public void testPowerOff() {
		Assertions.assertEquals(8, basicMathOperationsUnderTest.powerOf(2, 3));
	}

	@Test
	public void testSquareRoot() {
		Assertions.assertEquals(8, basicMathOperationsUnderTest.squareRoot(64));
	}

	@Test
	public void testIsEvenNumber() {
		Assertions.assertTrue(basicMathOperationsUnderTest.isEvenNumber(24));
	}

	@Test
	public void testIsNotEvenNumber() {
		Assertions.assertFalse(basicMathOperationsUnderTest.isEvenNumber(25));
	}

	@Test
	public void testIsOddNumber() {
		Assertions.assertTrue(basicMathOperationsUnderTest.isOddNumber(27));
	}

	@Test
	public void testIsNotOddNumber() {
		Assertions.assertFalse(basicMathOperationsUnderTest.isOddNumber(28));
	}
	
	
}
