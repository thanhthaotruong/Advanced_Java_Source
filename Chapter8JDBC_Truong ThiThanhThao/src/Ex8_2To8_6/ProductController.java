package Ex8_2To8_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class ProductController {
	DatabaseConnection db = new DatabaseConnection();
	/*
	 * add new product
	 * input: product
	 */
	public void addProduct(Product product) throws ClassNotFoundException, SQLException{
		try (Connection connection = db.connect()){
			String sql = "INSERT INTO product(name,price,amount,categoryid) VALUES (?,?,?,?);";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setString(1, product.getName());
			pStatement.setInt(2, product.getPrice());
			pStatement.setInt(3, product.getAmount());
			pStatement.setInt(4, product.getCategoryId());
			pStatement.executeUpdate();
		}
	}
	/*
	 * seach product has name =?
	 * input : name
	 * output : list
	 */
	public List<Product> searchProduct(String name) throws SQLException, ClassNotFoundException{
		List<Product> list;
		try (Connection connection = db.connect()){
			list = new ArrayList<Product>();
			Statement statement = (Statement) connection.createStatement();
			String sql = "SELECT * FROM product WHERE name like'%"+name+"%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()){
				Product p = new Product();
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getInt("price"));
				p.setAmount(resultSet.getInt("amount"));
				p.setCategoryId(resultSet.getInt("categoryid"));
				list.add(p);
			}
		}
		return list;
	}
	/*
	 * update a product with information price=?, amount=?
	 * input :  name of product
	 */
	public void updateProduct(Product product) throws ClassNotFoundException, SQLException{
		try (Connection connection = db.connect()){
			String sql = "UPDATE product SET price = ?,amount = ? WHERE name like ?";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			pStatement.setInt(1, product.getPrice());
			pStatement.setInt(2, product.getAmount());
			pStatement.setString(3, product.getName());
			pStatement.executeUpdate();
		}
	}
	/*
	 * get all product in database
	 */
	public List<Product> getAllProduct() throws ClassNotFoundException, SQLException{
		List<Product> list;
		try(Connection connection = db.connect()){
			list = new ArrayList<>();
			Statement statement = (Statement) connection.createStatement();
			String sql = "SELECT * FROM product";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()){
				Product p = new Product();
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getInt("price"));
				p.setAmount(resultSet.getInt("amount"));
				list.add(p);
			}
		}
		return list;
	}
	/*
	 * delete a product with name=?
	 * input : product
	 */
	public void deleteProduct(Product product) throws SQLException, ClassNotFoundException{
		try(Connection connection = db.connect()){
			String sql = "DELETE FROM product WHERE name like ?";
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(sql);
			pStatement.setString(1, product.getName());
			pStatement.execute();
		}
	}
}
