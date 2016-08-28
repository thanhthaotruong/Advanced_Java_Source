package Bai1_15;
/*
 * Author : Truong Thi Thanh Thao
 * Date: 23 August 2016
 * Version 1.0
 */
public class NonStringedInstrument extends Instrument{
	
	public NonStringedInstrument(String name, String producer) {
		super(name, producer);
	}

	private String using;
	
	public NonStringedInstrument(String name, String producer,String using) {
		super(name, producer);
		this.using = using;
	}

	public String getUsing() {
		return using;
	}

	public void setUsing(String using) {
		this.using = using;
	}
	/*
	 * Override method play() of Abstract Instrument
	 * The result is print information about instrument which has no stringed
	 */
	@Override
	public String play() {
		return "How to use: "+ using;
	}
	
	
}
