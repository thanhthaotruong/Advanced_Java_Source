package Bai1_6;

public class Employee {
	String name;
	long salary;
	double coefficientOfSalary;
	int peopleOfVinegar;
	long allowance;

	public Employee() {

	}

	public Employee(String name, long salary, double coefficientOfSalary, int peopleOfVinegar, long allowance) {
		this.name = name;
		this.salary = salary;
		this.coefficientOfSalary = coefficientOfSalary;
		this.peopleOfVinegar = peopleOfVinegar;
		this.allowance = allowance;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
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
		double income = coefficientOfSalary * salary + allowance;
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
		if (incomeIncludeTax <= 5000000) {
			taxOfPeople = 0.05 * incomeIncludeTax;
		} else if (incomeIncludeTax > 5000000 && incomeIncludeTax <= 10000000) {
			taxOfPeople = 0.1 * incomeIncludeTax;
		} else if (incomeIncludeTax > 10000000 && incomeIncludeTax <= 18000000) {
			taxOfPeople = 0.15 * incomeIncludeTax;
		} else if (incomeIncludeTax > 18000000 && incomeIncludeTax <= 32000000) {
			taxOfPeople = 0.2 * incomeIncludeTax;
		} else if (incomeIncludeTax > 32000000 && incomeIncludeTax <= 52000000) {
			taxOfPeople = 0.25 * incomeIncludeTax;
		} else if (incomeIncludeTax > 52000000 && incomeIncludeTax <= 80000000) {
			taxOfPeople = 0.3 * incomeIncludeTax;
		} else {
			taxOfPeople = 0.35 * incomeIncludeTax;
		}
		return taxOfPeople;
	}

}
