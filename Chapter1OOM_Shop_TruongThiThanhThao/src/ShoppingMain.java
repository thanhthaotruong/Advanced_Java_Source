import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:39 AM
 */
public class ShoppingMain {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// List product in shop
		Product[] listProduct = new Product[10];
		listProduct[0] = new Product("ToothPaste", 24000);
		listProduct[1] = new Product("Shower Gel", 54000);
		listProduct[2] = new Product("Egg       ", 2500);
		listProduct[3] = new Product("Vegetable ", 25000);
		listProduct[4] = new Product("Milk      ", 5000);
		listProduct[5] = new Product("Water     ", 6000);
		listProduct[6] = new Product("Candy     ", 10000);
		listProduct[7] = new Product("Sunsilk   ", 34000);
		listProduct[8] = new Product("Fruit     ", 24000);
		listProduct[9] = new Product("Banana    ", 8000);
		// Print list of product that in my shop
		System.out
				.println("================ PLEASE CHOOSE PRODUCT =================");
		for (int i = 0; i < listProduct.length; i++) {
			System.out.println("\t"+(i + 1) + " " + listProduct[i].toString());
		}
		OrderDetail[] listOrderDetail = new OrderDetail[0];
		boolean flag = true;
		do {
			System.out.print("Do you want to add product continue?y/n");
			String choise = input.readLine();
			if (choise.equalsIgnoreCase("n")) {
				flag = false;
			} else if (choise.equalsIgnoreCase("y")) {

				System.out.print("Please choose product: ");
				int product = Integer.parseInt(input.readLine());
				System.out.print("Please enter quantity: ");
				int quantity = Integer.parseInt(input.readLine());

				// add product that customer choose into listOrderDetail
				switch (product) {
				case 1:
					OrderDetail detail1 = new OrderDetail(quantity,
							listProduct[0]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail1;

					break;
				case 2:
					OrderDetail detail2 = new OrderDetail(quantity,
							listProduct[1]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail2;
					break;
				case 3:
					OrderDetail detail3 = new OrderDetail(quantity,
							listProduct[2]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail3;
					break;
				case 4:
					OrderDetail detail4 = new OrderDetail(quantity,
							listProduct[3]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail4;
					break;
				case 5:
					OrderDetail detail5 = new OrderDetail(quantity,
							listProduct[4]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail5;
					break;
				case 6:
					OrderDetail detail6 = new OrderDetail(quantity,
							listProduct[5]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail6;
					break;
				case 7:
					OrderDetail detail7 = new OrderDetail(quantity,
							listProduct[6]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail7;
					break;
				case 8:
					OrderDetail detail8 = new OrderDetail(quantity,
							listProduct[7]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail8;
					break;
				case 9:
					OrderDetail detail9 = new OrderDetail(quantity,
							listProduct[8]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail9;
					break;
				case 10:
					OrderDetail detail10 = new OrderDetail(quantity,
							listProduct[9]);
					listOrderDetail = Arrays.copyOf(listOrderDetail,
							listOrderDetail.length + 1);
					listOrderDetail[listOrderDetail.length - 1] = detail10;
					break;
				default:
					break;
				}
			}
		} while (flag == true);
		//input information of customer
		System.out.print("Enter customer ID: ");
		String customerID = input.readLine();

		System.out.print("Enter order date: ");
		String date = input.readLine();
		System.out
				.print("Choose Print/No print order: (true:print false:no print)");
		boolean printOrder = Boolean.parseBoolean(input.readLine());
		System.out.print("Enter status: (1:just order 2:recieved 3:paid)");
		int status = Integer.parseInt(input.readLine());
		System.out.print("Choose type of card: (1:ATM 2:Credit Card)");
		int choose = Integer.parseInt(input.readLine());
		//choose type of card and print invoice
		if (choose == 1) {
			ATMCard card = new ATMCard(12000000);
			Order order = new Order(date, printOrder, status, listOrderDetail,
					card);
			System.out.println("Customer ID: " + customerID);
			System.out.println("Date: " + date);
			System.out
					.println("========================== LIST OF PRODUCT==============================");
			System.out.println(order.toString());
			System.out
					.println("=========================================================================");
			System.out.println("Total price: " + order.calTotalAmount());
		} else if (choose == 2) {
			CreditCard cCard = new CreditCard("20/12/2018", 100000000, "Gold");
			Order order = new Order(date, printOrder, status, listOrderDetail,
					cCard);
			System.out.println("Customer ID: " + customerID);
			System.out.println("Date: " + date);
			System.out
					.println("========================== LIST OF PRODUCT==============================");
			System.out.println(order.toString());
			System.out
					.println("=========================================================================");
			System.out.println("Total price: " + order.calTotalAmount());
		}
	}

}
