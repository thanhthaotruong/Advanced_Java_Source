package Bai1_12;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
public class Book {
	protected String id;
	protected String name;
	protected String date;
	protected double price;
	protected int amount;
	protected String publisher;

	public Book(String id, String name, String date, double price, int amount, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.publisher = publisher;
	}

	public Book() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "ID: " + id + " |Name: " + name + " |Date: " + date + " |Price: " + price + " |Amount: " + amount
				+ " |Publisher: " + publisher;
	}
}
