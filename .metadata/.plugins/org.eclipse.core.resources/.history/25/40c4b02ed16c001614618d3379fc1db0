package Bai1_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Run {

	public static void main(String[] args) throws IOException {
		TextBook[] text = new TextBook[0];
		ReferenceBook[] refer = new ReferenceBook[0];
		ManageBook mn = new ManageBook(text, refer);
		int status=1;
		double moneyNew = 0.0;
		double moneyOld = 0.0;
		 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        boolean flag = true;
	        do {
	            System.out.println("do you want in put a book?y/n");
	            String choise = input.readLine();
	            if (choise.equalsIgnoreCase("n")) {
	                flag = false;
	            } else if (choise.equalsIgnoreCase("y")) {
	            	System.out.println("Enter id: ");
	            	String id = input.readLine();
	            	System.out.println("Enter name: ");
	            	String name = input.readLine();
	            	System.out.println("Enter date: ");
	            	String date = input.readLine();
	            	System.out.println("Enter price: ");
	            	double price = Double.parseDouble(input.readLine());
	            	System.out.println("Enter amount: ");
	            	int amount = Integer.parseInt(input.readLine());
	            	System.out.println("Enter publisher: ");
	            	String publisher = input.readLine();
	            	
	            	System.out.println("Choose TextBook/ReferenceBook (1/2)?");
	            	int choose = Integer.parseInt(input.readLine());
	            	if (choose == 1) {
	                	System.out.println("Enter Status: ");
	                	status = Integer.parseInt(input.readLine());
	                	TextBook tb = new TextBook(id, name, date, price, amount, publisher, status);
	                	text = Arrays.copyOf(text, text.length+1);
	                    text[text.length-1] = tb;
	                    mn.setTextbook(text);
	                    if(status==1){
	                    	moneyNew += mn.totalNew();
	                    }else if(status==2){
	                    	moneyOld += mn.totalOld();
	                    }
	                    
	                } else if (choose == 2) {
	                	System.out.println("Enter tax : ");
	                	double tax = Double.parseDouble(input.readLine());
	                	ReferenceBook rb = new ReferenceBook(id, name, date, price, amount, publisher, tax);
	                	refer = Arrays.copyOf(refer, refer.length+1);
	                	refer[refer.length-1] = rb;
	                    mn.setReferencebook(refer);
	                                                                      
	                }
	            }
	            System.out.println("===============================================================");
	            System.out.println("--------------------------TEXT BOOK----------------------------");
	            mn.outputTextBook();
	            System.out.println("Total Book New: "+moneyNew);
	            System.out.println("Total Book Old: "+moneyOld);
	            System.out.println("Total Text Book: "+(moneyNew+moneyOld));
	            System.out.println("-------------------------PREFERENCE BOOK-------------------------------");
	            mn.outputReferenceBook();
	            System.out.println("Total Reference Book: "+mn.totalReferenceBook());
	        } while (flag == true);
	}

}
