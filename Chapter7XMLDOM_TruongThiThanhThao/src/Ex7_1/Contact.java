package Ex7_1;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
public class Contact {
	String name;
	String phone;

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Contact() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Name: "+name +" - "+"Phone: "+phone+"\n";
	}
}
