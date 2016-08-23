package Bai1_17;
/*
 * Author: Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Tiger extends Animal implements IBurrow,IRun{

	public Tiger(String name, String food) {
		super(name, food);
	}

	@Override
	public String run() {
		String s = "Tiger can run!";
		return s;
	}

	@Override
	public String burrowing() {
		String s = "Tiger can burrow!";
		return s;
	}
	@Override
	public String toString() {
		return "Name: "+name+" |Food: "+food+ " | "+run()+" | "+burrowing();
	}
}
