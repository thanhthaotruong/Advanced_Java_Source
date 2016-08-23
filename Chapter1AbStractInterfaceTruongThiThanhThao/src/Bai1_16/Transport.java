package Bai1_16;

/*
 * Author : Truong Thi Thanh Thanh 
 * Date : 23 August 2016
 * Version : 1.0
 */
public abstract class Transport extends Moving {
	protected String id;
	protected String owner;
	protected String color;
	protected String manufacturer;

	public Transport(float distance, int time, float fuelUsing, String id,
			String owner, String color, String manufacturer) {
		super(distance, time, fuelUsing);
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public Transport() {
	}

	@Override
	public String toString() {
		return "ID: " + id + " |Owner: " + owner + " |Color: " + color
				+ " |Manufacturer: " + manufacturer;
	}

}
