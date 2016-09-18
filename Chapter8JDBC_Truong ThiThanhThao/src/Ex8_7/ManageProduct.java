package Ex8_7;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import Ex8_7.ProductController;

public class ManageProduct {
	static ProductController productController = new ProductController();
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			System.out
					.println("================WELCOME MY STORE====================");
			System.out.println("\t=================OPTION===============");
			System.out.println("1-Transaction 1\n2-Transaction 2\n3-Transaction 3");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:
				productController.transaction1();
				System.out.println("Finished Transaction 1!");
				break;
			case 2:
				productController.transaction2();
				System.out.println("Finished Transaction 2!");
				break;
			case 3:
				productController.transaction3();
				System.out.println("Finished Transaction 3!");
				break;
			default:
				break;
			}
		}
	}

}
