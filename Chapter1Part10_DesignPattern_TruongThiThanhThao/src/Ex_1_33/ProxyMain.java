package Ex_1_33;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class ProxyMain {
	public static void main(String[] args) {
		Image image = new ProxyImage("abc.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
