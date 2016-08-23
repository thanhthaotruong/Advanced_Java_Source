package Bai1_13;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 */
public class Employee {
	String name;
	double coefficientOfSalary;
	int peopleOfVinegar;
	long allowance;

	final int INCOME_TAX_1 = 5000000;
	final int INCOME_TAX_2 = 10000000;
	final int INCOME_TAX_3 = 18000000;
	final int INCOME_TAX_4 = 32000000;
	final int INCOME_TAX_5 = 52000000;
	final int INCOME_TAX_6 = 80000000;

	final int SALARY = 1260000;

	public Employee() {

	}

	public Employee(String name, double coefficientOfSalary, int peopleOfVinegar, long allowance) {
		this.name = name;
		this.coefficientOfSalary = coefficientOfSalary;
		this.peopleOfVinegar = peopleOfVinegar;
		this.allowance = allowance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoefficientOfSalary() {
		return coefficientOfSalary;
	}

	public void setCoefficientOfSalary(double coefficientOfSalary) {
		this.coefficientOfSalary = coefficientOfSalary;
	}

	public int getPeopleOfVinegar() {
		return peopleOfVinegar;
	}

	public void setPeopleOfVinegar(int peopleOfVinegar) {
		this.peopleOfVinegar = peopleOfVinegar;
	}

	public long getAllowance() {
		return allowance;
	}

	public void setAllowance(long allowance) {
		this.allowance = allowance;
	}

	// This method has responsible for calculate income
	public double calculateIncome() {
		double income = coefficientOfSalary * SALARY + allowance;
		return income;

	}

	// This method has responsible for calculate income include tax
	public double calculateIncomeIncludeTax() {
		double income = calculateIncome();
		double incomeIncludeTax = income - 9000000 - peopleOfVinegar * 3600000;
		return incomeIncludeTax;
	}

	// This method has responsible for calculate salary for employee
	public double calculateOfSalary() {
		double income = calculateIncome();
		double incomeIncludeTax = calculateIncomeIncludeTax();
		double taxOfPeople = calculateOfTax(income, incomeIncludeTax);
		double netcome = income - taxOfPeople;
		return netcome;
	}

	// This method has responsible for calculate tax income of people
	public double calculateOfTax(double income, double incomeIncludeTax) {
		double taxOfPeople = 0.0;
		if (incomeIncludeTax <= INCOME_TAX_1) {
			taxOfPeople = 0.05 * incomeIncludeTax;
		} else if (incomeIncludeTax > INCOME_TAX_1 && incomeIncludeTax <= INCOME_TAX_2) {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (incomeIncludeTax - INCOME_TAX_1);
		} else if (incomeIncludeTax > INCOME_TAX_2 && incomeIncludeTax <= INCOME_TAX_3) {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (INCOME_TAX_2 - INCOME_TAX_1)
					+ 0.15 * (incomeIncludeTax - INCOME_TAX_2);
		} else if (incomeIncludeTax > INCOME_TAX_3 && incomeIncludeTax <= INCOME_TAX_4) {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (INCOME_TAX_2 - INCOME_TAX_1)
					+ 0.15 * (INCOME_TAX_3 - INCOME_TAX_2) + 0.2 * (incomeIncludeTax - INCOME_TAX_3);
		} else if (incomeIncludeTax > INCOME_TAX_4 && incomeIncludeTax <= INCOME_TAX_5) {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (INCOME_TAX_2 - INCOME_TAX_1)
					+ 0.15 * (INCOME_TAX_3 - INCOME_TAX_2) + 0.2 * (INCOME_TAX_4 - INCOME_TAX_3)
					+ 0.25 * (incomeIncludeTax - INCOME_TAX_4);
		} else if (incomeIncludeTax > INCOME_TAX_5 && incomeIncludeTax <= INCOME_TAX_6) {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (INCOME_TAX_2 - INCOME_TAX_1)
					+ 0.15 * (INCOME_TAX_3 - INCOME_TAX_2) + 0.2 * (INCOME_TAX_4 - INCOME_TAX_3)
					+ 0.25 * (INCOME_TAX_5 - INCOME_TAX_4) + 0.3 * (incomeIncludeTax - INCOME_TAX_5);
		} else {
			taxOfPeople = 0.05 * INCOME_TAX_1 + 0.1 * (INCOME_TAX_2 - INCOME_TAX_1)
					+ 0.15 * (INCOME_TAX_3 - INCOME_TAX_2) + 0.2 * (INCOME_TAX_4 - INCOME_TAX_3)
					+ 0.25 * (INCOME_TAX_5 - INCOME_TAX_4) + 0.3 * (INCOME_TAX_6 - INCOME_TAX_5)
					+ 0.35 * (incomeIncludeTax - INCOME_TAX_6);
		}
		return taxOfPeople;
	}

	@Override
	public String toString() {
		return "Name: " + name + " |Coefficient of salary: " + coefficientOfSalary + " |Amount of people: "
				+ peopleOfVinegar + " |Allowance: " + allowance;
	}
}
