package Ex1_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:56:13 AM
 */
public class FactoryPatternDemo {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out
				.println("Please choose type of shape: (1:Circle 2:Rectangle 3:Square)");
		int typeShape = Integer.parseInt(input.readLine());
		if (typeShape == 1) {
			CircleFactory circleFactory = new CircleFactory();
			Shape shape = circleFactory.getShape();
			shape.draw();
		} else if (typeShape == 2) {
			RectangleFactory rectangleFactory = new RectangleFactory();
			Shape shape1 = rectangleFactory.getShape();
			shape1.draw();
		} else if (typeShape == 3) {
			SquareFactory squareFactory = new SquareFactory();
			Shape shape2 = squareFactory.getShape();
			shape2.draw();
		}
	}

}