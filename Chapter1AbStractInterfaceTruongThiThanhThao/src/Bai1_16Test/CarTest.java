package Bai1_16Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_16.Car;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 24 August 2016
 * Version 1.0
 */
public class CarTest {
	Car car;
	// Test for calculate speed
	@Test
	public void testCalSpeed1() {
		car = new Car(1, 1, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed2() {
		car = new Car(0, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0;
		double ac = car.callMoving();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed3() {
		car = new Car(6, 2, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed4() {
		car = new Car(8, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.667;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed5() {
		car = new Car(10, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3.333;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed6() {
		car = new Car(0, 1, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed7() {
		car = new Car(0, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed8() {
		car = new Car(1, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed9() {
		car = new Car(7, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.33;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed10() {
		car = new Car(10, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3.3;
		double ac = car.callMoving();
		assertEquals(ex, ac, 0.001);
	}
	// Test for calculate fuel using
	@Test
	public void testCalFuelUsed1() {
		car = new Car(1, 1, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed2() {
		car = new Car(1, 0, 7, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0.143;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed3() {
		car = new Car(6, 2, 3, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed4() {
		car = new Car(23, 3, 9, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.556;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed5() {
		car = new Car(10, 3, 5, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed6() {
		car = new Car(0, 1, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed7() {
		car = new Car(0, 0, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed8() {
		car = new Car(1, 0, 6, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed9() {
		car = new Car(7, 3, 9, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0.77;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed10() {
		car = new Car(10, 3, 7, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1.42;
		double ac = car.callUsingFuel();
		assertEquals(ex, ac, 0.001);
	}

}
