package com.bankmanagement.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.bankmanagement.dao.customerDao;
import com.bankmanagement.model.customerDetails;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/register")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private customerDao customerobj;

    public void init() {
        customerobj = new customerDao();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String mob_no = request.getParameter("mob_no");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //int account_balance = request.getContentLength();

         customerDetails objcustomer = new customerDetails();
         objcustomer.setName(name);
         objcustomer.setMob_no(mob_no);
         objcustomer.setEmail(email);
         objcustomer.setPassword(password);
        // objcustomer.setAccount_balance(account_balance);

        try {
            customerobj.registerEmployee(objcustomer);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("afterregistration.jsp");
    }
	}


