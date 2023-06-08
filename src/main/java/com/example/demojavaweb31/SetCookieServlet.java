package com.example.demojavaweb31;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SetCookie", value = "/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("age", "20");
        cookie.setMaxAge(60 * 60 * 24 * 30);//30 ngày
        resp.addCookie(cookie);
        resp.getWriter().println("Cookie set");
    }
}
