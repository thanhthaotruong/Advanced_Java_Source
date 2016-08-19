package Bai1_3;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 */
public class Point {
	int x;
	int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// This method has responseible for calculate the distance between 2 point
	public double countDistance(Point A, Point B) {
		double distance = 0.0;
		distance = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
		return distance;
	}
}
