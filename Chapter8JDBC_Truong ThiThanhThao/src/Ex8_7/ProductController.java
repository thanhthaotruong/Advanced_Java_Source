package Ex8_7;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.PreparedStatement;

import Ex8_7.DatabaseConnection;
import Ex8_7.Product;

public class ProductController {
	DatabaseConnection db = new DatabaseConnection();
	Connection connection;
	public void transaction1() throws ClassNotFoundException, SQLException, IOException{
		Product product;
		try {
			connection = db.connect();
			connection.setAutoCommit(false);
			//input information about product
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("==================ADD PRODUCT=================");
			System.out.println("Enter name: ");
			String name = input.readLine();
			System.out.println("Enter price: ");
			double price = Double.parseDouble(input.readLine());
			System.out.println("Enter amount: ");
			int amount = Integer.parseInt(input.readLine());
			System.out.println("Enter image: ");
			String image = input.readLine();
			System.out.println("Enter catogoryId: ");
			int categoryId = Integer.parseInt(input.readLine());
			product = new Product(name, price, amount, image, categoryId);
			//addProduct
			Date today=new Date(System.currentTimeMillis());
			SimpleDateFormat timeFormat= new SimpleDateFormat("yyyy-MM-dd");
			String s=timeFormat.format(today.getTime());
			String sql = "INSERT INTO product(name,price,amount,image,categoryId,createDate,onSell) VALUES (?,?,?,?,?,?,?);";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setString(1, product.getName());
			pStatement.setDouble(2, product.getPrice());
			pStatement.setInt(3, product.getAmount());
			pStatement.setString(4, product.getImage());
			pStatement.setInt(5, product.getCategoryId());
			pStatement.setString(6, s);
			pStatement.setInt(7, 1);
			pStatement.executeUpdate();
			//insert information of product
			System.out.println("================UPDATE PRODUCT==================");
			System.out.println("Please enter id of product you want to update: ");
			int id = Integer.parseInt(input.readLine());
			System.out.println("Enter price: ");
			price = Double.parseDouble(input.readLine());
			System.out.println("Enter amount: ");
			amount = Integer.parseInt(input.readLine());
			product = new Product(id, price, amount);
			//update product
			sql = "UPDATE product SET price=?,amount=? WHERE id=?";
			pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setDouble(1, product.getPrice());
			pStatement.setInt(2, product.getAmount());
			pStatement.setInt(3, product.getId());
			pStatement.executeUpdate();
			//insert id of product you want to delete
			System.out.println("===============DELETE PRODUCT================");
			System.out.println("Enter id of product: ");
			id = Integer.parseInt(input.readLine());
			product = new Product(id);
			//delete product
			sql = "DELETE FROM product WHERE id=?";
			pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setInt(1, product.getId());
			pStatement.executeUpdate();
			connection.commit();
		}catch(SQLException ex){
			connection.rollback();
		}
	}
	public void transaction3() throws ClassNotFoundException, SQLException, IOException{
		Product product;
		try {
			connection = db.connect();
			connection.setAutoCommit(false);
			//input information about product
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("==================ADD PRODUCT=================");
			System.out.println("Enter name: ");
			String name = input.readLine();
			System.out.println("Enter price: ");
			double price = Double.parseDouble(input.readLine());
			System.out.println("Enter amount: ");
			int amount = Integer.parseInt(input.readLine());
			System.out.println("Enter image: ");
			String image = input.readLine();
			System.out.println("Enter catogoryId: ");
			int categoryId = Integer.parseInt(input.readLine());
			product = new Product(name, price, amount, image, categoryId);
			//addProduct
			Date today=new Date(System.currentTimeMillis());
			SimpleDateFormat timeFormat= new SimpleDateFormat("yyyy-MM-dd");
			String s=timeFormat.format(today.getTime());
			String sql = "INSERT INTO product(name,price,amount,image,categoryId,createDate,onSell) VALUES (?,?,?,?,?,?,?);";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setString(1, product.getName());
			pStatement.setDouble(2, product.getPrice());
			pStatement.setInt(3, product.getAmount());
			pStatement.setString(4, product.getImage());
			pStatement.setInt(5, product.getCategoryId());
			pStatement.setString(6, s);
			pStatement.setInt(7, 0);
			pStatement.executeUpdate();
			//insert information of product
			System.out.println("================UPDATE PRODUCT==================");
			System.out.println("Please enter id of product you want to update: ");
			int id = Integer.parseInt(input.readLine());
			System.out.println("Enter price: ");
			price = Double.parseDouble(input.readLine());
			System.out.println("Enter amount: ");
			amount = Integer.parseInt(input.readLine());
			product = new Product(id, price, amount);
			//update product
			sql = "UPDATE product SET price=?,amount=? WHERE id=?";
			pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setDouble(1, product.getPrice());
			pStatement.setInt(2, product.getAmount());
			pStatement.setInt(3, product.getId());
			pStatement.executeUpdate();
			//insert id of product you want to delete
			System.out.println("===============DELETE PRODUCT================");
			System.out.println("Enter id of product: ");
			id = Integer.parseInt(input.readLine());
			product = new Product(id);
			//delete product
			sql = "DELETE FROM product WHERE id=?";
			pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setInt(1, product.getId());
			pStatement.executeUpdate();
			connection.commit();
		}catch(SQLException ex){
			connection.rollback();
		}
	}
	public void transaction2() throws ClassNotFoundException, SQLException, IOException{
		Product product;
		try {
			connection = db.connect();
			connection.setAutoCommit(false);
			//input information about product
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("==================ADD PRODUCT=================");
			System.out.println("Enter name: ");
			String name = input.readLine();
			if (name.length()>150){
			System.out.println("Enter price: ");
			double price = Double.parseDouble(input.readLine());
			System.out.println("Enter amount: ");
			int amount = Integer.parseInt(input.readLine());
			System.out.println("Enter image: ");
			String image = input.readLine();
			System.out.println("Enter catogoryId: ");
			int categoryId = Integer.parseInt(input.readLine());
			product = new Product(name, price, amount, image, categoryId);
			//addProduct
			Date today=new Date(System.currentTimeMillis());
			SimpleDateFormat timeFormat= new SimpleDateFormat("yyyy-MM-dd");
			String s=timeFormat.format(today.getTime());
			String sql = "INSERT INTO product(name,price,amount,image,categoryId,createDate,onSell) VALUES (?,?,?,?,?,?,?);";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setString(1, product.getName());
			pStatement.setDouble(2, product.getPrice());
			pStatement.setInt(3, product.getAmount());
			pStatement.setString(4, product.getImage());
			pStatement.setInt(5, product.getCategoryId());
			pStatement.setString(6, s);
			pStatement.setInt(7, 0);
			pStatement.executeUpdate();
			}
		}catch(SQLException ex){
			connection.rollback();
		}
	}
	
}
