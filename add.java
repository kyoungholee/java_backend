package com.newlecture.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Add", urlPatterns = { "/add" })
//어노테이션 
public class add extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html, charset=UTF-8");
		
		String x_ = request.get.Parameter("x");
		String y_ = request.get.Paraneter("y");
		
		
		int x = 0;
		int y = 0;
		
		if(!x_.equals("")) x = Integer.parseInt(x_);
		if(!y_.equals("")) x = Integer.parseInt(y_);
		
		int result = x + y;
		
		
		response.getWriter().printf("result is %d\n", result);
		
	}

}
