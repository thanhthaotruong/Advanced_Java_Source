package Bai1_10;

public class Teacher extends Human{
	private double coefficientOfSalary;
	private int allowance;
	private String chairManOfClass;
	final int INCOME = 1260000;
	
	public Teacher(String name, String dateOfBirth, String address, String phone,double coefficientOfSalary, int allowance,String chairManOfClass ) {
		super(name, dateOfBirth, address, phone);
		this.coefficientOfSalary=coefficientOfSalary;
		this.allowance=allowance;
		this.chairManOfClass=chairManOfClass;
	}
	
	public double getCoefficientOfSalary() {
		return coefficientOfSalary;
	}

	public void setCoefficientOfSalary(double coefficientOfSalary) {
		this.coefficientOfSalary = coefficientOfSalary;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public String getChairManOfClass() {
		return chairManOfClass;
	}

	public void setChairManOfClass(String chairManOfClass) {
		this.chairManOfClass = chairManOfClass;
	}

	public double calculateSalary(){
		double salary = this.coefficientOfSalary * INCOME + allowance;
		return salary;
	}

	@Override
	public String printInformation() {
		return super.printInformation()+" |Salary: "+String.format("%.0f", calculateSalary());
	}
	
}
