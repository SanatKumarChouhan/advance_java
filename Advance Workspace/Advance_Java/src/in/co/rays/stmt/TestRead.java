package in.co.rays.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRead {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
//		String sql = "select * from student where marks = (select max(marks) from student where marks < (select max(marks) from student))";
		
		String sql = "select * from student";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getInt(3));
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getInt(3));
		}
		
	}

}
