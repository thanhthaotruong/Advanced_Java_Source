package Bai1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Run {

	public static void main(String[] args) throws IOException {
		Teacher[] teacher = new Teacher[0];
		Student[] student = new Student[0];
		ManageHuman manage = new ManageHuman(student, teacher);
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		boolean flag = true;
		do {
			System.out.println("do you want in put a human?y/n");
			String choise = input.readLine();
			if (choise.equalsIgnoreCase("n")) {
				flag = false;
			} else if (choise.equalsIgnoreCase("y")) {
				System.out.println("Enter name : ");
				String name = input.readLine();
				System.out.println("Enter date of birth: ");
				String dateOfBirth = input.readLine();
				System.out.println("Enter address : ");
				String address = input.readLine();
				System.out.println("Enter phone : ");
				String phone = input.readLine();

				System.out
						.println("Choose Student or Teacher?(1:Student 2:Teacher)");
				int choose = Integer.parseInt(input.readLine());
				if (choose == 2) {
					System.out.println("Enter chairmain of class : ");
					String chairManOfClass = input.readLine();
					System.out.println("Enter coefficientOfSalary: ");
					double coefficientOfSalary = Double.parseDouble(input
							.readLine());
					System.out.println("Enter allowance: ");
					int allowance = Integer.parseInt(input.readLine());
					Teacher t = new Teacher(name, dateOfBirth, address, phone,
							coefficientOfSalary, allowance, chairManOfClass);
					teacher = Arrays.copyOf(teacher, teacher.length + 1);
					teacher[teacher.length - 1] = t;
					manage.setTeacher(teacher);
				} else if (choose == 1) {
					System.out.println("Enter student of class : ");
					String studentOfClass = input.readLine();
					System.out.println("Enter score of semester I : ");
					double markOfSemester1 = Double.parseDouble(input
							.readLine());
					System.out.println("Enter score of semester II : ");
					double markOfSemester2 = Double.parseDouble(input
							.readLine());
					Student st = new Student(name, dateOfBirth, address, phone,
							studentOfClass, markOfSemester1, markOfSemester2);
					student = Arrays.copyOf(student, student.length + 1);
					student[student.length - 1] = st;
					manage.setSt(student);
				}
			}
			System.out
					.println("========================================================================================================");
			System.out
					.println("------------------------------------------------TEACHER---------------------------------------------------");
			manage.outputTeacher();
			System.out
					.println("------------------------------------------------STUDENT--------------------------------------------------");
			manage.outputStudent();
		} while (flag == true);
	}

}
