package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicPSTMT_2 {

	public static void main(String[] args) throws Exception {

//		testAdd();
		
		testAdd(102, "ankit", 45, 34, 34, 113);

	}

	public static void testAdd() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "insert into student2 values(?,?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, 101);
		pstmt.setString(2, "anwar");
		pstmt.setInt(3, 19);
		pstmt.setInt(4, 25);
		pstmt.setInt(5, 53);
		pstmt.setInt(6, 97);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);

	}

	public static void testAdd(int roll, String name, int phy, int chem, int math, int total) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "insert into student2 values(?,?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, roll);
		pstmt.setString(2, name);
		pstmt.setInt(3, phy);
		pstmt.setInt(4, chem);
		pstmt.setInt(5, math);
		pstmt.setInt(6, total);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted" + i);
	}

}
