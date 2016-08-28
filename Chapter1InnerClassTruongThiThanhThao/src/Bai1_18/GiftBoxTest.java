package Bai1_18;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 24 August 2016
 * Vesion : 1.0
 * Test for callFee of gift
 */
public class GiftBoxTest {

	@Test
	public void testPrice1() {
		GiftBox.Gift gb = new GiftBox("oval", "red").new Gift("thao", 5);
		double ex = 11000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice2() {
		GiftBox.Gift gb = new GiftBox("rectangle", "blue").new Gift("thanh", 20);
		double ex = 14000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice3() {
		GiftBox.Gift gb = new GiftBox("oval", "yellow").new Gift("quynh", 100);
		double ex = 30000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice4() {
		GiftBox.Gift gb = new GiftBox("square", "green").new Gift("anh", 10);
		double ex = 12000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice5() {
		GiftBox.Gift gb = new GiftBox("cicle", "pink").new Gift("thao", 150);
		double ex = 40000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice6() {
		GiftBox.Gift gb = new GiftBox("oval", "red").new Gift("thao", 5);
		double ex = 12000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice7() {
		GiftBox.Gift gb = new GiftBox("rectangle", "blue").new Gift("thanh", 20);
		double ex = 15000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice8() {
		GiftBox.Gift gb = new GiftBox("oval", "yellow").new Gift("quynh", 100);
		double ex = 31000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice9() {
		GiftBox.Gift gb = new GiftBox("square", "green").new Gift("anh", 10);
		double ex = 13000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testPrice10() {
		GiftBox.Gift gb = new GiftBox("cicle", "pink").new Gift("thao", 150);
		double ex = 39000;
		double ac = gb.callFee();
		assertEquals(ex, ac, 0.1);
	}

}
