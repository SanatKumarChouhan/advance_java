package in.co.rays.marksheet3;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		testSearch();
//		testMaxId();
//		testAdd();

//		testDelete();

	}

	public static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(1);
		bean.setRoll(101);
		bean.setName("s");

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean, 1, 5);
//		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRoll());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhy());
			System.out.print("\t" + bean.getChem());
			System.out.println("\t" + bean.getMath());

		}

	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

//		bean.setId(id);
		bean.setRoll(111);
		bean.setName("anwar");
		bean.setPhy(56);
		bean.setChem(74);
		bean.setMath(66);

		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}

	public static void testMaxId() throws Exception {

		MarksheetModel model = new MarksheetModel();

		model.maxId();
	}

	public static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();

		model.delete(0);

	}

}
