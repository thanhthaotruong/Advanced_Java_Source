package Bai1_13;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
public class BusinessEmployee extends Employee {
	private int businessSalary;
	private double propotion;

	public BusinessEmployee(String name, double coefficientOfSalary,
			int peopleOfVinegar, long allowance, int businessSalary,
			double propotion) {
		super(name, coefficientOfSalary, peopleOfVinegar, allowance);
		this.businessSalary = businessSalary;
		this.propotion = propotion;
	}

	public int getBusinessSalary() {
		return businessSalary;
	}

	public void setBusinessSalary(int businessSalary) {
		this.businessSalary = businessSalary;
	}

	public double getPropotion() {
		return propotion;
	}

	public void setPropotion(double propotion) {
		this.propotion = propotion;
	}

	// method for calculate the bonus of salary
	public double bonus() {
		return businessSalary * propotion;
	}

	/*
	 * Override method calculateIncome(), calculateIncomeIncludeTax(),
	 * calculateOfSalary(), calculateOfTax()
	 */
	@Override
	public double calculateIncome() {
		double income = coefficientOfSalary * SALARY + bonus();
		return income;
	}

	@Override
	public double calculateIncomeIncludeTax() {
		return super.calculateIncomeIncludeTax();
	}

	@Override
	public double calculateOfSalary() {
		return super.calculateOfSalary();
	}

	@Override
	public double calculateOfTax(double income, double incomeIncludeTax) {
		return super.calculateOfTax(income, incomeIncludeTax);
	}

	@Override
	public String toString() {
		return super.toString() + " - " + "Business Salary: " + businessSalary
				+ " - " + " Propotion: " + propotion;
	}
}
