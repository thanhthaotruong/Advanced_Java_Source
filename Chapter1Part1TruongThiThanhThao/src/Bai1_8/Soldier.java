package Bai1_8;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version 1.0
 * Soldier class is a super class
 */
public class Soldier {
	protected String name;
	protected int power;
	protected String weapon;
	
	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	/*
	 * Method fight() for calculate the power after fight
	 * input no
	 * output power
	 */
	public int fight(){
		power = power -1;
		return power;
	}
}
