package Bai1_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Bai1_3.Point;

public class Run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
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

			CalculationOfCircle cal = new CalculationOfCircle(new Point(xO, yO));
			Point R = new Point(xR, yR);

			System.out.println("The circumference is : " + cal.calculateOfCircumference(R));
			System.out.println("The area is : " + cal.calculateOfArea(R));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
