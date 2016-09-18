package Ex6_3;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 14 Sept 2016
 * Version 1.0
 */
import java.text.DecimalFormat;

public class Student {
	String name;
	int grade;
	double mark1;
	double mark2;

	public Student() {
	}

	public Student(String name, int grade, double mark1, double mark2) {
		this.name = name;
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
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
	public double avg(){
		double avg = (mark1+mark2*2)/3; 
		return avg;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.###");
		return name + "\t  \t" + grade + "\t"+mark1+"\t"+mark2+"\t"+df.format(this.avg())+"\n";
	}
}
