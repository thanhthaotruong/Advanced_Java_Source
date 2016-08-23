package Bai1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class ListOfDesktop {
	ArrayList<Desktop> desk = new ArrayList<>();
	
	public ArrayList<Desktop> enterDesk() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the id : ");
			String id = input.readLine();
			System.out.println("Enter the price : ");
			int price = Integer.parseInt(input.readLine());
			System.out.println("Enter the suplier : ");
			String suplier = input.readLine();
			System.out.println("Enter the quantities : ");
			int quantities = Integer.parseInt(input.readLine());
			System.out.println("Enter the informationof CPU : ");
			String CPU = input.readLine();
			System.out.println("Enter the informationof Ram : ");
			String Ram = input.readLine();
			Desktop dkt = new Desktop(id, price, suplier, quantities, CPU, Ram);
			desk.add(dkt);
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return desk;
	}
	public ArrayList<Desktop> outputListDesktop() {
		for (int i = 0; i < desk.size(); i++) {

			System.out.println(desk.get(i).getId()+ " - " + desk.get(i).getSuplier() + " - " + desk.get(i).getQuantities() + " - "
					+ desk.get(i).getPrice()+" - "+desk.get(i).getCPU()+" - "+desk.get(i).getRam());
		}
		return desk;
	}
	public double totalPrice() {
		double total = 0.0;
		for(int i = 0; i<desk.size();i++){
			if (!desk.isEmpty()) {
			total += (desk.get(i).getPrice()*desk.get(i).getQuantities());
			}
		}
		return total;
	}
}
