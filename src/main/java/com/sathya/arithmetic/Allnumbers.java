package com.sathya.arithmetic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Allnumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int f1= Integer.parseInt(request.getParameter("start"));
	int f2= Integer.parseInt(request.getParameter("end"));
	String op=request.getParameter("test");
	
	PrintWriter writer=response.getWriter();
	response.setContentType("text/html");
	RequestDispatcher dispatcher = request.getRequestDispatcher("arithmetic.html");
	dispatcher.include(request, response);
	
	 if("ADD".equalsIgnoreCase(op))
	{
		int add =f1+f2;
		writer.println("<h1>"+"Addition of two numbers is---"+add+"</h1>");
	}
	else if("SUB".equalsIgnoreCase(op))
	{
		int sub =f1-f2;
		writer.println("<h1>"+"Substraction of two numbers is---"+sub+"</h1>");
		
	}
	else if("MUL".equalsIgnoreCase(op))
	{
		int mul =f1*f2;
		writer.println("<h1>"+"multiplication of two numbers is---"+mul+"</h1>");
	}
	else if("DIV".equalsIgnoreCase(op))
	{
		int div =f1/f2;
		writer.println("<h1>"+"Division of two numbers is---"+div+"</h1>");
	}
	else if("MOD".equalsIgnoreCase(op))
	{
		int mod =f1%f2;
		writer.println("<h1>"+"Modivision of two numbers is---"+mod+"</h1>");
	}
}	
	}

	
	


