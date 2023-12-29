 package com.sathya.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Productinvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the request
	int proId=	Integer.parseInt(request.getParameter("proId"));
	String proName = request.getParameter("proName");
	double proPrice = Double.parseDouble(request.getParameter("proPrice"));
	int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
	
	//process the data
	
	double totalbill;
	double discount=0.0;
	totalbill=proPrice *proQuantity;
	String discountmsg="no discount";
	
	 if (totalbill>1000 && totalbill<5000 ) 
	 {
		discount=totalbill*0.05;
		discountmsg="5% discount";
	 }	
	 else if (totalbill>5000 && totalbill<10000 ) {
			discount=totalbill*0.1;
			discountmsg="10% discount";
	 } 
			
	 else if (totalbill>10000 && totalbill<15000 ) {
					discount=totalbill*0.15;
					discountmsg="15% discount";
					 
	 }
	 else {
		 System.out.println("no discount availble");
	 }
	
	double netbill;
	netbill=totalbill-discount;
	
	//response to browser
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	
	
	writer.println("<html><body bg color='aqua'>");
	writer.println("<h2>@@@PRODUCT INVOICE@@@</h2>");
	writer.println("<p> your product id.."+proId+"</p>");
	writer.println("<p> your product name.."+proName+"</p>");
	writer.println("<p> your product price.."+proPrice+"</p>");
	writer.println("<p> total bill is.."+proQuantity+"products: $"+totalbill+"</p>");
	writer.println(discountmsg+"amount..."+discount);
	writer.println("<p> netbill to pay:$"+netbill+"</p>");
	writer.println("</body></html>");

		
	}

}
