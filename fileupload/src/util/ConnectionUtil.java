package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";

		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}