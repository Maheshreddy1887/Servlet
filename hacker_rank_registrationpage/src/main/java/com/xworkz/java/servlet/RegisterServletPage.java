package com.xworkz.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServletPage extends HttpServlet {
	
	public RegisterServletPage() {
		System.out.println("created Register Servlet");
	}
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
    	System.out.println("send the data only from button click");
    	
    	response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
    	
	    writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Register Success!!!!!!!!!");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
    }
    
    
   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("invoked service in Register Servlet");
		
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
	
		System.out.println(fname.concat("").concat(lname).concat(""));
		System.out.println(email.concat("").concat(phone).concat("").concat(password));
		
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
			
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Register Success!!!!!!!!!");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		}
	
	
}