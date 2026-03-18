package Aryan.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/printing")
public class printingData extends HttpServlet {

    protected void doGet(@org.jetbrains.annotations.NotNull HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<getNameAndRollNo> studs = Arrays.asList(
                new getNameAndRollNo(1, "Aryan"),
                new getNameAndRollNo(2, "Kamboj")
        );

        req.setAttribute("students", studs);

        RequestDispatcher rd = req.getRequestDispatcher("basic.jsp");
        rd.forward(req, res);
    }
}