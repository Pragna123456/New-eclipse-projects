package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    response.setContentType("text/plain");
    
    PrintWriter writer = response.getWriter();
    writer.println("This is first application....");
    writer.println("adv java class by Mr.RATAN....");
    writer.println("Servelts application very good...");
    writer.println("we r intersted in this topic...");

	}

}
