package Bai1_4;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_3.Point;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 * JUnit Test for calculate the circumference 
 * Input 2 Point 
 * Output the circumferrence of circle
 */
public class CircumferenceTest {
	

	@Test
	public void testCircumference1() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(2, 4);
		double ex = 19.86;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference2() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(2, 3);
		double ex = 14.04;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference3() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(1, 1);
		double ex = 0.0;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference4() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 3));
		Point B = new Point(2, 3);
		double ex = 6.28;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference5() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(0, 0));
		Point B = new Point(2, 3);
		double ex = 22.65;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference6() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(2, 4);
		double ex = 18.86;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference7() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(2, 3);
		double ex = 15.04;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference8() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 1));
		Point B = new Point(1, 1);
		double ex = 1.0;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference9() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1, 3));
		Point B = new Point(2, 3);
		double ex = 5.29;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference10() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(0, 0));
		Point B = new Point(2, 3);
		double ex = 21.63;
		double ac = cal.calculateOfCircumference(B);
		assertEquals(ex, ac, 0.01);
	}

}
