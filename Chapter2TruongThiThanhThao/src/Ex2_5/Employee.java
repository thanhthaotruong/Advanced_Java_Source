package Ex2_5;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private double salary;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" |Age: "+age+" |Salary: "+String.format("%.2f", salary);
	}
	//method sort decrease
	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.salary){
			return 1;
		}else if (this.salary == o.salary){
			return 0;
		}else {
			return -1;
		}
	}

}
