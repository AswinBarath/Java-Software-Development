import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			// Establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "password");

			// Create a statement object to send to the database
			Statement statement = conn.createStatement();

			// Execute the statement object
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

			// Process the result
			System.out.print("name--");
			System.out.print("dept--");
			System.out.print("salary ");
			while (resultSet.next()) {
				System.out.println();
				System.out.print(resultSet.getString("name"));
				System.out.print("--");
				System.out.print(resultSet.getString("dept"));
				System.out.print("--");
				System.out.print(resultSet.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
