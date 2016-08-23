package Bai1_12;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version : 1.0
 * Class ReferenceBook is a subclass of class Book
 */

public class ReferenceBook extends Book{
	private double tax;
	public ReferenceBook(String id, String name, String date, double price, int amount, String publisher, double tax) {
		super(id, name, date, price, amount, publisher);
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return super.toString()+" - "+"Tax: "+tax;
	}
	/*
	 * method for calculate the price of the reference book
	 */
	public double totalPrice(){
		return (amount * price)+(amount*price)*tax;
	}
}
