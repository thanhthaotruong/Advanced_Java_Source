package Bai1_17;
/*
 * Author: Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Bird extends Animal implements IFly,INest{
	
	public Bird(String name, String food) {
		super(name, food);
	}

	@Override
	public String nesting() {
		String s = "Bird can nesting!";
		return s;
	}

	@Override
	public String fly() {
		String s = "Bird can fly!";
		return s;
	}

	@Override
	public String toString() {
		return "Name: "+name+" |Food: "+food+ " | "+nesting()+" | "+fly();
	}
}
