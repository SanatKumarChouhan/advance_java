package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect("UserRegistrationView.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("this is do post method call...!!!");

		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String loginid = req.getParameter("loginid");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(loginid);
		System.out.println(password);
		System.out.println(dob);
		System.out.println(address);

		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstname(firstname);
		bean.setLastname(lastname);
		bean.setLoginid(loginid);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		bean.setAddress(address);

		UserModel model = new UserModel();

		try {
			model.addPk(bean);

		} catch (Exception e) {
			e.printStackTrace();

		}

		resp.sendRedirect("UserRegistrationView.jsp");

	}

}
