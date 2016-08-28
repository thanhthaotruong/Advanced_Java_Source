package Bai1_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Main for program input information of each type of shape
 * Output the perimeter and area of each shape
 */
public class ShapeMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			//choose the type you want to output the perimeter and area
			System.out
					.println("Choose type of shape??Circle(1) Rectangle(2) Square(3)");
			int type = Integer.parseInt(input.readLine());
			//input information of each shape type
			if (type == 1) {
				System.out.println("Enter radius: ");
				double radius = Double.parseDouble(input.readLine());
				Circle c = new Circle(radius);
				System.out.println("Perimeter: "
						+ String.format("%.2f", c.perimeter()));
				System.out.println("Area: " + String.format("%.2f", c.area()));
			} else if (type == 2) {
				System.out.println("Enter length: ");
				double length = Double.parseDouble(input.readLine());
				System.out.println("Enter height: ");
				double height = Double.parseDouble(input.readLine());
				Rectangle r = new Rectangle(length, height);
				System.out.println("Perimeter: "
						+ String.format("%.2f", r.perimeter()));
				System.out.println("Area: " + String.format("%.2f", r.area()));
			} else if (type == 3) {
				System.out.println("Enter length: ");
				double x = Double.parseDouble(input.readLine());
				Square s = new Square(x);
				System.out.println("Perimeter: "
						+ String.format("%.2f", s.perimeter()));
				System.out.println("Area: " + String.format("%.2f", s.area()));
			}
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error" + ex.getMessage());
		}
	}

}
