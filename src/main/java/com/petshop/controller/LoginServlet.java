package com.petshop.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if("admin".equals(username) && "admin".equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("catalogue");
        }
        else{
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }


}
