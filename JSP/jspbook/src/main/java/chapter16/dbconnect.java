package chapter16;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	public static Connection DBconn() throws Exception {
		Connection conn= null;
		String url="jdbc:mysql://localhost:3306/jspbookdb";
		String user="root";
		String password = "1234";
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,user,password);
		System.out.println("데이터베이스 연결이 성공했습니다");
		return conn;
	}
}
