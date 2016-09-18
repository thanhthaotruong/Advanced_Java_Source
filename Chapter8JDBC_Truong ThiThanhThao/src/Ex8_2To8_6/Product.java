package Ex8_2To8_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
public class Product {
	String name;
	int price;
	int amount;
	int categoryId;
	
	
	public Product() {
	}

	
	public Product(String name) {
		this.name = name;
	}


	public Product(String name, int price, int amount, int categoryId) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryId = categoryId;
	}

	public Product(String name,int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\n\tPrice: "+price+"\n\tAmount: "+amount+"\n-------------------------------------";
	}
}
