package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUser {

	public static void main(String[] args) throws Exception {

//		testAdd();
		testSearch();
//		testSearch2();
//		testMaxId();
//		testUpdate();
//		testDelete();

	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean bean = new UserBean();

//		bean.setId(5);
		bean.setFirstName("supriya");
		bean.setLastName("garhawal");
		bean.setLoginId("supriya@gamil.com");
		bean.setPassword("78910");
//		bean.setDob(new Date());
		bean.setDob(sdf.parse("07/01/2024"));
		bean.setAddress("H.N.17 clerk colony, Indore (M.P.)");

		UserModel model = new UserModel();

		model.add(bean);
	}

	public static void testSearch() throws Exception {

		UserModel model = new UserModel();

		model.search();
	}

	public static void testMaxId() throws Exception {

		UserModel model = new UserModel();

		model.maxId();
	}

	public static void testSearch2() throws Exception {

		UserModel model = new UserModel();

		model.search2();
	}

	public static void testUpdate() throws Exception {

		UserModel model = new UserModel();

		model.update(0);
	}

	public static void testDelete() throws Exception {


		UserModel model = new UserModel();

		model.delete(0);
	}

}
