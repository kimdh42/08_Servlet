package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first/filter")
public class FirstFilterTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Servlet 요청 확인!");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<!doctype html>");
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h3>Filter Test Servlet 요청 확인 완료!</h3>");
        out.print("</body>");
        out.print("</html>");

        out.flush();
        out.close();
    }
}
