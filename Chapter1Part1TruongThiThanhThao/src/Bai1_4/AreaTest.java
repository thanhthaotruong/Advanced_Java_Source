package Bai1_4;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_3.Point;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 * JUnit Test for calculate the area 
 * Input 2 point
 * ouput the area of circle
 */
public class AreaTest {

	

	@Test
	public void testArea1() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(2, 4);
		double ex = 31.41;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea2() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(2, 3);
		double ex = 15.71;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea3() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(1, 1);
		double ex = 0.0;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea4() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,3));
		Point B = new Point(2, 3);
		double ex = 3.14;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea5() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(0,0));
		Point B = new Point(2, 3);
		double ex = 40.85;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea6() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(2, 4);
		double ex = 32.41;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea7() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(2, 3);
		double ex = 16.7;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea8() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,1));
		Point B = new Point(1, 1);
		double ex = 1.0;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea9() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(1,3));
		Point B = new Point(2, 3);
		double ex = 4.29;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea10() {
		CalculationOfCircle cal = new CalculationOfCircle(new Point(0,0));
		Point B = new Point(2, 3);
		double ex = 41.85;
		double ac = cal.calculateOfArea(B);
		assertEquals(ex, ac, 0.01);
	}

}
