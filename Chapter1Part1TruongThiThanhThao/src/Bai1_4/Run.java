package Bai1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Bai1_3.Point;

public class Run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		CalculationOfCircle cal = new CalculationOfCircle(new Point());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter x of Point O: ");
			int xO = Integer.parseInt(input.readLine());
			System.out.println("Enter y of Point O: ");
			int yO = Integer.parseInt(input.readLine());
			System.out.println("Enter x of Point R: ");
			int xR = Integer.parseInt(input.readLine());
			System.out.println("Enter y of Point R: ");
			int yR = Integer.parseInt(input.readLine());

			Point O = new Point(xO, yO);
			Point R = new Point(xR, yR);

			System.out.println("The circumference is : " + cal.calculateOfCircumference(O, R));
			System.out.println("The area is : " + cal.calculateOfArea(O, R));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
