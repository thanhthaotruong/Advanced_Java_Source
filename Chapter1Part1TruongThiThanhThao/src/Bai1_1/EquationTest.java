package Bai1_1;

import static org.junit.Assert.*;

import org.junit.Test;

/* 
 * Test for equation
 */
public class EquationTest {
	@Test
	public void testCalculate1() {
		Equation e = new Equation(0, 0);
		double ex = 0.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate2() {
		Equation e = new Equation(0, 2);
		double ex = 1.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate3() {
		Equation e = new Equation(3, 4);
		double ex = -1.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate4() {
		Equation e = new Equation(2, 4);
		double ex = -2.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate5() {
		Equation e = new Equation(1, 0);
		double ex = 0.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate6() {
		Equation e = new Equation(2, 2);
		double ex = 1.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate7() {
		Equation e = new Equation(0, 0);
		double ex = 1.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate8() {
		Equation e = new Equation(0, 2);
		double ex = 0.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate9() {
		Equation e = new Equation(1, 0);
		double ex = 1.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalculate10() {
		Equation e = new Equation(2, -4);
		double ex = -2.0;
		double ac = e.calculate();
		assertEquals(ex, ac, 0.01);
	}

}
