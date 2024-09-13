package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "insert into student values(111, 'ritik', 457)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted= " + i);
	}

}
