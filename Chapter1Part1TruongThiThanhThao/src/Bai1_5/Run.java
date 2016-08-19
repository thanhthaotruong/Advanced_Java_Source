package Bai1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Bai1_3.Point;

public class Run {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(new Point());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter x of Point A: ");
			int xA = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point A: ");
			int yA = Integer.parseInt(input.readLine());
			System.out.print("Enter x of Point C: ");
			int xC = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point C: ");
			int yC = Integer.parseInt(input.readLine());

			Point A = new Point(xA, yA);
			Point C = new Point(xC, yC);

			System.out.println("The Circumference of Rectangle: " + rec.circumferenceOfRectangle(A, C));
			System.out.println("The Area of Rectangle: " + rec.areaOfRectangle(A, C));

		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
