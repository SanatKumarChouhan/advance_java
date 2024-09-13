package in.co.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCDataSource {

	public static void main(String[] args) throws Exception {

//		for (int i = 1; i <= 50; i++) {
//
//			System.out.println("Connection= " + i);
//
//		}

		testGet();

	}

	public static void testGet() throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		String sql = "select * from student where roll=101";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getString(4));
//			System.out.println(rs.getString(5));
//			System.out.println(rs.getDate(6));
//			System.out.println(rs.getString(7));

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}

//		conn.close();

	}

}
