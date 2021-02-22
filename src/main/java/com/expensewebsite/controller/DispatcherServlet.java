package com.expensewebsite.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class DispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static Logger LOG = LogManager.getLogger(DispatcherServlet.class);
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		RequestHelper.processGet(request, response);
		
		Writer writer = response.getWriter();
		//response.setContentType("text/html");
				response.setContentType("application/json");
				writer.write("<h1> This is a header </h1>");		
		
		
	
	}

}
 