package Bai1_3;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 * Unit Test for calculate the distance 
 * input : 2 point
 * output : distance
 */
public class PointTest {
	Point p = new Point();
	@Test
	public void testDistance1() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,3);
		double ex = 2.236;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testDistance2() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(1,1);
		double ex = 0.0;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testDistance3() {
		Point p1 = new Point(1,3);
		Point p2 = new Point(2,3);
		double ex = 1.0;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance4() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,3);
		double ex = 3.605;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance5() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		double ex = 1.414;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance6() {
		Point p1 = new Point(1,0);
		Point p2 = new Point(5,3);
		double ex = 6.0;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance7() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(1,0);
		double ex = 2.414;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance8() {
		Point p1 = new Point(3,3);
		Point p2 = new Point(2,3);
		double ex = 2.0;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance9() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(4,3);
		double ex = 4.742;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testDistance10() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(2,3);
		double ex = 3.828;
		double ac = p.countDistance(p1,p2);
		assertEquals(ex, ac,0.01);
	}

}
