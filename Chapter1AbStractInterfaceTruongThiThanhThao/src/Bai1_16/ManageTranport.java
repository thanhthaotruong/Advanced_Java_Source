package Bai1_16;

/*
 * Author : Truong Thi Thanh Thanh 
 * Date : 23 August 2016
 * Version : 1.0
 */
public class ManageTranport {
	Car[] car;
	Boat[] boat;

	public ManageTranport(Car[] car, Boat[] boat) {
		this.car = car;
		this.boat = boat;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public Boat[] getBoat() {
		return boat;
	}

	public void setBoat(Boat[] boat) {
		this.boat = boat;
	}

	/*
	 * method for print array car
	 */
	public void outputArrCar() {
		for (Car c : car) {
			if (c != null) {
				System.out.println(c.toString());
			}

		}
	}

	/*
	 * method for print array boat
	 */
	public void outputArrBoat() {
		for (Boat b : boat) {
			if (b != null) {
				System.out.println(b.toString());
			}

		}
	}
}
