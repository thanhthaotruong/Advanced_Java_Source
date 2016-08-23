package Bai1_14;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Square extends Shape {
	double length;

	public Square(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	/*
	 *Override perimeter() of Shape 
	 *The result is 4*length
	 */
	@Override
	public double perimeter() {
		return 4 * length;
	}
	/*
	 *Override area() of Shape 
	 *The result is length*length
	 */
	@Override
	public double area() {
		return length * length;
	}

}
