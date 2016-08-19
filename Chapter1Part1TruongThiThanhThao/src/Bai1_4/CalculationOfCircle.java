package Bai1_4;

import Bai1_3.Point;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 */
public class CalculationOfCircle {
	Point p;

	public CalculationOfCircle(Point p) {
		this.p = p;
	}

	public CalculationOfCircle() {
		
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	//calculate of Circumference | input 2 point | output circumference
	public double calculateOfCircumference(Point A){
		if(p.equals(A)){
			System.out.println("Have no circumference!");
		}
		double radius = p.countDistance(A);
		double circumference = (radius*2)*Math.PI;
		return circumference;
	}
	
	//calculate of Area | input 2 point | output area
	public double calculateOfArea(Point A){
		if(p.equals(A)){
			System.out.println("Have no area!");
		}
		double radius = p.countDistance(A);
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
}
