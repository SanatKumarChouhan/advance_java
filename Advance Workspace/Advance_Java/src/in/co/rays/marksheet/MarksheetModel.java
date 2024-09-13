package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "insert into student2 values(?,?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getRoll());
		pstmt.setString(2, bean.getName());
		pstmt.setInt(3, bean.getPhy());
		pstmt.setInt(4, bean.getChem());
		pstmt.setInt(5, bean.getMath());
		pstmt.setInt(6, bean.getTotal());

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);
	}

	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "update student2 set roll=?, name=?, phy=?, chem=?, math=?, total=? where roll=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getRoll());
		pstmt.setString(2, bean.getName());
		pstmt.setInt(3, bean.getPhy());
		pstmt.setInt(4, bean.getChem());
		pstmt.setInt(5, bean.getMath());
		pstmt.setInt(6, bean.getTotal());
		pstmt.setInt(7, bean.getRoll());

		int i = pstmt.executeUpdate();

		System.out.println("Data Updated= " + i);
	}

	public void delete(int roll) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "delete from student2 where roll=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, roll);

		int i = pstmt.executeUpdate();

		System.out.println("Data Deleted = " + i);

	}

	public void delete2(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "delete from student2 where roll=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getRoll());

		int i = pstmt.executeUpdate();

		System.out.println("Date Deleted = " + i);
	}

	public void search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from student2";
//		String sql = "select * from student2 where roll=104";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));
		}
	}

}
