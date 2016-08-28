package Bai1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ComputerMain {

	public static void main(String[] args) throws IOException {
		 	Desktop[] arrD = new Desktop[0];
	        Laptop[] arrL = new Laptop[0];
	        ManageComputer mn = new ManageComputer(arrD, arrL);
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        boolean flag = true;
	        do {
	            System.out.println("do you want in put a computer?y/n");
	            String choise = input.readLine();
	            if (choise.equalsIgnoreCase("n")) {
	                flag = false;
	            } else if (choise.equalsIgnoreCase("y")) {
	        System.out.print("Enter the id : ");
			String id = input.readLine();
			System.out.print("Enter the price : ");
			int price = Integer.parseInt(input.readLine());
			System.out.print("Enter the suplier : ");
			String suplier = input.readLine();
			System.out.print("Enter the quantities : ");
			int quantities = Integer.parseInt(input.readLine());
			
	                System.out.println("choose type of computer: Desktop(1) - Laptop(2)");
	                int chooseType = Integer.parseInt(input.readLine());
	                if (chooseType == 1) {
	                	System.out.print("Enter the information of CPU : ");
	        			String CPU = input.readLine();
	        			System.out.print("Enter the information of Ram : ");
	        			String Ram = input.readLine();
	        			Desktop dkt = new Desktop(id, price,
	        					suplier, quantities, CPU, Ram);
	                	arrD = Arrays.copyOf(arrD, arrD.length+1);
	                    arrD[arrD.length-1] = dkt;
	                    mn.setDesk(arrD);
	                    
	                } else if (chooseType == 2) {
	                	System.out.print("Enter the weight : ");
	            		double weight = Double.parseDouble(input.readLine());
	            		System.out.print("Enter the time of PIN : ");
	            		int timeOfPin = Integer.parseInt(input.readLine());
	            		System.out.print("Enter the size of screen: ");
	            		double sizeOfScreen = Double.parseDouble(input.readLine());
	            		Laptop laptop = new Laptop(id, price,
	            				suplier, quantities, weight,
	            				timeOfPin, sizeOfScreen);
	                	arrL = Arrays.copyOf(arrL, arrL.length+1);
	                    arrL[arrL.length-1] = laptop;
	                    mn.setLap(arrL);
	                                                                      
	                }
	            }
	            System.out.println("==================================");
	            System.out.println("----------DESKTOP--------------");
	            mn.outputDesktop();
	            System.out.println("Total Price : "+String.format("%.0f",mn.totalPriceOfDesktop()));
	            System.out.println("---------------------------------");
	            System.out.println("-----------LAPTOP----------------");
	            mn.outputLaptop();
	            System.out.println("Total Price : "+String.format("%.0f",mn.totalPriceOfLaptop()));
	        } while (flag == true);
	    }


}
