package Bai1_15;
/*
 * Author : Truong Thi Thanh Thao
 * Date: 23 August 2016
 * Version 1.0
 */
public abstract class Instrument {
	protected String name;
	protected String producer;
	
	
	public Instrument(String name, String producer) {
		this.name = name;
		this.producer = producer;
	}


	public abstract String play();
}
