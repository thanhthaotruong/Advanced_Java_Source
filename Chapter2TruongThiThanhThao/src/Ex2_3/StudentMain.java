package Ex2_3;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		TreeMapStudent treeMapStudent = new TreeMapStudent();
		while (true) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			// choose one of all option below
			System.out.println("===========OPTION===========");
			System.out.println("1-Add New\n2-Remove\n3-Show all student\n4-Search student");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			// choose =1 :Add New Student
			case 1:
				treeMapStudent.add();
				treeMapStudent.showAll();
				break;
			// choose =2 :Remove Student
			case 2:
				System.out.print("Enter id of student you want to delete:");
				int key = Integer.parseInt(input.readLine());
				treeMapStudent.remove(key);
				treeMapStudent.showAll();
				break;
			// Show all student
			case 3:
				treeMapStudent.data();
				treeMapStudent.showAll();
				break;
			// search student by id
			case 4:
				System.out.println("Enter id you want to search");
				int key1 = Integer.parseInt(input.readLine());
				treeMapStudent.searchKey(key1);
				break;
			default:
				break;
			}
		}
	}

}
