package in.co.rays.user2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UuserModel {

	public void add(UuserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "insert into user values(?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getNaam());
		pstmt.setString(3, bean.getUpnaam());
		pstmt.setString(4, bean.getLgid());
		pstmt.setString(5, bean.getPass());
		pstmt.setDate(6, new java.sql.Date(bean.getDin().getTime()));
		pstmt.setString(7, bean.getPata());

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted= " + i);

	}

	public void update(UuserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "update user set id=?, first_name=?, login_id=?, password=?, dob=?, address=? where id=? ";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getNaam());
//		pstmt.setString(2, bean.getUpnaam());
		pstmt.setString(3, bean.getLgid());
		pstmt.setString(4, bean.getPass());
		pstmt.setDate(5, new java.sql.Date(bean.getDin().getTime()));
		pstmt.setString(6, bean.getPata());
		pstmt.setInt(7, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data updated= " + i);

	}

}
