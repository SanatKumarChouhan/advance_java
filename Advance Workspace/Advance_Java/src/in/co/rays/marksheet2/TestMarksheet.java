package in.co.rays.marksheet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		testFindByPk();
		
//		testSearch();

	}

	public static void testFindByPk() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByPk(5);

		if (bean != null) {

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRoll());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhy());
			System.out.print("\t" + bean.getChem());
			System.out.println("\t" + bean.getMath());

		} else {

			System.out.println("data not found");
		}

	}

	public static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = (MarksheetBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRoll());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhy());
			System.out.print("\t" + bean.getChem());
			System.out.println("\t" + bean.getMath());
		}

	}

}
