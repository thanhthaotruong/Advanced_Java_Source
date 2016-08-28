package Bai1_12Test;

import static org.junit.Assert.*;


import org.junit.Test;
import Bai1_12.ReferenceBook;
import Bai1_12.TextBook;

//JUnit Test for test total price of new book

public class BookTest {
	// Test for total price of new text book

	@Test
	public void testTotalPriceNewBook1() {
		TextBook textBook = new TextBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 1);
		double ex = 60000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook2() {
		TextBook textBook = new TextBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 1);
		double ex = 100000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook3() {
		TextBook textBook = new TextBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 1);
		double ex = 44000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook4() {
		TextBook textBook = new TextBook("4", "Kinh Doanh", "23/2/2015", 23500,
				4, "KimDong", 1);
		double ex = 94000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook5() {
		TextBook textBook = new TextBook("5", "Ke Toan", "9/1/2016", 1500, 10,
				"NXB TPHCM", 1);
		double ex = 15000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook6() {
		TextBook textBook = new TextBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 1);
		double ex = 62000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook7() {
		TextBook textBook = new TextBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 1);
		double ex = 95000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook8() {
		TextBook textBook = new TextBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 1);
		double ex = 45000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook9() {
		TextBook textBook = new TextBook("4", "Kinh Doanh", "23/2/2015", 23500,
				4, "KimDong", 1);
		double ex = 93000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceNewBook10() {
		TextBook textBook = new TextBook("5", "Ke Toan", "9/1/2016", 1500, 10,
				"NXB TPHCM", 1);
		double ex = 16000;
		double ac = textBook.totalPriceNew();
		assertEquals(ex, ac, 0.01);
	}

	/*
	 * Test for total price of old text book
	 */
	@Test
	public void testTotalPriceOldBook1() {
		TextBook textBook = new TextBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 1);
		double ex = 30000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook2() {
		TextBook textBook = new TextBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 1);
		double ex = 50000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook3() {
		TextBook textBook = new TextBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 1);
		double ex = 22000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook4() {
		TextBook textBook = new TextBook("4", "Kinh Doanh", "23/2/2015", 23500,
				4, "KimDong", 1);
		double ex = 47000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook5() {
		TextBook textBook = new TextBook("5", "Ke Toan", "9/1/2016", 1500, 10,
				"NXB TPHCM", 1);
		double ex = 7500;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook6() {
		TextBook textBook = new TextBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 1);
		double ex = 31000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook7() {
		TextBook textBook = new TextBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 1);
		double ex = 47500;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook8() {
		TextBook textBook = new TextBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 1);
		double ex = 22500;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook9() {
		TextBook textBook = new TextBook("4", "Kinh Doanh", "23/2/2015", 23500,
				4, "KimDong", 1);
		double ex = 46500;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceOldBook10() {
		TextBook textBook = new TextBook("5", "Ke Toan", "9/1/2016", 1500, 10,
				"NXB TPHCM", 1);
		double ex = 8000;
		double ac = textBook.totalPriceOld();
		assertEquals(ex, ac, 0.01);
	}

	// Test for total price of reference book

	@Test
	public void testTotalPriceReferenceBook1() {
		ReferenceBook r = new ReferenceBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 0.05);
		double ex = 63000;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook2() {
		ReferenceBook r = new ReferenceBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 0.02);
		double ex = 102000;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook3() {
		ReferenceBook r = new ReferenceBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 0.01);
		double ex = 44440;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook4() {
		ReferenceBook r = new ReferenceBook("4", "Kinh Doanh", "23/2/2015",
				23500, 4, "KimDong", 0.04);
		double ex = 97760;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook5() {
		ReferenceBook r = new ReferenceBook("5", "Ke Toan", "9/1/2016", 1500,
				10, "NXB TPHCM", 0.03);
		double ex = 15450;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook6() {
		ReferenceBook r = new ReferenceBook("1", "ABC", "20/10/2010", 15000, 4,
				"KimDong", 0.05);
		double ex = 62000;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook7() {
		ReferenceBook r = new ReferenceBook("2", "XYZ", "23/1/2010", 50000, 2,
				"Giao Duc", 0.02);
		double ex = 103000;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook8() {
		ReferenceBook r = new ReferenceBook("3", "Anh Van Cho Be", "24/2/2012",
				11000, 4, "KimDong", 0.01);
		double ex = 44540;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook9() {
		ReferenceBook r = new ReferenceBook("4", "Kinh Doanh", "23/2/2015",
				23500, 4, "KimDong", 0.04);
		double ex = 97860;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testTotalPriceReferenceBook10() {
		ReferenceBook r = new ReferenceBook("5", "Ke Toan", "9/1/2016", 1500,
				10, "NXB TPHCM", 0.03);
		double ex = 15550;
		double ac = r.totalPrice();
		assertEquals(ex, ac, 0.01);
	}
}
