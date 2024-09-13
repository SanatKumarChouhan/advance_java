package in.co.rays.model;

import in.co.rays.bean.UserBean;

public class TestUser {

	public static void main(String[] args) throws Exception {

		testAuthenticate();
	}

	public static void testAuthenticate() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.authenticate("nitesh@gmail.com", "nitesh1234");

		System.out.println(bean.getId());
		System.out.println(bean.getFirstname());
		System.out.println(bean.getLastname());
		System.out.println(bean.getLoginid());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
	}

}
