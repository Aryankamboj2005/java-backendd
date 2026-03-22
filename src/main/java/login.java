

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.mysql.cj.Session;

@WebServlet("/login")
public class login extends HttpServlet {
      
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
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
