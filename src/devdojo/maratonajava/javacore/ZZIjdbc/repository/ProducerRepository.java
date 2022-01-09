package devdojo.maratonajava.javacore.ZZIjdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;

public class ProducerRepository {
	public static void save(Producer producer) {
		String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');", producer.getName());
		
		try(Connection conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement()){
			stmt.executeUpdate(sql);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
