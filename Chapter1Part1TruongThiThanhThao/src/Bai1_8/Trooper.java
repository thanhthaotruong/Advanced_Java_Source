package Bai1_8;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version 1.0
 * Trooper class is a subclass of Soldier class
 */
public class Trooper extends Soldier{

	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	//Override fight() method of super class Soldier
	@Override
	public int fight() {
		power = power - 3;
		return power;
	}

}
