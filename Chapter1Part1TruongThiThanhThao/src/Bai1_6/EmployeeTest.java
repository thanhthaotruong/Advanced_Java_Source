package Bai1_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testSalary1() {
		Employee e = new Employee("An", 1260000, 2.67, 1, 12000000);
		double ex = 15225990;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary2() {
		Employee e = new Employee("Binh", 1200000, 2.5, 1, 12000000);
		double ex = 14880000;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary3() {
		Employee e = new Employee("Khanh", 1500000, 2.32, 1, 12000000);
		double ex = 15336000;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary4() {
		Employee e = new Employee("Thao", 17600000, 2.67, 3, 15000000);
		double ex = 54694000;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary5() {
		Employee e = new Employee("Anh", 1420000, 2.13, 1, 12000000);
		double ex = 14903370;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary6() {
		Employee e = new Employee("An", 1260000, 2.67, 1, 12000000);
		double ex = 15225991;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary7() {
		Employee e = new Employee("Binh", 1200000, 2.5, 2, 12000000);
		double ex = 14880001;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary8() {
		Employee e = new Employee("Khanh", 1500000, 2.32, 1, 12000000);
		double ex = 15336001;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary9() {
		Employee e = new Employee("Thao", 1760000, 2.67, 3, 15000000);
		double ex = 56627402;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalary10() {
		Employee e = new Employee("Anh", 1420000, 2.13, 1, 12000000);
		double ex = 14903371;
		double ac = e.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
}
