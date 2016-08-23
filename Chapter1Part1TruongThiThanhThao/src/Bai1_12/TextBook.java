package Bai1_12;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 * Class TextBook is a subclass of Class Book
 */
public class TextBook extends Book {
	private int status;

	public TextBook(String id, String name, String date, double price,
			int amount, String publisher, int status) {
		super(id, name, date, price, amount, publisher);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + "Status: " + status;
	}

	// method for calculate the price of TextBook type New
	public double totalPriceNew() {
		return amount * price;
	}

	// method for calculate the price of TextBook type Old
	public double totalPriceOld() {
		return amount * price * 0.5;
	}
}
