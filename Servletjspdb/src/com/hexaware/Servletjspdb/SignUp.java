package com.hexaware.Servletjspdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SaveDataInDB
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			conn = DBConnect.getDBConnect();
			try {
				PrintWriter pw = resp.getWriter();
				resp.setContentType("text/html");
				if(conn==null) {
					pw.println("no connection established..");
				}
				pstmt= conn.prepareStatement("insert into signup values(?,?)");
				
				
				String username = req.getParameter("username");
				String password = req.getParameter("password");
			
				
				pstmt.setString(1, username);
				pstmt.setString(2, password);
				
				int i = pstmt.executeUpdate();
				if(i!=0) {
					pw.println("registered successfully....");
				}else {
					pw.println("signup unsuccessfull due to error...");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

}