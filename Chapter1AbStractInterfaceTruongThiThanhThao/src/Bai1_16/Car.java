package Bai1_16;

/*
 * Author : Truong Thi Thanh Thanh 
 * Date : 23 August 2016
 * Version : 1.0
 */
public class Car extends Transport implements IMoving, IUsingFuel {
	private String gear;
	private String model;

	public Car(float distance, int time, float fuelUsing, String id,
			String owner, String color, String manufacturer, String gear,
			String model) {
		super(distance, time, fuelUsing, id, owner, color, manufacturer);
		this.gear = gear;
		this.model = model;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	/*
	 * Override method calUsingFuel() of IUsingFuel Interface
	 * calculate fuel used
	 */
	@Override
	public double callUsingFuel() {
		double fuel = distance / fuelUsing;
		return fuel;
	}
	/*
	 * Override method callMoving() of IMoving Interface
	 * calculate fuel used
	 */
	@Override
	public double callMoving() {
		double speed = distance / time;
		return speed;
	}
	/*
	*Override method toString() of Transport Class
	*output information about boat such as : information of transport + gear + model
	*/
	@Override
	public String toString() {
		return super.toString() + "|Gear: " + gear + " |Model: " + model
				+ " |Speed: " + String.format("%.0f", callMoving())
				+ " |FuelUsing: " + String.format("%.0f", callUsingFuel());
	}

}
