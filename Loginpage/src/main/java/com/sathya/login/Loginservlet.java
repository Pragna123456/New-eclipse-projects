package com.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 //get the data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//processing the data
		if(username.equalsIgnoreCase("pragna") &&password.equalsIgnoreCase("pragna12"))
		{
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
		dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("login fail... try with another valid data");
			RequestDispatcher dispatcher =  request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
		/***{
			response.sendRedirect("http://sathyatech.com");
		}
		else
		{
			response.sendError(909,"logon failed...please enter vaild");
		}***/
	}

	}


