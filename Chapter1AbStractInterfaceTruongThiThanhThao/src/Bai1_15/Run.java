package Bai1_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Enter name of instrument: ");
			String name = input.readLine();
			System.out.println("Enter producer of instrument: ");
			String producer = input.readLine();

			System.out
					.println("Choose the type of instrument??(StringedInstrument(1),NoneStringedInstrument(2))");
			int type = Integer.parseInt(input.readLine());

			if (type == 1) {
				System.out.println("Enter the number of stringed: ");
				int numberOfStringed = Integer.parseInt(input.readLine());
				StringedInstrument str = new StringedInstrument(name, producer,
						numberOfStringed);
				System.out.println("*****************INFORMATION PLAY INSTRUMENT***************");
				System.out.println(str.play());

			} else if (type == 2) {
				System.out.println("Enter the using of instrument: ");
				String using = input.readLine();
				NonStringedInstrument nonStr = new NonStringedInstrument(name,
						producer, using);
				System.out.println("*****************INFORMATION PLAY INSTRUMENT***************");
				System.out.println(nonStr.play());
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
	}

}
