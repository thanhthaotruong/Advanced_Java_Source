package Bai1_16Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_16.Boat;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 24 August 2016
 * Version 1.0
 */
public class BoatTest {
	Boat boat;

	// Test for calculate speed
	@Test
	public void testcalFee1() {
		boat = new Boat(10, 2, 8, "ID01", "John", "Green", "Suziki", 380, 230,
				34, 12, 5, "Diesel");

		double ex = 27;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee2() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				12, 1, 3, "Diesel");

		double ex = 14.333;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee3() {
		boat = new Boat(17, 2, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				23, 12, 4, "Diesel");

		double ex = 19.5;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee4() {
		boat = new Boat(6, 5, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				45, 16, 32, "Diesel");

		double ex = 30.2;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee5() {
		boat = new Boat(0, 0, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				0, 0, 0, "Diesel");

		double ex = 1;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee6() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				15, 3, 2, "Diesel");

		double ex = 14.3;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee7() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				15, 3, 2, "Diesel");

		double ex = 14.33;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee8() {
		boat = new Boat(15, 7, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				25, 12, 2, "Diesel");

		double ex = 14.14;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee9() {
		boat = new Boat(14, 7, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				25, 12, 2, "Diesel");

		double ex = 2;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFee10() {
		boat = new Boat(1, 1, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				1, 0, 1, "Diesel");

		double ex = 1;
		double ac = boat.callMoving();
		assertEquals(ex, ac, 0.001);
	}

	// Test for calculate fuel using
	@Test
	public void testcalFuelUsed1() {
		boat = new Boat(10, 2, 8, "ID01", "John", "Green", "Suziki", 380, 230,
				34, 12, 5, "Diesel");

		double ex = 3.333;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed2() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				12, 1, 3, "Diesel");

		double ex = 5;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed3() {
		boat = new Boat(17, 2, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				23, 12, 4, "Diesel");

		double ex = 17;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed4() {
		boat = new Boat(6, 5, 32, "ID01", "John", "Green", "Suziki", 380, 230,
				45, 16, 2, "Diesel");

		double ex = 0.2;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed5() {
		boat = new Boat(0, 0, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				0, 0, 0, "Diesel");

		double ex = 0;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed6() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				15, 3, 2, "Diesel");

		double ex = 14.3;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed7() {
		boat = new Boat(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				15, 3, 2, "Diesel");

		double ex = 16.33;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed8() {
		boat = new Boat(15, 7, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				25, 12, 2, "Diesel");

		double ex = 14.14;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed9() {
		boat = new Boat(14, 7, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				25, 12, 2, "Diesel");

		double ex = 3;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

	@Test
	public void testcalFuelUsed10() {
		boat = new Boat(1, 1, 5, "ID01", "John", "Green", "Suziki", 380, 230,
				1, 0, 1, "Diesel");

		double ex = 2;
		double ac = boat.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

}
