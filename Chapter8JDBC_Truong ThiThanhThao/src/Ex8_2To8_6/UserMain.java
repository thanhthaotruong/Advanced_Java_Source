package Ex8_2To8_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserMain {
	static UserController userController;
	static CategoryController categoryController;
	static ProductController productController;

	// check login of user
	public static void login() throws IOException {
		userController = new UserController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===============LOGIN===========");
		System.out.println("Please enter username: ");
		String username = input.readLine();
		System.out.println("Please enter password: ");
		String password = input.readLine();
		User user = new User(username, password);

		user = userController.login(username, password);
		if (user == null) {
			System.out.println("Invalid username or password!");
		} else {
			System.out.println("Welcome to our store!");
		}
	}

	// add new user into database
	public static void addNewUser() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===============ADD NEW USER==============");
		System.out.println("Please enter username: ");
		String username = input.readLine();
		System.out.println("Please enter password: ");
		String password = input.readLine();
		System.out.println("Please enter confirm password: ");
		String confirmPassword = input.readLine();

		if (!password.equals(confirmPassword)) {
			System.out.println("Password and confirm password are not same!");
		} else {
			try {
				// add user to database
				User user = new User(username, password);
				userController = new UserController();
				userController.addUser(user);
				System.out.println("New account is created. Now you can use it to login!");
			} catch (Exception ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}
	}

	// show all category in database
	public static void showAllCategory() throws ClassNotFoundException, SQLException {
		categoryController = new CategoryController();
		List<Category> list = new ArrayList<Category>();
		list = categoryController.getAllCategory();
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + " . " + list.get(i).toString());
		}
	}

	// add new product into database
	public static void addProduct() throws IOException, ClassNotFoundException, SQLException {
		productController = new ProductController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("==================ADD PRODUCT=================");
		System.out.println("===LIST CATEGORY===");
		showAllCategory();
		System.out.println("Choose category: ");
		int choose = Integer.parseInt(input.readLine());
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter price: ");
		int price = Integer.parseInt(input.readLine());
		System.out.println("Enter amount: ");
		int amount = Integer.parseInt(input.readLine());
		int categoryId = 0;
		switch (choose) {
		case 1:
			categoryId = 1;
			break;
		case 2:
			categoryId = 2;
			break;
		default:
			break;
		}
		Product p = new Product(name, price, amount, categoryId);
		productController.addProduct(p);
		System.out.println("Add finished!!");
	}

	// search product with the name you input
	public static void searchProduct() throws ClassNotFoundException, SQLException, IOException {
		productController = new ProductController();
		List<Product> list = new ArrayList<Product>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========SEARCH PRODUCT=============");
		System.out.println("Enter name of product: ");
		String name = input.readLine();
		list = productController.searchProduct(name);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ") " + list.get(i).toString());
		}
	}

	// update information of product (price, amount)
	public static void updateProduct() throws IOException, ClassNotFoundException, SQLException {
		productController = new ProductController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("==============LIST PRODUCT=================");
		printAllProduct();
		System.out.println("Enter name of product you want to update: ");
		String name = input.readLine();
		System.out.println("Enter price of product: ");
		int price = Integer.parseInt(input.readLine());
		System.out.println("Enter amount of product: ");
		int amount = Integer.parseInt(input.readLine());
		Product p = new Product(name, price, amount);
		productController.updateProduct(p);
		System.out.println("Update finished!");
	}

	// show all product in database
	public static void printAllProduct() throws ClassNotFoundException, SQLException {
		productController = new ProductController();
		List<Product> list = new ArrayList<Product>();
		list = productController.getAllProduct();
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ") " + list.get(i).toString());
		}
	}

	// delete a product in database
	public static void deleteProduct() throws IOException, ClassNotFoundException, SQLException {
		productController = new ProductController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name = input.readLine();
		Product product = new Product(name);
		productController.deleteProduct(product);
		System.out.println("delete finished!");
	}

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("================WELCOME MY STORE====================");
			System.out.println("\t=================OPTION===============");
			System.out.println(
					"1-Login\n2-Add new user\n3-Show All category\n4-Add new product\n5-Search Product\n6-Update product\n7-Show list product\n8-Delete product");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:
				login();
				break;
			case 2:
				addNewUser();
				break;
			case 3:
				showAllCategory();
				break;
			case 4:
				addProduct();
				break;
			case 5:
				searchProduct();
				break;
			case 6:
				updateProduct();
				break;
			case 7:
				printAllProduct();
				break;
			case 8:
				deleteProduct();
				break;
			default:
				break;
			}
		}
	}

}
