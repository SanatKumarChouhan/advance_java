package in.co.rays.practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser4 {

	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
//		testDeleted();
//		testSearch();
//		testSearch2();
//		testFindByPk();
//		testMaxId();
		testAddPk();

	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean4 bean = new UserBean4();

		bean.setId(2);
		bean.setFirstname("gulshan");
		bean.setLastname("laharpure");
		bean.setLoginid("gulshan@gmail.com");
		bean.setPassword("5374");
//		bean.setDob(new Date());
		bean.setDob(sdf.parse("12/03/2022"));
		bean.setAddress("15/9 pardesipura, indore mp");

		UserModel4 model = new UserModel4();

		model.addPk(bean);

	}

	public static void testUpdate() throws Exception {

		UserBean4 bean = new UserBean4();

		bean.setFirstname("sonika");
		bean.setLastname("prajapati");
		bean.setLoginid("sonika@gmail.com");
		bean.setDob(new Date());
		bean.setId(2);

		UserModel4 model = new UserModel4();

		model.update(bean);
	}

	public static void testDeleted() throws Exception {

//		UserBean4 bean=new UserBean4();
//		
//		bean.setId(2);

		UserModel4 model = new UserModel4();

		model.delete(0);
	}

	public static void testSearch() throws Exception {

		UserModel4 model = new UserModel4();

		model.search();
	}

	public static void testSearch2() throws Exception {

		UserModel4 model = new UserModel4();

		List list = model.search2();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			UserBean4 bean = (UserBean4) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstname());
			System.out.print("\t" + bean.getLastname());
			System.out.print("\t" + bean.getLoginid());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
		}
	}

	public static void testFindByPk() throws Exception {

		UserModel4 model = new UserModel4();

		UserBean4 bean = model.findByPk(4);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstname());
		System.out.println(bean.getLastname());
		System.out.println(bean.getLoginid());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
	}

	public static void testMaxId() throws Exception {

		UserModel4 model = new UserModel4();

		model.maxId();
	}

	public static void testAddPk() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean4 bean = new UserBean4();

//		bean.setId(2);
		bean.setFirstname("shkkkghneha");
		bean.setLastname("kakkar");
		bean.setLoginid("neha@gmail.com");
		bean.setPassword("5374");
//		bean.setDob(new Date());
		bean.setDob(sdf.parse("11/04/2021"));
		bean.setAddress("101 pardesipura, indore mp");

		UserModel4 model = new UserModel4();

		model.addPk(bean);

	}

}
