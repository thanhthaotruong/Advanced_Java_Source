package Bai1_17;
/*
 * Author: Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class ManageAnimal {
	Bird[] bird;
	Boa[] boa;
	Fish[] fish;
	Tiger[] tiger;
	
	public ManageAnimal(Bird[] bird, Boa[] boa, Fish[] fish, Tiger[] tiger) {
		this.bird = bird;
		this.boa = boa;
		this.fish = fish;
		this.tiger = tiger;
	}

	public Bird[] getBird() {
		return bird;
	}

	public void setBird(Bird[] bird) {
		this.bird = bird;
	}

	public Boa[] getBoa() {
		return boa;
	}

	public void setBoa(Boa[] boa) {
		this.boa = boa;
	}

	public Fish[] getFish() {
		return fish;
	}

	public void setFish(Fish[] fish) {
		this.fish = fish;
	}

	public Tiger[] getTiger() {
		return tiger;
	}

	public void setTiger(Tiger[] tiger) {
		this.tiger = tiger;
	}
	/*
	 * method print information list of Bird
	 */
	public void outputArrBird() {
		for (Bird b : bird) {
			if (b != null) {
				System.out.println(b.toString());
			}

		}
	}
	/*
	 * method print information list of Boa
	 */
	public void outputArrBoa() {
		for (Boa b : boa) {
			if (b != null) {
				System.out.println(b.toString());
			}

		}
	}
	/*
	 * method print information list of Fish
	 */
	public void outputArrFish() {
		for (Fish b : fish) {
			if (b != null) {
				System.out.println(b.toString());
			}

		}
	}
	/*
	 * method print information list of Tiger
	 */
	public void outputArrTiger() {
		for (Tiger b : tiger) {
			if (b != null) {
				System.out.println(b.toString());
			}

		}
	}
	
}
