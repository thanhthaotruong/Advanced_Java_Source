package Ex6_4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	public static void search(List<Employee> list) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter name: ");
		String name = input.readLine();
		for (Object element : list) {
			Employee we = (Employee) element;
			if (we.getName().equalsIgnoreCase(name)) {
				System.out.println("Founded!");
				System.out.println(we.toString());
			} else {
				System.out.println("Not Found!!");
			} 
		}
	}

	public static void addEmployee() throws FileNotFoundException, IOException {
		Employee e = new Employee();
		try (ObjectOutputStream  out = new ObjectOutputStream (
				new FileOutputStream("src/Ex6_4/employee.txt", true))) {
			
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			String type="y";
			while(type.equalsIgnoreCase("y")){
			System.out.println("Do you want to continue add employee?(y/n)");
			type = input.readLine();
			
			if(type.equalsIgnoreCase("y")){
			System.out.println("Enter name: ");
			String name = input.readLine();
			System.out.println("Enter coefficientOfSalary: ");
			double coefficientOfSalary = Double.parseDouble(input.readLine());
			System.out.println("Enter people: ");
			int peopleOfVinegar = Integer.parseInt(input.readLine());
			System.out.println("Enter Allowance: ");
			Long allowance = Long.parseLong(input.readLine());
			e = new Employee(name, coefficientOfSalary,
					peopleOfVinegar, allowance);
			}else if (type.equalsIgnoreCase("n")){
			out.writeObject(e);
			out.flush();
			out.close();
			System.out.println("Finished add!");
			}
			}
		} catch (EOFException ex) {
			System.out.println("Eror: " + ex.getMessage());
		}
	}

	public static List<Employee> read(List<Employee> list)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		list = new ArrayList<>();
		Employee e = new Employee();
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(
						"src/Ex6_4/employee.txt")))) {
			while (true) {
				e = (Employee) in.readObject();
				//System.out.println(e.toString());
				list.add(e);
				 for (int i=0; i<list.size();i++){
				 System.out.println(list.get(i).toString());
				 }
			}

		} catch (EOFException ex) {
			System.out.println("Eror: " + ex.getMessage());
		}
		return list;
	}

	public static void execute() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		List<Employee> list = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(
						"src/Ex6_4/employee.txt")))) {
			while (true) {
				Employee e = (Employee) in.readObject();
				list.add(e);
				// tim kiem theo ten
				search(list);
			}

		} catch (EOFException ex) {
			System.out.println("Eror: " + ex.getMessage());
		}
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		List<Employee> list = new ArrayList<Employee>();
		while (true) {
			System.out.println("=========OPTION==========");
			System.out
					.println("1-Add Employee\n2-Read file\n3-Search Employee");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:
				addEmployee();
				break;
			case 2:
				read(list);
				
				break;
			case 3:
				execute();
				break;
			default:
				break;
			}
		}
	}

}
