package in.co.rays.user3;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUser3 {

	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
//		testDelete();

//		testSearch();
//		testMaxId();
//		testSearch2();
		testFindByPk();

	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean3 bean = new UserBean3();

//		bean.setId(4);
		bean.setFirstName("harsha");
		bean.setLastName("kahar");
		bean.setLoginId("harsha@gmail.com");
		bean.setPassword("810151");
//		bean.setDob(new Date());
		bean.setDob(sdf.parse("11/02/2024"));
		bean.setAddress("H.N.111 pardesipura, indore, m.p.");

		UserModel3 model = new UserModel3();

		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean3 bean = new UserBean3();

//		bean.setId(11);
//		bean.setFirstName("amol");
//		bean.setLastName("more");
//		bean.setLoginId("sanjeev@gmail.com");
//		bean.setPassword("54637");
//		bean.setDob(new Date());
		bean.setDob(sdf.parse("01/02/2024"));
		bean.setAddress("H.N.104 pardesipura, indore, m.p.");
		bean.setId(1);

		UserModel3 model = new UserModel3();

		model.update(bean);
	}

	public static void testDelete() throws Exception {

		UserModel3 model = new UserModel3();

		model.delete();
	}

	public static void testSearch() throws Exception {

		UserModel3 model = new UserModel3();

		model.search();
	}

	public static void testMaxId() throws Exception {

		UserModel3 model = new UserModel3();

		model.maxId(7);
	}

	public static void testSearch2() throws Exception {

		UserModel3 model = new UserModel3();

		List list = model.search2();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			UserBean3 bean = (UserBean3) it.next();

			System.out.print("\t\t" + bean.getId());
			System.out.print("\t\t" + bean.getFirstName());
			System.out.print("\t\t" + bean.getLastName());
			System.out.print("\t\t" + bean.getLoginId());
			System.out.print("\t\t" + bean.getPassword());
			System.out.print("\t\t" + bean.getDob());
			System.out.println("\t\t" + bean.getAddress());
		}
	}

	public static void testFindByPk() throws Exception {

		UserModel3 model = new UserModel3();

		UserBean3 bean = model.findByPk(5);

		System.out.println("\t" + bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
	}

	public static void testSearch3() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		UserBean3 bean = new UserBean3();
		// bean.setFirstName("pqr");
		bean.setDob(sdf.parse("13-04-2024"));

		UserModel3 model = new UserModel3();

		List list = model.search3(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean3) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		}

	}

}
