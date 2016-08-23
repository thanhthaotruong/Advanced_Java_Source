package Bai1_14;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 23 August 2016
 * Version 1.0
 */
public class Rectangle extends Shape {
	double length;
	double height;
	
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/*
	 * Override the perimeter() of Shape | The result is 2*(length + height)
	 */
	@Override
	public double perimeter() {
		return (length + height) * 2;
	}

	/*
	 * Override the area() of Shape | The result is lenght * height
	 */
	@Override
	public double area() {
		return length * height;
	}

}
