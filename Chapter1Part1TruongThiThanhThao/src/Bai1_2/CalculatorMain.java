package Bai1_2;

public class CalculatorMain {
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 */
	public static void main(String[] args) {
		Calculator cal = new Calculator(2,3);
		System.out.println("Sum is: "+cal.sum());
		System.out.println("Minus is: "+cal.minus());
		System.out.println("Multy is: "+cal.multy());
		System.out.println("Divide is: "+cal.divide());
	}

}
