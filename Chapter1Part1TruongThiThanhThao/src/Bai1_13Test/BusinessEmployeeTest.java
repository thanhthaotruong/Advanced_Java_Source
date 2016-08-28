package Bai1_13Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_13.BusinessEmployee;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 24 August 2016
 * Version 1.0
 * JUnit Test for test salary of business employee
 */
public class BusinessEmployeeTest {

	@Test
	public void testSalaryOfBusinessEmployee1() {
		BusinessEmployee be = new BusinessEmployee("Thao", 2.67, 1, 12000000, 15000000, 0.05);
		double ex = 4538490;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee2() {
		BusinessEmployee be = new BusinessEmployee("Anh", 2.5, 1, 12000000, 12000000, 0.04);
		double ex = 4078500;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee3() {
		BusinessEmployee be = new BusinessEmployee("Quynh", 2.58, 1, 12000000, 20000000, 0.05);
		double ex = 4668260;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee4() {
		BusinessEmployee be = new BusinessEmployee("Thanh", 2.67, 1, 12000000, 10000000, 0.04);
		double ex = 4205990;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee5() {
		BusinessEmployee be = new BusinessEmployee("Phuoc", 2.8, 1, 12000000, 25000000, 0.05);
		double ex = 5169100;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee6() {
		BusinessEmployee be = new BusinessEmployee("Thao", 2.67, 1, 12000000, 15000000, 0.05);
		double ex = 4438490;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee7() {
		BusinessEmployee be = new BusinessEmployee("Anh", 2.5, 1, 12000000, 12000000, 0.04);
		double ex = 4178500;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee8() {
		BusinessEmployee be = new BusinessEmployee("Quynh", 2.58, 1, 12000000, 20000000, 0.05);
		double ex = 4768260;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee9() {
		BusinessEmployee be = new BusinessEmployee("Thanh", 2.67, 1, 12000000, 10000000, 0.04);
		double ex = 4305990;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testSalaryOfBusinessEmployee10() {
		BusinessEmployee be = new BusinessEmployee("Phuoc", 2.8, 1, 12000000, 25000000, 0.05);
		double ex = 5269100;
		double ac = be.calculateOfSalary();
		assertEquals(ex, ac,0.01);
	}

}
