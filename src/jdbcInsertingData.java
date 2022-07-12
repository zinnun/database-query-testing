import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInsertingData {

	public static void main(String[] args) throws SQLException {
		
		//1) create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		//2) create a statement/Query
		Statement stmt = connection.createStatement();
		
		String insertValue = "insert into student9 values(104, 'Carol Dweak')";
		
		//3) Executing the statement
		stmt.execute(insertValue);
		
		//closing the connection
		connection.close();
		System.out.println("Query executed...");		

	}

}
