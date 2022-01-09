package devdojo.maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/anime_store?useSSL=false";
		String user = "root";
		String password = "admin";
	
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	} 
}
