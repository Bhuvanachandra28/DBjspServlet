package com.hexaware.servletFirstProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloHost
 */
@WebServlet("/HelloHost")
public class HelloHost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		/*int a = 7;
		int b = 7;
		int c = a+b;
		pw.println(c);*/
		int vOne = Integer.parseInt(req.getParameter("value1"));
		int vTwo = Integer.parseInt(req.getParameter("value2"));
		pw.println("addition" + (vOne + vTwo));
		
		}

}
