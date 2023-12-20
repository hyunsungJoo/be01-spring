package edu.encore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MsSqlUserDAOImpl extends UserDAO {

	@Override
	public Connection getConnection() throws Exception {
		// mssql 관련 디비 연결
		// 1. Driver load..... exception
		Class.forName("oracle.org.OracleDriver");

		// 2. Connection & Open
		// driver://IP:portNumber/DBName
		String url = "jdbc:oracle:thin:@localhost:port:orcl";
		String uid = "root";
		String pwd = "oracle";

		Connection conn = DriverManager.getConnection(url, uid, pwd);

		return conn;
	}

}
