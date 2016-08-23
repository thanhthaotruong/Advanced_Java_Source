package Bai1_15;
/*
 * Author : Truong Thi Thanh Thao
 * Date: 23 August 2016
 * Version 1.0
 */
public class StringedInstrument extends Instrument{
	
	private int numberOfString;
	
	public StringedInstrument(String name, String producer) {
		super(name, producer);
	}
	
	public StringedInstrument(String name, String producer, int numberOfString) {
		super(name, producer);
		this.numberOfString = numberOfString;
	}

	public int getNumberOfString() {
		return numberOfString;
	}

	public void setNumberOfString(int numberOfString) {
		this.numberOfString = numberOfString;
	}
	/*
	 * Override method play() of Abstract Instrument
	 * The result is print information about instrument which has stringed
	 */
	@Override
	public String play() {
		return "Name of Instrument: "+name + "*****Number of Stringed: "+numberOfString;
	}

	
	
	
}
