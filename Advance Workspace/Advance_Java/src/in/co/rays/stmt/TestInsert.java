package in.co.rays.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Statement stmt = conn.createStatement();

		String sql = "insert into student values(108, 'mithun kumar', 435)";

		int i = stmt.executeUpdate(sql);

		System.out.println("Data Insertec= " + i);

	}

}
