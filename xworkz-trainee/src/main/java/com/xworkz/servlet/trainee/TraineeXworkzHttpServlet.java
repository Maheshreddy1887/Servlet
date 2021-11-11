package com.xworkz.servlet.trainee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraineeXworkzHttpServlet extends HttpServlet {

	public TraineeXworkzHttpServlet() {

		System.out.println("Invoked no-args constructor from " + (this.getClass().getSimpleName()));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// protected void doPost(HttpServletRequest req, HttpServletResponse res) throws
		// ServletException, IOException {

		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String yop = req.getParameter("yop");
		String education = req.getParameter("education");
		TraineeXworkz trainee = new TraineeXworkz(name, type, yop, education);
		TraineeXworkzDAO dao = new TraineeXworkzDAO();
		String result = dao.insert(trainee);

		res.getWriter().print(result);
		
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		HttpServletResponse response = null;
		response.sendRedirect("http://www.google.com");  
		  
		pw.close();  
		}  
	}


