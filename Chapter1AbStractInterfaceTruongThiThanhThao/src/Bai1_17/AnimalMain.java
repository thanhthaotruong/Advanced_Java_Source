package Bai1_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AnimalMain {

	public static void main(String[] args) throws IOException {
		Bird[] bird = new Bird[0];
		Boa[] boa = new Boa[0];
		Fish[] fish = new Fish[0];
		Tiger[] tiger = new Tiger[0];
		ManageAnimal mn = new ManageAnimal(bird, boa, fish, tiger);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		do {
			System.out.println("Do you want in put an animal ?y/n");
			String choise = input.readLine();
			if (choise.equalsIgnoreCase("n")) {
				flag = false;
			} else if (choise.equalsIgnoreCase("y")) {
				System.out.println("Enter name of animal: ");
				String name = input.readLine();
				System.out.println("Enter food of animal: ");
				String food = input.readLine();

				System.out.println("Choose type of animal?Bird(1),Fish(2),Tiger(3),Boa(4)");
				int type = Integer.parseInt(input.readLine());

				if (type == 1) {
					Bird b = new Bird(name, food);
					bird = Arrays.copyOf(bird, bird.length + 1);
					bird[bird.length - 1] = b;
					mn.setBird(bird);

				} else if (type == 2) {
					Fish f = new Fish(name, food);
					fish = Arrays.copyOf(fish, fish.length + 1);
					fish[fish.length - 1] = f;
					mn.setFish(fish);

				} else if (type == 3) {
					Tiger t = new Tiger(name, food);
					tiger = Arrays.copyOf(tiger, tiger.length + 1);
					tiger[tiger.length - 1] = t;
					mn.setTiger(tiger);

				} else if (type == 4) {
					Boa bo = new Boa(name, food);
					boa = Arrays.copyOf(boa, boa.length + 1);
					boa[boa.length - 1] = bo;
					mn.setBoa(boa);

				}
			}
			System.out.println(
					"===========================================ANIMAL============================================");
			mn.outputArrBird();
			mn.outputArrFish();
			mn.outputArrTiger();
			mn.outputArrBoa();
			System.out.println(
					"===============================================================================================");
		} while (flag == true);
	}
}
