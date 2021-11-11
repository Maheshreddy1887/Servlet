package com.xworkz.hospital.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hospital extends HttpServlet {

	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("invoked service in  Hospital ");
		String HospitalName = request.getParameter(" HospitalName");
		System.out.println(" Hospital Name".concat(HospitalName));
		String founder = request.getParameter("founder");
		System.out.println("founder:" + founder);
		String estDate = request.getParameter("estDate");
		System.out.println("estDate".concat(estDate));
		String specilization = request.getParameter("specilization");
		System.out.println("specilization".concat(specilization));
		String chifDoctor = request.getParameter("chifDoctor");
		System.out.println("chifDoctor".concat(chifDoctor));
		String noofNurse = request.getParameter("noofNurse");
		System.out.println("noofNurse".concat(noofNurse));
		String noofBeds = request.getParameter("noofBeds ");
		System.out.println("noofBeds ".concat(noofBeds));

		System.out.println("starting to write responce");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style='color:red'>");
		out.print("<Details saved for".concat(HospitalName));
		out.print("</br>");
		out.print("founder".concat(founder));
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
