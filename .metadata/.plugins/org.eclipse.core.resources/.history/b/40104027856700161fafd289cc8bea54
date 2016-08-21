package Bai1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ListOfCD {
	ArrayList<CD> list = new ArrayList<>();

	public ListOfCD(ArrayList<CD> list) {
		this.list = list;
	}
	
	public ArrayList<CD> getList() {
		return list;
	}

	public void setList(ArrayList<CD> list) {
		this.list = list;
	}

	public ListOfCD() {
	}
	public ArrayList<CD> enterCD() throws IOException {
		
		CD cd1 = new CD();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the id : ");
			String id = input.readLine();
			System.out.println("Enter the name : ");
			String name = input.readLine();
			System.out.println("Enter the singer : ");
			String singer = input.readLine();
			System.out.println("Enter the number of songs : ");
			int numOfSongs = Integer.parseInt(input.readLine());
			System.out.println("Enter the price of CD : ");
			double price = Double.parseDouble(input.readLine());
			cd1 = new CD(id, name, singer, numOfSongs, price);
			list.add(cd1);
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return list;
	}
	public ArrayList<CD> outputListCD() {
		DecimalFormat df = new DecimalFormat("#,###");
		for (int i = 0; i < list.size(); i++) {
            System.out.print("CD " + (i+1));
            System.out.print(" - ID: " + list.get(i).getId() + " |Name: " + list.get(i).getName()
            		+" |Singer : " + list.get(i).getSinger()+" |Number Of Songs : "+list.get(i).getNumOfSongs()
            		+" |Price : "+df.format(list.get(i).getPrice())+"\n");
        }
		return list;
	}

	public double totalPrice() {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.isEmpty()) {
                total += list.get(i).getPrice();
            }
        }
        return total;
    }
}
