package com.example.demojavaweb31;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SetSessionServlet", value = "/set-session")
public class SetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        User user = new User();
        user.setId("001");
        user.setName("Luan");
        user.setAge(18);
        httpSession.setAttribute("name", user);
        resp.getWriter().println("Session set up");
    }
}

