package in.co.rays.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource2 {
	
	private static JDBCDataSource2 datasource;

	private ComboPooledDataSource cpds = null;
	
	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.system2");

	private JDBCDataSource2() {

	}

	public static JDBCDataSource2 getInstance() {


		if (datasource == null) {

			

			datasource = new JDBCDataSource2();
			datasource.cpds = new ComboPooledDataSource();

			try {

				datasource.cpds.setDriverClass(rb.getString("driver"));

			} catch (Exception e) {

				System.out.println(e);
				e.printStackTrace();
			}

			datasource.cpds.setJdbcUrl(rb.getString("url"));
			datasource.cpds.setUser(rb.getString("user"));
			datasource.cpds.setPassword(rb.getString("password"));
			datasource.cpds.setInitialPoolSize(Integer.parseInt(rb.getString("initialpoolsize")));
			datasource.cpds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireincrement")));
			datasource.cpds.setMaxPoolSize(Integer.parseInt(rb.getString("maxpoolsize")));

		}
		return datasource;

	}

	public static Connection getConnection() throws Exception {
		return getInstance().cpds.getConnection();

	}

	public static void closeConnection(Connection connection) throws Exception {

		if (connection != null) {

			try {

				connection.close();

			} catch (Exception e) {

			}

		}
	}

	public static void trnsRollBack(Connection connection) throws Exception {

		if (connection != null) {

			try {

				connection.rollback();

			} catch (SQLException ex) {

				throw new Exception(ex.toString());

			}
		}
	}


}
