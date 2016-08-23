package Bai1_11;
/*
 * Author :  Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
public class Transaction {
	String id;
    String date;
    int amount;
    String typeTrade;
	public Transaction(String id, String date, int amount, String typeTrade) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.typeTrade = typeTrade;
	}
	public Transaction() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTypeTrade() {
		return typeTrade;
	}
	public void setTypeTrade(String typeTrade) {
		this.typeTrade = typeTrade;
	}
    
}
