package in.co.rays.storeprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class testSearch {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		CallableStatement clb = conn.prepareCall("{CALL search(?)}");
		
		clb.setInt(1,7);
		
		clb.execute();
		
		ResultSet rs = clb.getResultSet();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		

	}

}
