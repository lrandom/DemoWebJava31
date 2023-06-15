package com.example.demojavaweb31;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="DeleteCookie",value="/delete-cookie")
public class DeleteCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("age", "");
        //delete cookie by max age
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        resp.getWriter().println("Delete Cookie");
    }
}
