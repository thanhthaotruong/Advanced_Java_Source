package Ex1_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:19:42 AM
 */
public class Student {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			SingletonTeacher obj = SingletonTeacher.getInstance();
			System.out.println("Do you want to create teacher???");
			String choose = input.readLine();
			if (choose.equalsIgnoreCase("y")) {
				// show the share document
				System.out.println(obj.getDocument());
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}