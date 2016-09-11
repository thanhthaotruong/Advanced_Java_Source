package Ex2_4;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
public class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: "+name;
	}
}
