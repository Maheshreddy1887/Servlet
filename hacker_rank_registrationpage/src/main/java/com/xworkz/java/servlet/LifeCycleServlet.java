package com.xworkz.java.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet  extends HttpServlet{
	
	public LifeCycleServlet() { // 1
		System.out.println("Executed no-arg const of Life Cycle Servlet");
	}
	
    @Override  //generic servlet
    public void init() throws ServletException { //3
    	System.out.println("invoked init from Life Cycle Servlet with no paramater--generic servlet");
    	super.init();
    }
    
    @Override //servlet method
    public void init(ServletConfig config) throws ServletException { //2
    	System.out.println("invoked init from Life Cycle Servlet with Servlet Config as paramater--servlet method");
    	super.init(config);
    }

     @Override //5
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("invoked service method in Life Cycle Servlet with http");
    	super.service(req, resp);
    }
     
     @Override //4
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	 System.out.println("invoked service method in Life Cycle Servlet without http");
    	super.service(req, res);
    }
     
     @Override //6
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("invoked doGet method in Life Cycle Servlet");
    	super.doGet(req, resp);
    }
     
     @Override //7
    public void destroy() {
    	 System.out.println("invoked destroy method in Life Cycle Servlet");
    	super.destroy();
    }
}

