package Bai1_5;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * Calculate circumference and area of Rectangle
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Bai1_3.Point;

public class RectangleMain {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Enter information of point
			System.out.print("Enter x of Point A: ");
			int xA = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point A: ");
			int yA = Integer.parseInt(input.readLine());
			System.out.print("Enter x of Point C: ");
			int xC = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point C: ");
			int yC = Integer.parseInt(input.readLine());

			Point C = new Point(xC, yC);
			Rectangle rec = new Rectangle(new Point(xA, yA));
			//calculate circumference and area of rectangle
			System.out.println("The Circumference of Rectangle: " + rec.circumferenceOfRectangle(C));
			System.out.println("The Area of Rectangle: " + rec.areaOfRectangle(C));

		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
