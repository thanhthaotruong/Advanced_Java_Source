package Ex2_3;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
public class Student {
	private String name;
	private int age;
	private String placeOfBirth;

	public Student(String name, int age, String placeOfBirth) {
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
	}

	public Student() {
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

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	@Override
	public String toString() {
		return "Name: " + name + " |Age: " + age + " |Place of birth: "
				+ placeOfBirth;
	}
}
