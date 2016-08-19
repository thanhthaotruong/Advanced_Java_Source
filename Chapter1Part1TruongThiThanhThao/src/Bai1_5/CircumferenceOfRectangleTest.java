package Bai1_5;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_3.Point;


/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 * JUnit Test for calculate circumference of rectangle
 * Input 2 point
 * Output the circumference of rectangle
 */
public class CircumferenceOfRectangleTest {

	@Test
	public void testCircumference1() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(3, 3);
		double ex = 8.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference2() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(2, 3);
		double ex = 6.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference3() {
		Rectangle rec = new Rectangle(new Point(2, 1));
		Point C = new Point(3, 3);
		double ex = 6.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference4() {
		Rectangle rec = new Rectangle(new Point(3, 3));
		Point C = new Point(3, 3);
		double ex = 0.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference5() {
		Rectangle rec = new Rectangle(new Point(1, 2));
		Point C = new Point(2, 1);
		double ex = 4.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference6() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(3, 3);
		double ex = 7.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference7() {
		Rectangle rec = new Rectangle(new Point(1, 1));
		Point C = new Point(2, 3);
		double ex = 8.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference8() {
		Rectangle rec = new Rectangle(new Point(2, 1));
		Point C = new Point(3, 3);
		double ex = 8.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference9() {
		Rectangle rec = new Rectangle(new Point(3, 3));
		Point C = new Point(3, 3);
		double ex = 1.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCircumference10() {
		Rectangle rec = new Rectangle(new Point(1, 2));
		Point C = new Point(2, 1);
		double ex = 5.0;
		double ac = rec.circumferenceOfRectangle(C);
		assertEquals(ex, ac, 0.01);
	}

}
