package Bai1_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("#,###");
		BusinessEmployee[] be = new BusinessEmployee[0];
		ProductEmployee[] pe = new ProductEmployee[0];
		ManageEmployee mn = new ManageEmployee(be, pe);
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			boolean flag = true;
			do {
				System.out.println("Do you want in put an employee?y/n");
				String choise = input.readLine();
				if (choise.equalsIgnoreCase("n")) {
					flag = false;
				} else if (choise.equalsIgnoreCase("y")) {
					System.out.println("Enter your name: ");
					String name = input.readLine();
					System.out.println("Enter your coefficient of salary: ");
					double coefficientOfSalary = Double.parseDouble(input
							.readLine());
					System.out.println("Enter your people of vinegar: ");
					int peopleOfVinegar = Integer.parseInt(input.readLine());
					System.out.println("Enter your allowance: ");
					long allowance = Long.parseLong(input.readLine());

					System.out
							.println("choose type of employee: Business(1) - Product(2)");
					int chooseType = Integer.parseInt(input.readLine());

					if (chooseType == 1) {
						System.out.println("Enter Business Salary: ");
						int businessSalary = Integer.parseInt(input.readLine());
						System.out.println("Enter propotion: ");
						double propotion = Double.parseDouble(input.readLine());
						BusinessEmployee b = new BusinessEmployee(name,
								coefficientOfSalary, peopleOfVinegar,
								allowance, businessSalary, propotion);
						be = Arrays.copyOf(be, be.length + 1);
						be[be.length - 1] = b;
						mn.setBe(be);
					} else if (chooseType == 2) {
						System.out.println("Enter amount: ");
						int amount = Integer.parseInt(input.readLine());
						ProductEmployee p = new ProductEmployee(name,
								coefficientOfSalary, peopleOfVinegar,
								allowance, amount);
						pe = Arrays.copyOf(pe, pe.length + 1);
						pe[pe.length - 1] = p;
						mn.setPe(pe);
					}
				}
				System.out
						.println("=================================================================");
				System.out
						.println("---------------------------------BUSINESS EMPLOYEE-----------------------------");
				mn.outputBusinessEmp();
				System.out.println("Average salary: "
						+ df.format(mn.averageSalaryBusiness()));
				System.out
						.println("---------------------------------PRODUCT EMPLOYEE-----------------------------------");
				mn.outputProductEmp();
				System.out.println("Average salary: "
						+ df.format(mn.averageSalaryProduct()));
			} while (flag == true);
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
