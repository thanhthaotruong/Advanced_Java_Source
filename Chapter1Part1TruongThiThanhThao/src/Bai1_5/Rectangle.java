package Bai1_5;

import Bai1_3.Point;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 */
public class Rectangle {
	Point p;

	public Rectangle(Point p) {
		this.p = p;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	// This method has responsible for calculate the circumference of Rectangle
	// input 2 Point
	// output circumference
	public double circumferenceOfRectangle(Point A, Point C) {
		Point B = new Point(A.getX(), C.getY());
		Point D = new Point(C.getX(), A.getY());

		double width = p.countDistance(A, B);
		double length = p.countDistance(A, D);

		double circumference = 2 * (width + length);
		return circumference;
	}

	// This method has responsible for calculate the area of Rectangle
	// input 2 Point
	// output area
	public double areaOfRectangle(Point A, Point C) {
		Point B = new Point(A.getX(), C.getY());
		Point D = new Point(C.getX(), A.getY());

		double width = p.countDistance(A, B);
		double length = p.countDistance(A, D);

		double area = width * length;
		return area;
	}
}
