package com.register.online.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public loginservlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		String username=   request.getParameter("username");
		String place=request.getParameter("place");
		String mobile=request.getParameter("mobile");
	}

}
