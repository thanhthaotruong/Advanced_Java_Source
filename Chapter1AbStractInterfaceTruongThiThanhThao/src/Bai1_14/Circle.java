package Bai1_14;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/*
	 * Override the perimeter() method | Result is 2*PI*r
	 */
	@Override
	public double perimeter() {
		return 2 * Math.PI * r;
	}

	/*
	 * Override the area() method | Result is PI*(r*r)
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

	

}
