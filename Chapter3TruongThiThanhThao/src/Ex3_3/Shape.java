package Ex3_3;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 09 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shape {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Enter radius: ");
			double r = Double.parseDouble(input.readLine());
			Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
			System.out
					.println("S = PI * (r*r) = " + circle.calArea(Math.PI, r));
			System.out.println("Enter length: ");
			double H = Double.parseDouble(input.readLine());
			System.out.println("Enter wighth: ");
			double W = Double.parseDouble(input.readLine());
			Area rectangle = (double x1, double x2) -> x1 * x2;
			System.out.println("S = W * H = " + rectangle.calArea(W, H));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	interface Area {
		public double calArea(double x1, double x2);
	}
}
