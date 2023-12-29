
package com.sathya;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UpdateProductServlet")
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String proId = request.getParameter("proId");
        String updatedProductName = request.getParameter("proName");
        
        double updatedProductPrice = Double.parseDouble(request.getParameter("proPrice"));
        String updatedProductBand = request.getParameter("proBand");
        
        String updatedProductMade = request.getParameter("proMade");
        Date updatedProductMdate = Date.valueOf(request.getParameter("proMdate"));
        
        Date updatedProductExdate = Date.valueOf(request.getParameter("proExdate"));
        Part newImagePart = request.getPart("proImage");
	    
       
        
         Product product = new Product();
	     product.setProId(proId);
	     product.setProName(updatedProductName);
	     product.setProPrice(updatedProductPrice);
	     product.setProBand(updatedProductBand);
	     product.setProMade(updatedProductMade);
	     product.setProMdate(updatedProductMdate);
	     product.setProExdate(updatedProductExdate);
	     
	     ProductDao dao = new ProductDao();
	
	     // Check the image present or not if presnet set the data 
	     if (newImagePart != null && newImagePart.getSize() > 0) {
	            product.setProImage(newImagePart.getInputStream());
	     }
	  
	     int result = dao.updateProduct(product);
	
	     if(result == 1)
	     {  	request.setAttribute("updateResult", true);
	    	 	RequestDispatcher dispatcher = request.getRequestDispatcher("productlist.jsp");
	        	dispatcher.forward(request, response);
	     }    
	}
}
