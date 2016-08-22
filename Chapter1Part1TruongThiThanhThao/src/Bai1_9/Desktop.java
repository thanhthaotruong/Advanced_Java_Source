package Bai1_9;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 21 August 2016
 * Version : 1.0
 * Class Desktop is subclass of Computer class
 */
public class Desktop extends Computer {
	String CPU;
	String Ram;

	public Desktop() {
	}

	public Desktop(String cPU, String ram) {
		CPU = cPU;
		Ram = ram;
	}

	public Desktop(String id, int price, String suplier, int quantities,
			String cPU, String ram) {
		super(id, price, suplier, quantities);
		this.CPU = cPU;
		this.Ram = ram;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	/*
	 * Override displayInformation() of Computer class
	 */
	@Override
	public String displayInformation() {
		return super.displayInformation() + this.CPU + " - " + this.Ram;
	}

}
