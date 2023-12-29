package com.sathya.fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FullName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		
		//get the client requested data from browser
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		//processing of the data
		 String fullname;
		 fullname = firstname+lastname;
		 
		 //response send to the browser
		 response.setContentType("text/plain");
		 PrintWriter writer = response.getWriter();
		 writer.println("your Full Name is ...."+fullname);

	}

	
	}


