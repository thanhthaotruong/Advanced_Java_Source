/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:37 AM
 */
public class Product {

	private String name;
	private double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(){

	}

	public void finalize() throws Throwable {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "\t\t"+price;
	}
}