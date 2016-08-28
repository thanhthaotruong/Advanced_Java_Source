package Bai1_10_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Bai1_10.Student;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * Test for average of student 
 */
public class StudentTest {

	@Test
	public void testAverage1() {
		Student st = new Student("Thao", "09/01/93", "TPHCM", "091735428", "A12", 8, 9);
		double ex = 8.5;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage2() {
		Student st = new Student("Anh", "09/10/93", "Binh Thuan", "091735428", "A10", 6, 9);
		double ex = 7.5;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage3() {
		Student st = new Student("Thanh", "10/01/93", "Tien Giang", "091735428", "A8", 6.5, 8.5);
		double ex = 7.5;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage4() {
		Student st = new Student("Quynh", "5/5/1994", "Ben Tre", "091735428", "A15", 9, 9);
		double ex = 9.0;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage5() {
		Student st = new Student("Phuoc", "21/09/93", "TPHCM", "091735428", "A1", 10, 9);
		double ex = 9.5;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage6() {
		Student st = new Student("Thao", "09/01/93", "TPHCM", "091735428", "A12", 8, 9);
		double ex = 7.0;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage7() {
		Student st = new Student("Anh", "09/10/93", "Binh Thuan", "091735428", "A10", 6, 9);
		double ex = 8.0;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage8() {
		Student st = new Student("Thanh", "10/01/93", "Tien Giang", "091735428", "A8", 6.5, 8.5);
		double ex = 7.0;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage9() {
		Student st = new Student("Quynh", "5/5/1994", "Ben Tre", "091735428", "A15", 9, 9);
		double ex = 8.5;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}

	public void testAverage10() {
		Student st = new Student("Phuoc", "21/09/93", "TPHCM", "091735428", "A1", 10, 9);
		double ex = 9.0;
		double ac = st.calculateMediumScore();
		assertEquals(ex, ac, 0.1);
	}
}
