package in.co.rays.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		String sql = "update student set roll= 108 where roll=107";
		
		int i = stmt.executeUpdate(sql);
		
		System.out.println(i);
		
	}

}
