package com.expensewebsite.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//response.getWriter().write("Hello, World");
		
		response.setContentType("application/json");
		response.getWriter().write("<h1> This is header 1 </h1>");
	}

}
