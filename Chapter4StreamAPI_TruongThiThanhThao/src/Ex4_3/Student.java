package Ex4_3;
/*
 * Author : Thanh Thao
 * Date : 12 Sept 2016
 * Version 1.0
 */
public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private double mark1;
	private double mark2;

	

	public Student(String firstName, String lastName, int age, double mark1,
			double mark2) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getMark1() {
		return mark1;
	}


	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}


	public double getMark2() {
		return mark2;
	}


	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}


	/*
	 * calculate average of student
	 * input : mark1 and mark 2
	 * output : average
	 */
	public double average(){
		return (mark1+mark2)/2;
	}
	@Override
	public String toString() {
		return "Name = "+firstName+" "+lastName+"\tage = "+age+"\tmark 1 = "+mark1+" & "+" mark 2 = "+mark2+" Average: "+average()+"\n";
	}

}
