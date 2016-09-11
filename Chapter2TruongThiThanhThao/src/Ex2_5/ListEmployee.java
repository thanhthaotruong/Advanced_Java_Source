package Ex2_5;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ListEmployee {
	ArrayList<Employee> mapEmp = new ArrayList<>();

	
	public ListEmployee(ArrayList<Employee> mapEmp) {
		this.mapEmp = mapEmp;
	}
	
	public ListEmployee() {
	}

	//data for employee
	public ArrayList<Employee> data(){
		Employee employee1 = new Employee("Thao", 22, 7000000);
		Employee employee2 = new Employee("Thanh", 22, 8000000);
		Employee employee3 = new Employee("Quynh", 21, 7000000);
		mapEmp.add(employee1);
		mapEmp.add(employee2);
		mapEmp.add(employee3);
		return mapEmp;
	}
	//add a new employee (input information of employee/ output Map employee)
	public ArrayList<Employee> addEmployee() throws IOException{
		Employee employee = new Employee();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(input.readLine());
		System.out.println("Enter salary: ");
		Double salary = Double.parseDouble(input.readLine());
		employee = new Employee(name, age, salary);
		mapEmp.add(employee);
		return mapEmp;
	}
	//print list employee
	public ArrayList<Employee> outputEmployee(){
		Collections.sort(mapEmp);
		for (int i=0;i<mapEmp.size();i++){
			System.out.println(mapEmp.get(i).toString());
		}
		return mapEmp;
	}
	
}
