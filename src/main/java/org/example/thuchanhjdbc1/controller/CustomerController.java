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
            showFormCreate(req, resp);
            break;

        default:
            showALlCustomer(req, resp);
    }

    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showALlCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // don request tu client
        // dieu huong sang file jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("customerlist.jsp");
        // lay du lieu
        CustomerService customerService = new CustomerService();
        List<Customer> c = customerService.findAll();
        // gan du lieu cho view
        req.setAttribute("kh",c);

        dispatcher.forward(req, resp);
    }
}
