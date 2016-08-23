package Bai1_16;

/*
 * Author : Truong Thi Thanh Thanh 
 * Date : 23 August 2016
 * Version : 1.0
 */
public class Boat extends Transport implements IUsingFuel, IMoving {
	private double weight;
	private double capacity;
	private double speedStraight;
	private double speedReverse;
	private double wasteFuelStart;
	private String typeOfFuel;

	public Boat(float distance, int time, float fuelUsing, String id,
			String owner, String color, String manufacturer, double weight,
			double capacity, double speedStraight, double speedReverse,
			double wasteFuelStart, String typeOfFuel) {
		super(distance, time, fuelUsing, id, owner, color, manufacturer);
		this.weight = weight;
		this.capacity = capacity;
		this.speedStraight = speedStraight;
		this.speedReverse = speedReverse;
		this.wasteFuelStart = wasteFuelStart;
		this.typeOfFuel = typeOfFuel;
	}

	public double getWasteFuelStart() {
		return wasteFuelStart;
	}

	public void setWasteFuelStart(double wasteFuelStart) {
		this.wasteFuelStart = wasteFuelStart;
	}

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getSpeedStraight() {
		return speedStraight;
	}

	public void setSpeedStraight(double speedStraight) {
		this.speedStraight = speedStraight;
	}

	public double getSpeedReverse() {
		return speedReverse;
	}

	public void setSpeedReverse(double speedReverse) {
		this.speedReverse = speedReverse;
	}

	/*
	 * Override method callMoving() of IMoving Interface calculate fuel used
	 */
	@Override
	public double callMoving() {
		double speed = distance / time + speedStraight - speedReverse;
		return speed;
	}

	/*
	 * Override method calUsingFuel() of IUsingFuel Interface calculate fuel
	 * used
	 */
	@Override
	public double callUsingFuel() {
		double fuel = distance / (fuelUsing - wasteFuelStart);
		return fuel;
	}

	@Override
	public String toString() {
		return super.toString() + " |Weight: " + weight + " |Capacity: "
				+ capacity + " |SpeedStraight: " + speedStraight
				+ " |SpeedReverse: " + speedReverse + " |WasteFuel: "
				+ wasteFuelStart + " |TypeOfFuel: " + typeOfFuel + " |Speed: "
				+ String.format("%.0f", callMoving()) + " |FuelUsing: "
				+ callUsingFuel();
	}

}
