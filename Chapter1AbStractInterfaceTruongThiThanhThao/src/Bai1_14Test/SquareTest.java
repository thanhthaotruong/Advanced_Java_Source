package Bai1_14Test;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_14.Rectangle;
import Bai1_14.Square;

public class SquareTest {

	/*
	 * test for perimeter
	 */
	@Test
	public void testPerimeter1() {
		Square s = new Square(2);
		double ex = 8;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter2() {
		Square s = new Square(3);
		double ex = 12;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter3() {
		Square s = new Square(0);
		double ex = 0;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter4() {
		Square s = new Square(9);
		double ex = 36;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter5() {
		Square s = new Square(10);
		double ex = 40;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter6() {
		Square s = new Square(2);
		double ex = 7;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter7() {
		Square s = new Square(3);
		double ex = 11;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter8() {
		Square s = new Square(0);
		double ex = 1;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter9() {
		Square s = new Square(9);
		double ex = 35;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPerimeter10() {
		Square s = new Square(10);
		double ex = 35;
		double ac = s.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	/*
	 * test for area
	 */
	@Test
	public void testArea1() {
		Square s = new Square(2);
		double ex = 4;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea2() {
		Square s = new Square(3);
		double ex = 9;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea3() {
		Square s = new Square(0);
		double ex = 0;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea4() {
		Square s = new Square(9);
		double ex = 81;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea5() {
		Square s = new Square(10);
		double ex = 100;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea6() {
		Square s = new Square(2);
		double ex = 5;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea7() {
		Square s = new Square(3);
		double ex = 7;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea8() {
		Square s = new Square(0);
		double ex = 1;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea9() {
		Square s = new Square(9);
		double ex = 80;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea10() {
		Square s = new Square(10);
		double ex = 98;
		double ac = s.area();
		assertEquals(ex, ac, 0.1);
	}

}
