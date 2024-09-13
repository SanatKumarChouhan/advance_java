package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUpdate {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
//		String sql = "update student set roll=107 where roll = 111";
		
		String sql = "update student set name = 'abhi' where name = 'abhishek'";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		int i = pstmt.executeUpdate();
		
		System.out.println("Data Updated = " + i);
		
	}

}
