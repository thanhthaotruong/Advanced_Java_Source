package Bai1_18;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 24 August 2016
 * Version 1.0
 */
public class GiftBox {
	public String shape;
	public String color;
	final int price = 10000;

	public GiftBox(String shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	// Gift is inner class of GiftBox
	class Gift {
		public String name;
		public double weight;
		final int FEE = 200;

		public Gift(String name, double weight) {
			this.name = name;
			this.weight = weight;
		}

		/*
		 * method callFee() for calculate the fee of gift output : fee of gift
		 * calculate by weight * fee + priceOfGiftBox
		 */

		public double callFee() {
			return weight * FEE + GiftBox.this.price;

		}
	}
}
