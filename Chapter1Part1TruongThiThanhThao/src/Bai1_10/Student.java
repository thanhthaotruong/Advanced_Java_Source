package Bai1_10;

public class Student extends Human{
	private String studentOfClass;
	private double markOfSemester1;
	private double markOfSemester2;
	public Student(String name, String dateOfBirth, String address, String phone, String studentOfClass,double markOfSemester1,double markOfSemester2 ) {
		super(name, dateOfBirth, address, phone);
		this.studentOfClass = studentOfClass;
		this.markOfSemester1 = markOfSemester1;
		this.markOfSemester2 = markOfSemester2;
	}
	public String getStudentOfClass() {
		return studentOfClass;
	}
	public void setStudentOfClass(String studentOfClass) {
		this.studentOfClass = studentOfClass;
	}
	public double getMarkOfSemester1() {
		return markOfSemester1;
	}
	public void setMarkOfSemester1(double markOfSemester1) {
		this.markOfSemester1 = markOfSemester1;
	}
	public double getMarkOfSemester2() {
		return markOfSemester2;
	}
	public void setMarkOfSemester2(double markOfSemester2) {
		this.markOfSemester2 = markOfSemester2;
	}
	public double calculateMediumScore(){
		double score = (this.markOfSemester1 + this.markOfSemester2)/2;
		return score;
	}
	@Override
	public String printInformation() {
		return super.printInformation()+" |Mark of semester 1: "+markOfSemester1+" |Mark of semester 2: "+markOfSemester2 
				+" |Average: "+ calculateMediumScore();
	}

}
