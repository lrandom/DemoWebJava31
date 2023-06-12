package com.example.demojavaweb31;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "GetSessionServlet", value = "")
public class GetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* User user = (User) req.getSession().getAttribute("name");
        resp.getWriter().println("User id: " + user.getId());
        resp.getWriter().println("User name: " + user.getName());
        resp.getWriter().println("User age: " + user.getAge());*/
    }
}
