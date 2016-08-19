package Bai1_2;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Vesion : 1.0
 * JUnit Test for calculate sum, minus, multy, divide
 * input fisrtNumber, secondNumber
 * output the value of sum, minus, multy, divide
 */
public class CalculatorTest {
	

	@Test
	public void testSum1() {
		Calculator cal = new Calculator(0,0);
		double ex = 0.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum2() {
		Calculator cal = new Calculator(1,0);
		double ex = 1.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum3() {
		Calculator cal = new Calculator(2,5);
		double ex = 7.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum4() {
		Calculator cal = new Calculator(0, -1);
		double ex = -1.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum5() {
		Calculator cal = new Calculator(2, -2);
		double ex = 0.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum6() {
		Calculator cal = new Calculator(2,3);
		double ex = 6.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum7() {
		Calculator cal = new Calculator(0,3);
		double ex = 4.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum8() {
		Calculator cal = new Calculator(0,0);
		double ex = 1.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum9() {
		Calculator cal = new Calculator(2,0);
		double ex = 3.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testSum10() {
		Calculator cal = new Calculator(0, -3);
		double ex = -2.0;
		double ac = cal.sum();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus1() {
		Calculator cal = new Calculator(0,0);
		double ex = 0.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus2() {
		Calculator cal = new Calculator(1, 0);
		double ex = 1.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus3() {
		Calculator cal = new Calculator(2, 5);
		double ex = -3.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus4() {
		Calculator cal = new Calculator(0, -1);
		double ex = 1.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus5() {
		Calculator cal = new Calculator(2, -2);
		double ex = 4.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus6() {
		Calculator cal = new Calculator(2,3);
		double ex = -2.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus7() {
		Calculator cal = new Calculator(0,3);
		double ex = -1.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus8() {
		Calculator cal = new Calculator(0,0);
		double ex = 1.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus9() {
		Calculator cal = new Calculator(2, 0);
		double ex = 2.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMinus10() {
		Calculator cal = new Calculator(0, -3);
		double ex = -3.0;
		double ac = cal.minus();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty1() {
		Calculator cal = new Calculator(0,0);
		double ex = 0.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty2() {
		Calculator cal = new Calculator(1, 0);
		double ex = 0.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty3() {
		Calculator cal = new Calculator(2, 5);
		double ex = 10.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty4() {
		Calculator cal = new Calculator(0, -1);
		double ex = 0.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty5() {
		Calculator cal = new Calculator(2, -2);
		double ex = -4.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty6() {
		Calculator cal = new Calculator(2, 3);
		double ex = -6.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty7() {
		Calculator cal = new Calculator(0, 3);
		double ex = 1.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty8() {
		Calculator cal = new Calculator(0,0);
		double ex = 1.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty9() {
		Calculator cal = new Calculator(2,0);
		double ex = 2.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testMulty10() {
		Calculator cal = new Calculator(0, -3);
		double ex = -3.0;
		double ac = cal.multy();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide1() {
		Calculator cal = new Calculator(0,3);
		double ex = 0.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide2() {
		Calculator cal = new Calculator(1, 3);
		double ex = 0.33333;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide3() {
		Calculator cal = new Calculator(2, 5);
		double ex = 0.4;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide4() {
		Calculator cal = new Calculator(0, -1);
		double ex = 0.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide5() {
		Calculator cal = new Calculator(2, -2);
		double ex = -1.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide6() {
		Calculator cal = new Calculator(2, 3);
		double ex = -0.666;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide7() {
		Calculator cal = new Calculator(0, 3);
		double ex = 1.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide8() {
		Calculator cal = new Calculator(0, 1);
		double ex = 1.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide9() {
		Calculator cal = new Calculator(2,1);
		double ex = 2.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testDivide10() {
		Calculator cal = new Calculator(0, -3);
		double ex = -3.0;
		double ac = cal.divide();
		assertEquals(ex, ac, 0.01);
	}
}
