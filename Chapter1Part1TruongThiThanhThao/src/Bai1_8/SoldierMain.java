package Bai1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 28 August 2016
 * Version 1.0
 * print the power of soldier
 */
public class SoldierMain {

	public static void main(String[] args) throws IOException {
		//Enter information about Soldier
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of Infrantryman: ");
		String nameOfInfran = input.readLine();
		System.out.print("Enter the power of Infrantryman: ");
		int powerOfInfran = Integer.parseInt(input.readLine());
		System.out.print("Enter the weapon of Infrantryman: ");
		String weaponOfInfran = input.readLine();
		Soldier sd1 = new Infrantryman(nameOfInfran, powerOfInfran, weaponOfInfran);

		System.out.print("Enter the name of Trooper: ");
		String nameOfTrooper = input.readLine();
		System.out.print("Enter the power of Trooper: ");
		int powerOfTrooper = Integer.parseInt(input.readLine());
		System.out.print("Enter the weapon of Trooper: ");
		String weaponOfTrooper = input.readLine();
		Soldier sd2 = new Trooper(nameOfTrooper, powerOfTrooper, weaponOfTrooper);

		System.out.println("Please choose Infrantryman of Trooper?(1 Or 2)");
		int choose = Integer.parseInt(input.readLine());
		//Calculate the power of each soldier
		while (powerOfInfran > 0 && powerOfTrooper > 0) {
			powerOfInfran = sd1.fight();
			powerOfTrooper = sd2.fight();
		}
		switch (choose) {
		case 1:
			System.out.println("Power of Infrantryman is : " + powerOfInfran);
			break;
		case 2:
			System.out.println("Power of Trooper is : " + powerOfTrooper);
		default:
			break;
		}
	}

}
