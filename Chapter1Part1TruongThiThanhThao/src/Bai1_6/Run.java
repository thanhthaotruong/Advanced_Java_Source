package Bai1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name  = input.readLine();
		System.out.println("Enter your income: ");
		double salary = Double.parseDouble(input.readLine());
		System.out.println("Enter your coefficient of salary: ");
		double coefficientOfSalary = Double.parseDouble(input.readLine());
		System.out.println("Enter your people of vinegar: ");
		int peopleOfVinegar = Integer.parseInt(input.readLine());
		System.out.println("Enter your allowance: ");
		double allowance = Double.parseDouble(input.readLine());
		
		System.out.println("Income : ");
	}

}
