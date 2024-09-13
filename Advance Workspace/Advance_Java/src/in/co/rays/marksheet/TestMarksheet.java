package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
//		testDelete();
		
//		testDelete2();
		
		testSearch();
		
		
		

	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRoll(103);
		bean.setName("shubhi");
		bean.setPhy(35);
		bean.setChem(25);
		bean.setMath(30);
		bean.setTotal(90);

		MarksheetModel model = new MarksheetModel();

		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRoll(104);
		bean.setName("anmol");
		bean.setPhy(56);
		bean.setChem(45);
		bean.setMath(74);
		bean.setTotal(175);
		bean.setRoll(103);

		MarksheetModel model = new MarksheetModel();

		model.update(bean);
	}
	
	public static void testDelete() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		model.delete(103);
	}
	
	public static void testDelete2() throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		
		bean.setRoll(103);
		
		MarksheetModel model=new MarksheetModel();
		
		model.delete2(bean);
	}
	
	public static void testSearch() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		model.search();
	}

}
