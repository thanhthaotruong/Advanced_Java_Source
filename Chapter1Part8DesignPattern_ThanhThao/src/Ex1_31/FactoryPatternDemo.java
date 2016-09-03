package Ex1_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 2:11:55 PM
 */
public class FactoryPatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out
				.println("Please choose type of AoDai: (1:Traditional 2:Stylized 3:cheongsam)");
		int type = Integer.parseInt(input.readLine());
		if (type == 1) {
			TraditionalDressFactory traditionalDressFactory = new TraditionalDressFactory();
			Product product = traditionalDressFactory.getTailor();
			product.sew();
		} else if (type == 2) {
			StylizedFactory stylizedFactory = new StylizedFactory();
			Product product = stylizedFactory.getTailor();
			product.sew();
		} else if (type == 3) {
			CheongsamFactory cheongsamFactory = new CheongsamFactory();
			Product product = cheongsamFactory.getTailor();
			product.sew();
		}
	}
}