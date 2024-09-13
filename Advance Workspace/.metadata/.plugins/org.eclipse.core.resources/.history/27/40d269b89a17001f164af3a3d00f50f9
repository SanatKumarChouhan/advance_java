package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserCtl.do")
public class UserCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		UserModel model = new UserModel();

		if (id != null) {

			try {
				UserBean bean = model.findByPk(Integer.parseInt(id));

				req.setAttribute("bean", bean);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = req.getRequestDispatcher("UserView.jsp");

		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("operation");

		String id = req.getParameter("id");
		
		

		System.out.println("id= " + id);

		String firstname = req.getParameter("firstName");
		String lastname = req.getParameter("lastName");
		String loginid = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstname(firstname);
		bean.setLastname(lastname);
		bean.setLoginid(loginid);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setAddress(address);

		UserModel model = new UserModel();

		if (op.equals("save")) {

			try {
				model.addPk(bean);
				
				req.setAttribute("msg", "User Added Successfully...!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (op.equals("update")) {

			bean.setId(Integer.parseInt(id));

			try {
				model.update2(bean);
				
				req.setAttribute("msg", "User Updated Successfully...!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = req.getRequestDispatcher("UserView.jsp");

		rd.forward(req, resp);

	}

}
