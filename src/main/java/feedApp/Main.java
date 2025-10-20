package feedApp;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		FeedAppClass jdbc = new FeedAppClass();
		Connection conn = jdbc.createConnection();
//		jdbc.getAllUsers(conn);
//		jdbc.deleteUser(conn, 5);
		jdbc.updateUser(conn, 2, "kong");
		jdbc.closeConnection(conn);
	}
}
