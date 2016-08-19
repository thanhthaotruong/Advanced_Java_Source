package Bai1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your name: ");
			String name = input.readLine();
			System.out.println("Enter your income: ");
			long salary = Long.parseLong(input.readLine());
			System.out.println("Enter your coefficient of salary: ");
			double coefficientOfSalary = Double.parseDouble(input.readLine());
			System.out.println("Enter your people of vinegar: ");
			int peopleOfVinegar = Integer.parseInt(input.readLine());
			System.out.println("Enter your allowance: ");
			long allowance = Long.parseLong(input.readLine());

			Employee e = new Employee(name, salary, coefficientOfSalary, peopleOfVinegar, allowance);

			double income = e.calculateIncome();
			System.out.println("Income : " + String.format("%.0f", income));
			double incomeIncludeTax = e.calculateIncomeIncludeTax();
			System.out.println("Income Include Tax : " + String.format("%.0f", incomeIncludeTax));
			double tax = e.calculateOfTax(income, incomeIncludeTax);
			System.out.println("Tax : " + String.format("%.0f", tax));
			double sal = e.calculateOfSalary();
			System.out.println("Salary : " + String.format("%.0f", sal));

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
