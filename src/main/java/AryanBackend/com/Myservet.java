package AryanBackend.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import jakarta.security.auth.message.config.ServerAuthContext;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 //    ServerConflig & ServerContext 

public class Myservet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.print("hi<br>");
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Name");
		out.print(str);
	}

}

