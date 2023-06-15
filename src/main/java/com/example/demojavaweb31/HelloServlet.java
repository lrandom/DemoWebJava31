package com.example.demojavaweb31;

import java.io.*;
import java.util.ArrayList;

import com.example.demojavaweb31.dals.DalProduct;
import com.example.demojavaweb31.models.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/product-list")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        DalProduct dalProduct = new DalProduct();
        ArrayList<Product> products = dalProduct.getList();
        request.setAttribute("products", products);
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }


}
