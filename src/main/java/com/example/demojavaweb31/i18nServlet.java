package com.example.demojavaweb31;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DemoJSPServlet", value = "/demo-i18n")
public class i18nServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lang = req.getParameter("lang");
        req.setAttribute("lang",lang);
        req.getRequestDispatcher("/WEB-INF/i18n.jsp").forward(req, resp);
    }
}

