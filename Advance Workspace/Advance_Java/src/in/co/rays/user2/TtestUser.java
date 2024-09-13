package in.co.rays.user2;

import java.util.Date;

public class TtestUser {

	public static void main(String[] args) throws Exception {

//		testAdd();
		testUpdated();

	}

	public static void testAdd() throws Exception {

		UuserBean bean = new UuserBean();

		bean.setId(7);
		bean.setNaam("amol");
		bean.setUpnaam("chouhan");
		bean.setLgid("anmol@gmail.com");
		bean.setPass("123");
		bean.setDin(new Date());
		bean.setPata("H.N.11 pardesipura, indore, m.p.");

		UuserModel model = new UuserModel();

		model.add(bean);
	}

	public static void testUpdated() throws Exception {

		UuserBean bean = new UuserBean();

		bean.setId(10);
		bean.setNaam("shubham");
//		bean.setUpnaam("chouhan");
		bean.setLgid("shubham@gmail.com");
		bean.setPass("4536");
		bean.setDin(new Date());
		bean.setPata("H.N.165 pardesipura, indore, m.p.");
		bean.setId(16);

		UuserModel model = new UuserModel();

		model.update(bean);

	}

}
