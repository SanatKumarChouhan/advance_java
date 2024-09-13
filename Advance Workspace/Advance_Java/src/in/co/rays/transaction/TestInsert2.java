package in.co.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert2 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Statement stmt = conn.createStatement();

//		String sql="";

		int i = stmt.executeUpdate("insert into student values(117, 'shanti', 434)");
		i = stmt.executeUpdate("insert into student values(118, 'shanti', 434)");
		i = stmt.executeUpdate("insert into student values(118, 'shanti', 434)");

		System.out.println("data inserted" + i);

	}

}
