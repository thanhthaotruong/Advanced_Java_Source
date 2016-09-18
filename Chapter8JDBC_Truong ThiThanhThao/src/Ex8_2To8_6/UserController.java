package Ex8_2To8_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class UserController {
	DatabaseConnection db = new DatabaseConnection();
	/*
	 * check login of user
	 * input : username, password
	 * output: user
	 */
	public User login(String username, String password) {
		User user = null;

		try (Connection connection = db.connect()) {
			Statement statement = (Statement) connection.createStatement();
			String sql = "SELECT * FROM user WHERE username like '" + username
					+ "' and password like '" + password + "'";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				break;
			}
			connection.close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return user;
	}
	
	/*
	 * add a new user into sql
	 * input : user
	 */
	public void addUser(User user){
		try (Connection connection = db.connect()) {
			String sql = "INSERT INTO user VALUES(NULL,'"+user.getUsername()+"','"+user.getPassword()+"')";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.execute();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
