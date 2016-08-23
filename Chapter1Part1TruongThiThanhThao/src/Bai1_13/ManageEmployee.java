package Bai1_13;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
public class ManageEmployee {
	BusinessEmployee[] be;
	ProductEmployee[] pe;

	public ManageEmployee(BusinessEmployee[] be, ProductEmployee[] pe) {
		super();
		this.be = be;
		this.pe = pe;
	}

	public BusinessEmployee[] getBe() {
		return be;
	}

	public void setBe(BusinessEmployee[] be) {
		this.be = be;
	}

	public ProductEmployee[] getPe() {
		return pe;
	}

	public void setPe(ProductEmployee[] pe) {
		this.pe = pe;
	}

	/*
	 * method for print information of Business Employee
	 */
	public void outputBusinessEmp() {
		for (int i = 0; i < be.length; i++) {
			if (be[i] != null)
				System.out.println(be[i].toString());
		}
	}

	/*
	 * method for print information of Product Employee
	 */
	public void outputProductEmp() {
		for (int i = 0; i < pe.length; i++) {
			if (pe[i] != null)
				System.out.println(pe[i].toString());
		}
	}

	/*
	 * method for calculate average of total salary of Business Employee
	 */
	public double averageSalaryBusiness() {
		double money = 0.0;
		int count = 0;
		for (int i = 0; i < be.length; i++) {
			money += be[i].calculateOfSalary();
			count++;
		}
		return (money / count);
	}

	/*
	 * method for calculate average of total salary of Product Employee
	 */
	public double averageSalaryProduct() {
		double money = 0.0;
		int count = 0;
		for (int i = 0; i < pe.length; i++) {
			money += pe[i].calculateOfSalary();
			count++;
		}
		return (money / count);
	}
}
