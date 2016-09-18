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

import com.mysql.jdbc.Statement;



public class CategoryController {
	DatabaseConnection db = new DatabaseConnection();
	//show all category in database
	public List<Category> getAllCategory() throws ClassNotFoundException, SQLException{
		List<Category> list;
		try(Connection connection = db.connect()){
			list = new ArrayList<>();
			Statement statement = (Statement) connection.createStatement();
			String sql = "SELECT * FROM category";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()){
				Category category = new Category();
				category.setName(resultSet.getString("name"));
				category.setDescription(resultSet.getString("description"));
				list.add(category);
			}
		}
		return list;
	}
}
