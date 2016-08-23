package Bai1_14Test;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_14.Circle;

public class CircleTest {
/*
 * test for perimeter
 */
	@Test
	public void testPerimeter1() {
		Circle c = new Circle(5);
		double ex = 31.4;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter2() {
		Circle c = new Circle(0);
		double ex = 0;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter3() {
		Circle c = new Circle(3.2);
		double ex = 20.1;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter4() {
		Circle c = new Circle(2);
		double ex = 12.56;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter5() {
		Circle c = new Circle(10);
		double ex = 62.8;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter6() {
		Circle c = new Circle(3.5);
		double ex = 22.98;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter7() {
		Circle c = new Circle(4);
		double ex = 26.12;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter8() {
		Circle c = new Circle(2);
		double ex = 13.56;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter9() {
		Circle c = new Circle(5);
		double ex = 32.4;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testPerimeter10() {
		Circle c = new Circle(1);
		double ex = 7.28;
		double ac = c.perimeter();
		assertEquals(ex, ac,0.1);
	}
	/*
	 * test for area
	 */
	@Test
	public void testArea1() {
		Circle c = new Circle(5);
		double ex = 78.5;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea2() {
		Circle c = new Circle(0);
		double ex = 0;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea3() {
		Circle c = new Circle(3.2);
		double ex = 32.15;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea4() {
		Circle c = new Circle(2);
		double ex = 12.56;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea5() {
		Circle c = new Circle(10);
		double ex = 314;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea6() {
		Circle c = new Circle(3.5);
		double ex = 39.5;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea7() {
		Circle c = new Circle(4);
		double ex = 51.24;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea8() {
		Circle c = new Circle(2);
		double ex = 13.56;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea9() {
		Circle c = new Circle(5);
		double ex = 77.4;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
	@Test
	public void testArea10() {
		Circle c = new Circle(1);
		double ex = 9.86;
		double ac = c.area();
		assertEquals(ex, ac,0.1);
	}
}
