package com.xworkz.gym.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class GymServelt extends HttpServlet {

	public GymServelt() {
		System.out.println("GymServlet created");

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("invoked service in gymservlet ");
		String gymName = request.getParameter("gymName");
		System.out.println("Gym Name".concat(gymName));
		String loc = request.getParameter("location");
		System.out.println("location:" + loc);
		String fees = request.getParameter("fees");
		System.out.println("Fees".concat(fees));
		String review = request.getParameter("review");
		System.out.println("review".concat(review));
		String contact = request.getParameter("contact");
		System.out.println("contact".concat(contact));

		System.out.println("starting to write responce");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style='color:red'>");
		out.print("<Details saved for".concat(gymName));
		out.print("</br>");
		out.print("fees".concat(fees));
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

	}
}