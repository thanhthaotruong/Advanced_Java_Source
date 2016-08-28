package Bai1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * calculate the distance of 2 point
 */
public class PointMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Enter information of 2 point (x,y)
			System.out.print("Enter x of Point A: ");
			int xA = Integer.parseInt(input.readLine());
			System.out.print("Enter y of Point A: ");
			int yA = Integer.parseInt(input.readLine());

			Point p = new Point();
			Point p1 = new Point(xA, yA);
			//calculate the distance
			System.out.println("Distance between A and B is : " + p.countDistance(p1));
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
