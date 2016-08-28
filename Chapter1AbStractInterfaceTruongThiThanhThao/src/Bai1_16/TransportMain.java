package Bai1_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TransportMain {

	public static void main(String[] args) throws IOException {
		Car[] car = new Car[0];
		Boat[] boat = new Boat[0];
		ManageTranport mn = new ManageTranport(car, boat);
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		boolean flag = true;
		do {
			System.out.println("Do you want in put a transport?y/n");
			String choise = input.readLine();
			if (choise.equalsIgnoreCase("n")) {
				flag = false;
			} else if (choise.equalsIgnoreCase("y")) {
				System.out.println("Enter distance: ");
				float distance = Float.parseFloat(input.readLine());
				System.out.println("Enter time: ");
				int time = Integer.parseInt(input.readLine());
				System.out.println("Enter Fuel: ");
				float fuelUsing = Float.parseFloat(input.readLine());
				System.out.println("Enter ID: ");
				String id = input.readLine();
				System.out.println("Enter Owner: ");
				String owner = input.readLine();
				System.out.println("Enter color: ");
				String color = input.readLine();
				System.out.println("Enter manufacturer: ");
				String manufacturer = input.readLine();

				System.out.println("Choose type of transport??(Car(1),Boat(2)");
				int type = Integer.parseInt(input.readLine());

				if (type == 1) {
					System.out.println("Enter gear: ");
					String gear = input.readLine();
					System.out.println("Enter model: ");
					String model = input.readLine();
					Car c = new Car(distance, time, fuelUsing, id, owner, color, manufacturer, gear, model);
					car = Arrays.copyOf(car, car.length + 1);
					car[car.length - 1] = c;
					mn.setCar(car);
				} else if (type == 2) {
					System.out.println("Enter weight: ");
					double weight = Double.parseDouble(input.readLine());
					System.out.println("Enter Capacity: ");
					double capacity = Double.parseDouble(input.readLine());
					System.out.println("Enter speed straight: ");
					double speedStraight = Double.parseDouble(input.readLine());
					System.out.println("Enter speed reverse: ");
					double speedReverse = Double.parseDouble(input.readLine());
					System.out.println("Enter waste fuel: ");
					double wasteFuelStart = Double
							.parseDouble(input.readLine());
					System.out.println("Enter type of fuel: ");
					String typeOfFuel = input.readLine();
					Boat b = new Boat(distance, time, fuelUsing, id, owner, color, manufacturer, weight, capacity, speedStraight, speedReverse, wasteFuelStart, typeOfFuel);
					boat = Arrays.copyOf(boat, boat.length + 1);
					boat[boat.length - 1] = b;
					mn.setBoat(boat);
				}
			}
			System.out.println("=======================================================================================");
			System.out.println("--------------------------------CAR----------------------------------------------------");
			mn.outputArrCar();
			System.out.println("--------------------------------BOAT---------------------------------------------------");
			mn.outputArrBoat();
			System.out.println("========================================================================================");
		} while (flag == true);
	}

}
