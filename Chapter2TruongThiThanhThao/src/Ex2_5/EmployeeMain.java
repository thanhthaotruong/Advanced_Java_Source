package Ex2_5;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		ListEmployee listEmployee = new ListEmployee();
		while (true) {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			//choose one of 2 option
			System.out.println("===========OPTION==========");
			System.out.println("1-Show all employee\n2-Add new employee");
			int option = Integer.parseInt(input.readLine());
			switch (option) {
			//option = 1 :show all employee
			case 1:
				listEmployee.data();
				listEmployee.outputEmployee();
				break;
				//option = 2:add new employee
			case 2:
				listEmployee.outputEmployee();
				listEmployee.addEmployee();
				listEmployee.outputEmployee();
				break;
			default:
				break;
			}
		}
	}

}
