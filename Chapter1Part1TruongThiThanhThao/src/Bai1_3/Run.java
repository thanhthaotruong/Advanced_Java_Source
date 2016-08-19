package Bai1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("Enter x of Point A: ");
			int xA = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point A: ");
			int yA = Integer.parseInt(input.readLine());
			System.out.print("Enter x of Point B: ");
			int xB = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point B: ");
			int yB = Integer.parseInt(input.readLine());

			Point p = new Point();
			Point p1 = new Point(xA, yA);
			Point p2 = new Point(xB, yB);

			System.out.println("Distance between A and B is : " + p.countDistance(p1, p2));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
