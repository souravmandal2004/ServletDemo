package com.mandal;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.IOException;

public class SquareServlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int sum = (int) req.getAttribute("sum");
		
		sum = sum * sum;
		
		PrintWriter out = res.getWriter ();
		out.println ("The square of the numbers is: " + sum);
		
	}
}
