package org.example.thuchanhjdbc1.controller;

import org.example.thuchanhjdbc1.model.Customer;
import org.example.thuchanhjdbc1.model.service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "customerController", urlPatterns = "/customers")
public class CustomerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action =req.getParameter("action");
    switch (action){
        case "create":
        default:
            showAllCustomer(req, resp);
    }

    }

    private static void showAllCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // don request tu client
        // dieu huong sang file jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("customerlist.jsp");
        // lay du lieu
        CustomerService customerService = new CustomerService();
        List<Customer> c = customerService.findAll();
        req.setAttribute("kh",c);
        // gan du lieu cho view
        dispatcher.forward(req, resp);
    }
}
