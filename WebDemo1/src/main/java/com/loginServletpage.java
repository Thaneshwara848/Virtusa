package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServletpage")
public class loginServletpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginServletpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// it will pass the information on URL , it means it will show the username and password 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// it will not passes the information on URL hence its is Secure 
		String username= request.getParameter("username");
		String userpass= request.getParameter("password");
		if(username.equals("Thanesh") && userpass.equals("Thanesh@123")) {
			RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			rd.forward(request, response);
		}
		else {
			PrintWriter out= response.getWriter();
			out.print("<p style='color:red'>Invalid Credentials </p>");
			RequestDispatcher rd = request.getRequestDispatcher("LoginPage.html");
			rd.include(request, response);
		}
	}

}
