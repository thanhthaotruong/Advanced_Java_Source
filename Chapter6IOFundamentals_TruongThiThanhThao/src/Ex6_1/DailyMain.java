package Ex6_1;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 14 Sept 2016
 * Version 1.0
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DailyMain {
	public static void readDaily() throws FileNotFoundException, IOException{
		String daily="";
		String date;
		String content;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/Ex6_1/daily.txt")))){
			while (true) {
				date = in.readUTF();
				content = in.readUTF();
				daily += date + "\n" + content + "\n\n";
				System.out.println(daily);
			}
		}catch(EOFException e){
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void writeDaily() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter content: ");
		String content = input.readLine();
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/Ex6_1/daily.txt", true)))){
			Date today=new Date(System.currentTimeMillis());
			SimpleDateFormat timeFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String s=timeFormat.format(today.getTime());
			out.writeUTF(s);
			out.writeUTF(content);
			System.out.println("Daily is written.");
		}catch(IOException ex){
			System.out.println("Error: "+ex.getMessage());
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please choose ");
		System.out.println("1-Read daily \n2-Update daily");
		int choose = Integer.parseInt(input.readLine());
		if (choose==1){
			readDaily();
		}else if (choose ==2){
			writeDaily();
		}
	}

}
