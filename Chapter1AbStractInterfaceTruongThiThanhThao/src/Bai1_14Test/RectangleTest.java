package Bai1_14Test;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_14.Circle;
import Bai1_14.Rectangle;

public class RectangleTest {

	/*
	 * test for perimeter
	 */
	@Test
	public void testPerimeter1() {
		Rectangle r = new Rectangle(2, 3);
		double ex = 10;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter2() {
		Rectangle r = new Rectangle(1, 3);
		double ex = 8;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter3() {
		Rectangle r = new Rectangle(2, 0);
		double ex = 4;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter4() {
		Rectangle r = new Rectangle(2, 1);
		double ex = 6;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter5() {
		Rectangle r = new Rectangle(5, 5);
		double ex = 20;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter6() {
		Rectangle r = new Rectangle(2, 3);
		double ex = 9;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter7() {
		Rectangle r = new Rectangle(1, 3);
		double ex = 7;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter8() {
		Rectangle r = new Rectangle(2, 0);
		double ex = 3;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter9() {
		Rectangle r = new Rectangle(2, 1);
		double ex = 5;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter10() {
		Rectangle r = new Rectangle(5, 5);
		double ex = 18;
		double ac = r.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	/*
	 * test for area
	 */
	@Test
	public void testArea1() {
		Rectangle r = new Rectangle(2, 3);
		double ex = 6;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea2() {
		Rectangle r = new Rectangle(1, 3);
		double ex = 3;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea3() {
		Rectangle r = new Rectangle(2, 0);
		double ex = 0;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea4() {
		Rectangle r = new Rectangle(2, 1);
		double ex = 2;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea5() {
		Rectangle r = new Rectangle(5, 5);
		double ex = 25;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea6() {
		Rectangle r = new Rectangle(2, 3);
		double ex = 5;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea7() {
		Rectangle r = new Rectangle(1, 3);
		double ex = 2;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea8() {
		Rectangle r = new Rectangle(2, 0);
		double ex = 1;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea9() {
		Rectangle r = new Rectangle(2, 1);
		double ex = 3;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea10() {
		Rectangle r = new Rectangle(5, 5);
		double ex = 20;
		double ac = r.area();
		assertEquals(ex, ac, 0.1);
	}

}
