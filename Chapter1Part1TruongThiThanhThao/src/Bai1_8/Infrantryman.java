package Bai1_8;
/*
 * Author :  Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version 1.0
 * Infrantryman class is a subclass of Soldier class
 */
public class Infrantryman extends Soldier{

	public Infrantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	//Override fight() method of super class Soldier
	@Override
	public int fight() {
		power = power -2;
		return power;
	}
	
}
