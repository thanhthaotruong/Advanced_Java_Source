package Ex8_2To8_6;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String JDBC_URL = "jdbc:mysql://127.0.0.1/MyStore?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "thao0901";
	
	//establish connection
	public Connection connect() throws SQLException, ClassNotFoundException{
		Class.forName(JDBC_DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
		return connection;
	}
}
