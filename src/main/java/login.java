

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

@WebServlet("/login")
public class login extends HttpServlet {
      
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		PrintWriter out = response.getWriter(); // output on the window not on the console;
		out.println("helloworld");
		String name = request.getParameter("name"); // we get the name ;
		String id =request.getParameter("id"); // we get the id and we converted into the interger
		if(name.equals("Aryan")&& id.equals("Aryan2005")){
			HttpSession  session = request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("id",id);
			response.sendRedirect("welcome.jsp");
			
		}
		else{
			response.sendRedirect("signup.jsp");
		}
	}

}
