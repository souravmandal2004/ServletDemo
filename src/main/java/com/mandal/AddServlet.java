package com.mandal;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
	
		public void service (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{		// always the method name is going to be service
			
			int num1 = Integer.parseInt (req.getParameter("num1"));
			int num2 = Integer.parseInt(req.getParameter("num2"));
			
			int sum = num1 + num2;
			
			req.setAttribute("sum", sum);
			
			
			// To call another Servlet basically we have 2 options: 
			// 1.Req dispatcher
			// 2. Redirect
			
			// Using Req Dispatcher
			RequestDispatcher rd = req.getRequestDispatcher("/square");
			rd.forward(req, res);
			
			// When we want to send to one servlet to another we have to go with Session Managerment and another method is:
			
		}

}
