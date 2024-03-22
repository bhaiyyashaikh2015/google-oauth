package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");

		if (user.equals("bhaiyya") && pass.equals("bhaiyya"))
			pw.println("Login Success...!");
		else
			pw.println("Login Failed...!");
		pw.close();
	}
}