package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.util.JDBCDataSource;

public class UserModel {

	public void add(UserBean bean) throws Exception {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Connection conn = JDBCDataSource.getConnection();

		String sql = "insert into user2 values(?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getFirstname());
		pstmt.setString(3, bean.getLastname());
		pstmt.setString(4, bean.getLoginid());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setString(7, bean.getAddress());

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted= " + i);
	}

	public void update(UserBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "update user2 set first_name=rahul, last_name=pal, login_id=?, dob=? where id=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, bean.getFirstname());
		pstmt.setString(2, bean.getLastname());
		pstmt.setString(3, bean.getLoginid());
		pstmt.setDate(4, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setInt(5, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data Updated= " + i);

	}

	public void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "delete from user where id=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, id);

		int i = pstmt.executeUpdate();

		System.out.println("Data Deleted= " + i);

	}

	public void search() throws Exception {

//		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from user";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getDate(6));
			System.out.println("\t" + rs.getString(7));
		}

	}

	public List search2() throws Exception {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Connection conn = JDBCDataSource.getConnection();

		String sql = "select * from user";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {

			UserBean bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setLoginid(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));

			list.add(bean);
		}
		return list;

	}

	public List search3(UserBean bean, int pageNo, int pageSize) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		StringBuffer sql = new StringBuffer("select * from user where 1=1");

		if (bean != null) {

			if (bean.getFirstname() != null && bean.getFirstname().length() > 0) {
				sql.append(" and first_name like '" + bean.getFirstname() + "%'");
			}

			if (bean.getDob() != null && bean.getDob().getTime() > 0) {
				sql.append(" and dob like '" + new java.sql.Date(bean.getDob().getTime()) + "%'");
			}

		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + ", " + pageSize);
		}

		System.out.println("sql => " + sql);

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setLoginid(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
			list.add(bean);
		}
		return list;
	}

	public UserBean findByPk(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from user where id=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, id);

		ResultSet rs = pstmt.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setLoginid(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));

		}
		return bean;

	}

	public void maxId() throws Exception {

//		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		String sql = "select * from user where id=(select max(id) from user)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getDate(6));
			System.out.println("\t" + rs.getString(7));
		}

	}

	public int nextPk() throws Exception {

		int pk = 0;

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Connection conn = JDBCDataSource.getConnection();

		String sql = "select max(id) from user";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);
		}
		return pk + 1;

	}

	public void addPk(UserBean bean) throws Exception {

		int pk = nextPk();

//		Class.forName("com.mysql.cj.jdbc.Driver");

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		Connection conn = JDBCDataSource.getConnection();

		String sql = "insert into user values(?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

//		pstmt.setInt(1, bean.getId());
		pstmt.setInt(1, pk);
		pstmt.setString(2, bean.getFirstname());
		pstmt.setString(3, bean.getLastname());
		pstmt.setString(4, bean.getLoginid());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setString(7, bean.getAddress());

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted= " + i);

	}

	public UserBean authenticate(String loginid, String password) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		String sql = "select * from user where login_id=? and password=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, loginid);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setLoginid(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));

		}

		return bean;

	}

	public void update2(UserBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();
		String sql = "update user set first_name=?, last_name=?, login_id=?, password=?, dob=?, address=? where id=? ";

		PreparedStatement pstmt = conn.prepareStatement(sql);

//		pstmt.setInt(1, bean.getId());
		pstmt.setString(1, bean.getFirstname());
		pstmt.setString(2, bean.getLastname());
		pstmt.setString(3, bean.getLoginid());
		pstmt.setString(4, bean.getPassword());
		pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
//		pstmt.setString(7, bean.getFirstname());
		pstmt.setString(6, bean.getAddress());
		pstmt.setInt(7, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data Updated= " + i);

	}

}
