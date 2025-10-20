package feedApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedAppClass {
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";
	
	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager
					.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName, password);

		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return conn;
	}
	
	// Here, we define a function that will make use of the connection we've created above:
	public void getAllUsers(Connection conn) {
		try {
			Statement stmt = null;
			stmt = conn.createStatement();
			// This line creates our SQL statement to select all entries from the User table:
            String sql = "SELECT * FROM \"User\"";
            
         // This line executes the query in the line above, setting its results to a ResultSet object called rs:
            ResultSet rs = stmt.executeQuery(sql);
            
         // While there is data in the returned result set, we will print that line to the console:
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("First Name: " + rs.getString("firstName"));
                System.out.print(", Last Name: " + rs.getString("lastName"));
                System.out.print(", UserName: " + rs.getString("username"));
                System.out.print(", User Phone: " + rs.getString("phone"));
                System.out.println(", User email: " + rs.getString("emailId"));
                System.out.println(", Email verified: " + rs.getBoolean("emailVerified"));
            }
            stmt.close();
		} catch (SQLException ex) {
            System.out.println("Exception:" + ex.getMessage());
        }
	}
	
	// The addUser method allows you to insert a new user record into the "feedApp" table by providing the required parameters: courseId, studentName, studentEmail, and studentPhone.
	// The SQL query is parameterized to prevent SQL injection attacks, and the method gracefully handles any database-related exceptions that may occur during the execution.

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified) {
		try {
			PreparedStatement stmt = null;
			// Here's our parameterized query:
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			stmt = conn.prepareStatement(sql);
			// Retrieve by column name
			stmt.setString(1, firstName); 
			stmt.setString(2, lastName); 
			stmt.setString(3, username); 
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);
			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
			stmt.close();
		} catch (SQLException ex) {
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
            }
	}
	
	public void deleteUser(Connection conn, int userId) {
		try {
			PreparedStatement stmt = null;
			// Here's our parameterized query:
			String sql = " DELETE FROM \"User\" WHERE \"userId\" = ?";
			stmt = conn.prepareStatement(sql);
			// Retrieve by column name
			stmt.setInt(1, userId); 
			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) removed");
			stmt.close();
		} catch (SQLException ex) {
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
            }
	}
	
	public void updateUser(Connection conn, int userId, String firstName) {
		try {
			PreparedStatement stmt = null;
			// Here's our parameterized query:
			String sql = " UPDATE \"User\" SET \"firstName\" = ?";
			stmt = conn.prepareStatement(sql);
			// Retrieve by column name
			stmt.setString(1, firstName); 
			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) updated");
			stmt.close();
		} catch (SQLException ex) {
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
            }
	}
	
	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException ex) {
	        flag = false;
	        // handle exception
	        System.out.println("Exception:" + ex.getMessage());
	        }
		return flag;
	}
}
