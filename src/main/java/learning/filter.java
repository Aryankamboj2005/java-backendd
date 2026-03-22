package learning;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/filter")
public class filter  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) 
	        throws IOException, ServletException {
		PrintWriter out = res.getWriter(); // output on the window not on the console;
		out.println("helloworld");
		String name = req.getParameter("name"); // we get the name ;
		int id =Integer.parseInt(req.getParameter("id")); // we get the id and we converted into the interger
		out.println("helloworld   " +name +" "+ id); // printing   
		
	}
         
	             
	
}
