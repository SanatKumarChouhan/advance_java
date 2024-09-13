package in.co.rays.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/track")
public class SessionTracking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		HttpSession session = req.getSession();
//
//		System.out.println("session generate....." + session.getId());
//		
		String jsessionid = req.getParameter("jsessionid");

		System.out.println("First methoddoget jsession id>>>>>>" + jsessionid);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String jsessionid = req.getParameter("jsessionid");
//
//		System.out.println(" Second dopost jsession id>>>>>>>" + jsessionid);

	}

}
