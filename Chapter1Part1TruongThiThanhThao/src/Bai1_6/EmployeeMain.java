package Bai1_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * calculate income,Income Include Tax, Tax, Salary of employee
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Enter information about employee
			System.out.println("Enter your name: ");
			String name = input.readLine();
			System.out.println("Enter your coefficient of salary: ");
			double coefficientOfSalary = Double.parseDouble(input.readLine());
			System.out.println("Enter your people of vinegar: ");
			int peopleOfVinegar = Integer.parseInt(input.readLine());
			System.out.println("Enter your allowance: ");
			long allowance = Long.parseLong(input.readLine());

			Employee e = new Employee(name, coefficientOfSalary, peopleOfVinegar, allowance);

			DecimalFormat df = new DecimalFormat("#,###");
			//calculate income,Income Include Tax, Tax, Salary of employee
			double income = e.calculateIncome();
			System.out.println("Income : " + df.format(income));
			double incomeIncludeTax = e.calculateIncomeIncludeTax();
			System.out.println("Income Include Tax : " + df.format(incomeIncludeTax));
			double tax = e.calculateOfTax(income, incomeIncludeTax);
			System.out.println("Tax : " + df.format(tax));
			double sal = e.calculateOfSalary();
			System.out.println("Salary : " + df.format(sal));

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
