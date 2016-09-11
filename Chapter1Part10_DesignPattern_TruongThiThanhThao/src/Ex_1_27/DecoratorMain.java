package Ex_1_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class DecoratorMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			//Choose shape and type of decorator for each shape
			System.out.println("Please choose shape?? (1:Cirlce 2:Rectangle)");
			int shape = Integer.parseInt(input.readLine());

			System.out
					.println("Please choose decorate?? (1:decorate 0:nonDecorate)");
			int decorate = Integer.parseInt(input.readLine());
			//execute draw() shape
			switch (shape) {
			case 1:
				Circle c = new Circle();
				if (decorate == 0) {
					System.out.println(c.draw());
				} else if (decorate == 1) {
					RedShapeDecorator redShapeDecorator = new RedShapeDecorator(
							c);
					System.out.println(redShapeDecorator.draw());
				}
				break;
			case 2:
				Rectangle r = new Rectangle();
				if (decorate == 0) {
					System.out.println(r.draw());
				} else if (decorate == 1) {
					RedShapeDecorator redShapeDecorator = new RedShapeDecorator(
							r);
					System.out.println(redShapeDecorator.draw());
				}
				break;
			default:
				break;
			}

		} catch (NumberFormatException|IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
