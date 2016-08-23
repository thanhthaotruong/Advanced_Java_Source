package Bai1_17;
/*
 * Author: Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Fish extends Animal implements IUnderWater,ISwim{

	public Fish(String name, String food) {
		super(name, food);
	}

	@Override
	public String swim() {
		String s = "Fish can swim!";
		return s;
	}

	@Override
	public String livingInWater() {
		String s = "Fish live in water!";
		return s;
	}
	@Override
	public String toString() {
		return "Name: "+name+" |Food: "+food+ " | "+swim()+" | "+livingInWater();
	}
}
