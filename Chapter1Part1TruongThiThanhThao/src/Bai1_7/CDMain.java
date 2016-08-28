package Bai1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * print information aboout CD
 */
public class CDMain {

	public static void main(String[] args) throws IOException {
		ListOfCD listCD = new ListOfCD();
		listCD.enterCD();
		System.out.println("Total price is : " + listCD.totalPrice());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String choose;
		do {
			System.out.println("Do you want add a CD?Y/N");
			choose = input.readLine();
			if (choose.equals("y")) {
				listCD.enterCD();
				listCD.outputListCD();
				System.out.println("Total price is : " + listCD.totalPrice());
			} else if (choose.equals("n")) {
				break;
			}
		} while (choose.equals("y"));

	}

}
