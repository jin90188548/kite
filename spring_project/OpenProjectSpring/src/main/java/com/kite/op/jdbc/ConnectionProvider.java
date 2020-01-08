package com.kite.op.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConnection() throws SQLException {
				
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String user = "scott";
		String pw = "tiger";
		
		Connection conn = null;
		
		conn = DriverManager.getConnection(url, user, pw);
		
		return conn;
		
	}

}
