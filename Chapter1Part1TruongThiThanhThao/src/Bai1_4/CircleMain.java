package Bai1_4;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * Calculate circumference and area of circle
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Bai1_3.Point;

public class CircleMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Enter information of point
			System.out.println("Enter x of Point O: ");
			int xO = Integer.parseInt(input.readLine());
			System.out.println("Enter y of Point O: ");
			int yO = Integer.parseInt(input.readLine());
			System.out.println("Enter x of Point R: ");
			int xR = Integer.parseInt(input.readLine());
			System.out.println("Enter y of Point R: ");
			int yR = Integer.parseInt(input.readLine());

			CalculationOfCircle cal = new CalculationOfCircle(new Point(xO, yO));
			Point R = new Point(xR, yR);
			//calculate circumference and area of circle
			System.out.println("The circumference is : " + cal.calculateOfCircumference(R));
			System.out.println("The area is : " + cal.calculateOfArea(R));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
