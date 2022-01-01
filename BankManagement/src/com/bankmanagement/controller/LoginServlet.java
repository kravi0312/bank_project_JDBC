package com.bankmanagement.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankmanagement.dao.loginDao;
import com.bankmanagement.model.LoginModel;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private loginDao loginobj;

	public void init() {
		loginobj = new loginDao();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		LoginModel loginModelobj = new LoginModel();
		loginModelobj.setEmail(email);
		loginModelobj.setPassword(password);

		try {
			if (loginobj.validate(loginModelobj)) {
				response.sendRedirect("afterlogin.jsp");
			} else {
				HttpSession session = request.getSession();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	}

