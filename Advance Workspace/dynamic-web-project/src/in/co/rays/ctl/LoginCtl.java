package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("operation");

		System.out.println("op in loginctl get>>> " + op);

		if (op != null && op.equals("logout")) {

			System.out.println("in logout if condition");

			HttpSession session = req.getSession();

			session.invalidate();

		}

		resp.sendRedirect("LoginView.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String loginid = req.getParameter("loginid");
		String password = req.getParameter("password");

		String op = req.getParameter("operation");

		String uri = req.getParameter("uri");

		if (op.equals("signIn")) {

			HttpSession session = req.getSession();

			UserModel model = new UserModel();

			try {
				UserBean bean = model.authenticate(loginid, password);

				if (bean != null) {

//					req.setAttribute("user", bean);
					//
//					RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
					//
//					rd.forward(req, resp);

					session.setAttribute("user", bean);

					// resp.sendRedirect("WelcomeCtl");

					if (uri.equalsIgnoreCase("null")) {

						resp.sendRedirect("Welcome.jsp");

					} else {

						resp.sendRedirect(uri);

					}

				} else {

					req.setAttribute("msg", "invalid id and password");

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					rd.forward(req, resp);
//					resp.sendRedirect("LoginView.jsp");

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (op.equals("signUp")) {

			resp.sendRedirect("UserRegistrationCtl");

		}

	}

}
