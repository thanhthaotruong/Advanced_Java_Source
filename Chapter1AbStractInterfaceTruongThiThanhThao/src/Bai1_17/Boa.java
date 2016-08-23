package Bai1_17;
/*
 * Author: Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Boa extends Animal implements IMolting,IBurrow{

	public Boa(String name, String food) {
		super(name, food);
	}

	@Override
	public String molting() {
		String s = "Boa can molting!";
		return s;
	}

	@Override
	public String burrowing() {
		String s = "Boa can burrow!";
		return s;
	}
	@Override
	public String toString() {
		return "Name: "+name+" |Food: "+food+ " | "+molting()+" | "+burrowing();
	}
}
