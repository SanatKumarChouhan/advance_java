package in.co.rays.practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {

	private static JDBCDataSource datasource;

	private ComboPooledDataSource cpds = null;

	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.system");

	private JDBCDataSource() {

	}

	public static JDBCDataSource getInstance() {

		if (datasource == null) {

			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();

			try {

				datasource.cpds.setDriverClass("com.mysql.cj.jdbc.Driver");

			} catch (Exception e) {

				System.out.println(e);
				e.printStackTrace();
			}

			datasource.cpds.setJdbcUrl("jdbc:mysql://localhost:3306/advance");
			datasource.cpds.setUser("root");
			datasource.cpds.setPassword("root");
			datasource.cpds.setInitialPoolSize(5);
			datasource.cpds.setAcquireIncrement(5);
			datasource.cpds.setMaxPoolSize(30);

		}
		return datasource;

	}

	public static Connection getConnection() throws Exception {
		return getInstance().cpds.getConnection();

	}

	public void closeConnection(Connection connection) throws Exception {

		try {

			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void trnsRollBack(Connection connection) throws Exception {

		try {
			connection.rollback();
		} catch (SQLException ex) {
			throw new Exception(ex.toString());
		}
	}

}
