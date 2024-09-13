package in.co.rays.marksheet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {

	public MarksheetBean findByPk(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from student3 where id = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, id);

		ResultSet rs = pstmt.executeQuery();

		MarksheetBean bean = null;

		while (rs.next()) {

		    bean = new MarksheetBean();

			bean.setId(rs.getInt(1));
			bean.setRoll(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhy(rs.getInt(4));
			bean.setChem(rs.getInt(5));
			bean.setMath(rs.getInt(6));

		}

		return bean;
	}

	public List search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from student3";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();
		
//		MarksheetBean bean = new MarksheetBean();

		while (rs.next()) {

			MarksheetBean bean = new MarksheetBean();

			bean.setId(rs.getInt(1));
			bean.setRoll(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhy(rs.getInt(4));
			bean.setChem(rs.getInt(5));
			bean.setMath(rs.getInt(6));

			list.add(bean);

		}

		return list;

	}
}
