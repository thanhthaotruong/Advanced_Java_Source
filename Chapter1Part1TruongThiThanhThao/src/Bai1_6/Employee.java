package Bai1_6;

public class Employee {
	String name;
	double salary;
	double coefficientOfSalary;
	int peopleOfVinegar;
	double allowance;

	public Employee() {

	}

	public Employee(String name, double coefficientOfSalary, int peopleOfVinegar, double allowance) {
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

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	// This method has responsible for calculate salary for employee
	public double calculateOfSalary() {
		double income = this.getCoefficientOfSalary() * this.salary + this.allowance;
		double incomeIncludeTax = income - 9000000 - peopleOfVinegar * 3600000;
		double taxOfPeople = calculateOfTax(income, incomeIncludeTax);
		double netcome = income - taxOfPeople;
		return netcome;
	}

	// This method has responsible for calculate tax income of people
	public double calculateOfTax(double income, double incomeIncludeTax) {
		double taxOfPeople = 0.0;
		if (incomeIncludeTax <= 5) {
			taxOfPeople = 0.05 * incomeIncludeTax;
		} else if (incomeIncludeTax > 5 && incomeIncludeTax <= 10) {
			taxOfPeople = 0.1 * incomeIncludeTax;
		} else if (incomeIncludeTax > 10 && incomeIncludeTax <= 18) {
			taxOfPeople = 0.15 * incomeIncludeTax;
		} else if (incomeIncludeTax > 18 && incomeIncludeTax <= 32) {
			taxOfPeople = 0.2 * incomeIncludeTax;
		} else if (incomeIncludeTax > 32 && incomeIncludeTax <= 52) {
			taxOfPeople = 0.25 * incomeIncludeTax;
		} else if (incomeIncludeTax > 52 && incomeIncludeTax <= 80) {
			taxOfPeople = 0.3 * incomeIncludeTax;
		} else {
			taxOfPeople = 0.35 * incomeIncludeTax;
		}
		return taxOfPeople;
	}

}
