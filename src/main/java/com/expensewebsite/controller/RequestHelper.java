package com.expensewebsite.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	
	public static String processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		final String URI = request.getRequestURI();
		System.out.println(URI);
	//	LOG.debug(URI);
		
		final String RESOURCE = URI.replace("/ExpenseWebsite/dispatcher", "");
		System.out.println(RESOURCE);
		
		if(RESOURCE.equals("/hello")) {
			response.getWriter().write("Hi back! I'm a Java App!");
		} else if(RESOURCE.equals("/goodbye")) {
			response.getWriter().write("Sad to see you go, Goodbye!");
		} else {
			response.getWriter().write("That is not a supported operation, pls check your input and try again.");
		}
	
	
	return null;
	}
}
