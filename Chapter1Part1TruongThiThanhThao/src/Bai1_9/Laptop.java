package Bai1_9;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version : 1.0
 * Class Laptop is subclass of Computer class
 */
public class Laptop extends Computer {
	double weight;
	int timeOfPin;
	double sizeOfScreen;

	public Laptop() {
	}

	public Laptop(String id, int price, String suplier, int quantities,
			double weight, int timeOfPin, double sizeOfScreen) {
		super(id, price, suplier, quantities);
		this.weight = weight;
		this.timeOfPin = timeOfPin;
		this.sizeOfScreen = sizeOfScreen;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getTimeOfPin() {
		return timeOfPin;
	}

	public void setTimeOfPin(int timeOfPin) {
		this.timeOfPin = timeOfPin;
	}

	public double getSizeOfScreen() {
		return sizeOfScreen;
	}

	public void setSizeOfScreen(double sizeOfScreen) {
		this.sizeOfScreen = sizeOfScreen;
	}

	/*
	 * Override displayInformation() of Computer class
	 */
	@Override
	public String displayInformation() {
		return super.displayInformation() + " - " + this.weight + " - "
				+ this.timeOfPin + " - " + this.sizeOfScreen;
	}

}
