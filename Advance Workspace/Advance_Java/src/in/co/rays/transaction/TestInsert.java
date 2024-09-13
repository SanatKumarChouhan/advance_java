package in.co.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	
	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

			Statement stmt = conn.createStatement();

			conn.setAutoCommit(false);

//			String sql = "insert into student values(108, 'vinit kumar', 443)";

//			int i = stmt.executeUpdate(sql);
			int i = stmt.executeUpdate("insert into student values(114, 'anwar', 446)");
			i = stmt.executeUpdate("insert into student values(115, 'priyal', 447)");
			i = stmt.executeUpdate("insert into student values(115, 'mohan', 448)");

			conn.commit();
			conn.close();

			System.out.println("data inserted= " + i);

		} catch (Exception e) {
			// TODO: handle exception

			conn.rollback();
			System.out.println("Exception= " + e.getMessage());

		}
	}


}
