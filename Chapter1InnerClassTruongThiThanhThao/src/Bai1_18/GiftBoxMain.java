package Bai1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
/*
 * GiftBoxMain for print the fee of gift when user input necessary information of gift as shape, color, name, weight
 */
public class GiftBoxMain {

	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("#,###");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
		//Enter information about the gift as shape, color, name, weight
		System.out.print("Enter shape:");
		String shape = input.readLine();
		System.out.print("Enter color: ");
		String color = input.readLine();
		System.out.print("Enter name: ");
		String name = input.readLine();
		System.out.print("Enter weight: ");
		double weight = Double.parseDouble(input.readLine());
		
		GiftBox.Gift gift = new GiftBox(shape, color).new Gift(name, weight);
		System.out.println("==================================================================================================");
		System.out.println("------------------------------------------INFORMATION GIFT----------------------------------------");
		System.out.println("Name: "+name+" |Shape: "+shape+" |Color: "+color+" |Weight: "+weight+df.format(gift.callFee()));
		System.out.println("==================================================================================================");
		}catch(IOException ex){
			System.out.println("Error: "+ex.getMessage());
		}
	}

}
