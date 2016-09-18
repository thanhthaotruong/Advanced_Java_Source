package Ex7_2;
/*
 * Author :Thanh Thao
 * Date : 15 Sept 2016
 * Version 1.0
 */
public class Unit {
	int id;
	String ten;

	public Unit(int id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public Unit() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		return "ID: "+id+" - "+"Name: "+ten+"\n";
	}
}
