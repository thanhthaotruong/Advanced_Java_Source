package Ex8_7;

import java.sql.Date;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 17 Sept 2016
 * Version 1.0
 */
public class Product {
	private int id;
	private String name;
	private double price;
	private int amount;
	private String image;
	private int categoryId;
	private Date createDate;
	private int onSell;
	
	
	public Product(int id) {
		this.id = id;
	}

	public Product(int id, double price, int amount) {
		this.id = id;
		this.price = price;
		this.amount = amount;
	}

	public Product(String name, double price, int amount, String image, int categoryId) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryId = categoryId;
	}

	public Product(int id, String name, double price, int amount, String image, int categoryId, Date createDate,
			int onSell) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryId = categoryId;
		this.createDate = createDate;
		this.onSell = onSell;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getOnSell() {
		return onSell;
	}

	public void setOnSell(int onSell) {
		this.onSell = onSell;
	}
	@Override
	public String toString() {
		return "ID: "+id+" -Name: "+name+" -Price: "+price+" -Amount: "+amount+" -Create Date: "+createDate;
	}
}
