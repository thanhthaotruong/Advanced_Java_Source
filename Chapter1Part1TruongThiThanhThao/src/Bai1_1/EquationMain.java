package Bai1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * Check equation and calculate root of equation
 */
public class EquationMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Enter number a, b in ax + b = 0
			System.out.println("Enter a: ");
			int a = Integer.parseInt(input.readLine());
			System.out.println("Enter b: ");
			int b = Integer.parseInt(input.readLine());
			Equation e = new Equation(a,b);
			//check the equation and calculate root
			if (e.calculate() == 0.0) {
				System.out.println("Many root");
			} else if (e.calculate() == 1.0) {
				System.out.println("No root");
			} else {
				System.out.println("Root is: " + e.calculate());
			}
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.toString());

		}

	}

}
