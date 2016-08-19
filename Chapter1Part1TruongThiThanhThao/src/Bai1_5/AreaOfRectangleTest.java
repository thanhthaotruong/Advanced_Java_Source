package Bai1_5;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_3.Point;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 * JUnit Test for calculate area of rectangle
 * Input 2 point
 * Output the circumference of rectangle
 */
public class AreaOfRectangleTest {

	@Test
	public void testArea1() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(3, 3);
		double ex = 4.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea2() {
		Rectangle rec = new Rectangle(new Point(1,1));
		Point C = new Point(2, 3);
		double ex = 2.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea3() {
		Rectangle rec = new Rectangle(new Point(2,1));
		Point C = new Point(3, 3);
		double ex = 2.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea4() {
		Rectangle rec = new Rectangle(new Point(3,3));
		Point C = new Point(3, 3);
		double ex = 0.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea5() {
		Rectangle rec = new Rectangle(new Point(1, 2));
		Point C = new Point(2, 1);
		double ex = 1.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea6() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(3, 3);
		double ex = 3.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea7() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(2, 3);
		double ex = 1.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea8() {
		Rectangle rec = new Rectangle(new Point(2, 1));
		Point C = new Point(3, 3);
		double ex = 1.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea9() {
		Rectangle rec = new Rectangle(new Point(3, 3));
		Point C = new Point(3, 3);
		double ex = 2.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea10() {
		Rectangle rec = new Rectangle(new Point(1, 2));
		Point C = new Point(2, 1);
		double ex = 2.0;
		double ac = rec.areaOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

}
