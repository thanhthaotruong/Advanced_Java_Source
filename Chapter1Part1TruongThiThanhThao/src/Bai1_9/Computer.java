package Bai1_9;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version : 1.0
 * Class Computer is a super class
 */
public class Computer {
	protected String id;
	protected int price;
	protected String suplier;
	protected int quantities;

	public Computer() {
	}

	public Computer(String id, int price, String suplier, int quantities) {
		this.id = id;
		this.price = price;
		this.suplier = suplier;
		this.quantities = quantities;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSuplier() {
		return suplier;
	}

	public void setSuplier(String suplier) {
		this.suplier = suplier;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	/*
	 * Method show the information of computer
	 */
	public String displayInformation(){
		String info = this.id + " - " + this.price + " - " + this.suplier + " - " + this.quantities;
		return info;
	}
	/*
	 * Method show the total price of computer
	 */
	public double totalPrice(){
		double total = this.quantities * this.price;
		return total;
	}
}
