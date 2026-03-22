import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import login.loginDAO;

@WebServlet("/login")
public class login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    String name = request.getParameter("name");
	    String password = request.getParameter("password");

	    loginDAO dao = new loginDAO();

	    if (dao.check(name, password)) {

	        HttpSession session = request.getSession();
	        session.setAttribute("name", name);

	        response.sendRedirect("welcome.jsp");

	    } else {
	        response.sendRedirect("signup.jsp");
	    }
	}
}