package Ex_1_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class AccountMain {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Please input money you need withdraw:");
			double withdraw = Double.parseDouble(input.readLine());
			Account account = new Account();

			if (withdraw <= 10000000) {
				// account.setState(10000000);
				MobiObserver m = new MobiObserver(account);
				System.out.println(m.update());
				EmailObserver e = new EmailObserver(account);
				System.out.println(e.update());
			}
			System.out.println("Your balance is not enough!!");
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
