package Bai1_9Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_9.Computer;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version :1.0
 * Test for price of Computer
 */
public class ComputerTest {

	@Test
	public void testPrice1() {
		Computer c = new Computer("1", 12000000, "HP", 2);
		double ex = 24000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice2() {
		Computer c = new Computer("2", 15000000, "HP", 5);
		double ex = 75000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice3() {
		Computer c = new Computer("3", 2000000, "DELL", 3);
		double ex = 6000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice4() {
		Computer c = new Computer("4", 20000000, "DELL", 10);
		double ex = 200000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice5() {
		Computer c = new Computer("5", 11000000, "HP", 1);
		double ex = 11000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice6() {
		Computer c = new Computer("1", 12000000, "HP", 2);
		double ex = 23000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice7() {
		Computer c = new Computer("2", 15000000, "HP", 5);
		double ex = 76000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice8() {
		Computer c = new Computer("3", 2000000, "DELL", 3);
		double ex = 6100000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice9() {
		Computer c = new Computer("4", 20000000, "DELL", 10);
		double ex = 210000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPrice10() {
		Computer c = new Computer("5", 11000000, "HP", 1);
		double ex = 12000000;
		double ac = c.totalPrice();
		assertEquals(ex, ac,0.01);
	}
}
