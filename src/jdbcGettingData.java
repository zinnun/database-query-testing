import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcGettingData {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
		
		Statement stmt= connection.createStatement();
		
		String selectQuery = "select first_name, last_name, department_id from employees";
		
		//Executing the statement
		//stmt.execute(selectQuery);
		
		//3) Executing the statement & storing result
		ResultSet result = stmt.executeQuery(selectQuery);
		
		while(result.next())
		{
			
			String fname = result.getString("first_name");
			String lname = result.getString("last_name");
			int did = result.getInt("department_id");
			
			System.out.println(did+"  "+fname+"  "+ lname);
		}
		
		
		//closing the connection
		connection.close();
		System.out.println("Query Executed!");
		

	}
}
