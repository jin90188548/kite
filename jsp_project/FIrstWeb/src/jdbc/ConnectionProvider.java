package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() {
		// 2. Connection 객체 생성
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

}
