package Ex8_7;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
public class Report {
	private int id;
	private int productId;
	private String type;
	private int amount;

	public Report(int id, int productId, String type, int amount) {
		this.id = id;
		this.productId = productId;
		this.type = type;
		this.amount = amount;
	}

	public Report() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
