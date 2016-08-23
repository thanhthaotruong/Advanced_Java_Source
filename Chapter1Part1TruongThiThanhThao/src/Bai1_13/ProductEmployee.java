package Bai1_13;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
public class ProductEmployee extends Employee {
	private int amount;
	final int NOMS = 1000;
	final double BONUS = 0.05;

	public ProductEmployee(String name, double coefficientOfSalary,
			int peopleOfVinegar, long allowance, int amount) {
		super(name, coefficientOfSalary, peopleOfVinegar, allowance);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// method for calculate bonus of salary
	public double bonus() {
		return (amount - NOMS) * BONUS;
	}

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
		return super.toString() + " - " + "Amount: " + amount;
	}

}
