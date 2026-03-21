package Aryan.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printing")
public class printingData extends HttpServlet {
    protected void doGet(@org.jetbrains.annotations.NotNull HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<getNameAndRollNo> studs = Arrays.asList(
                new getNameAndRollNo(1, "Aryan"),
                new getNameAndRollNo(2, "Kamboj")
        );

        req.setAttribute("students", studs);
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        String name = "Aryan";
        getNameAndRollNo s = new getNameAndRollNo(1,"Aryan");

        req.setAttribute("student", s);

        RequestDispatcher rd = req.getRequestDispatcher("basic.jsp");
        rd.forward(req, res);
    }
};