package com.xworkz.samsung.sevlets;


	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class Bosch extends HttpServlet {

		public Bosch() {
			System.out.println("created Bosch");

		}

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String brand = request.getParameter("brand");
			String color = request.getParameter("color");
			String price = request.getParameter("price");

			System.out.println("brand :" + brand);
			System.out.println("color :" + color);
			System.out.println("price :" + price);

			response.setContentType("text/html");

			PrintWriter printWriter = response.getWriter();
			printWriter.write("<html>");
			printWriter.write("<body>");
			printWriter.write("save is successs");
			printWriter.write("</body>");
			printWriter.write("</html>");

		}

	}



