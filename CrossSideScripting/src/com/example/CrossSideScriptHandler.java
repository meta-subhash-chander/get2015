package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
 
@WebServlet("/CrossSideScriptHandler")
public class CrossSideScriptHandler extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("input");
		String result = StringEscapeUtils.escapeHtml(input);
		HttpSession session = request.getSession();
		session.setAttribute("output", result);
		response.sendRedirect("index.jsp");
	}

 
}
