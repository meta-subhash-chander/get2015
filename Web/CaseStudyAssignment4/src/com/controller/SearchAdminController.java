/****************************************************************************************
Name            : SearchAdminController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used admin rearch car page               
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAdminController
 */
@WebServlet("/SearchAdminController")
public class SearchAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchAdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * doGet method : redirect to searchAdmin.jsp page
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/searchAdmin.jsp").forward(
				request, response);
	}

	/**
	 * doPost method : redirect to SearchAdminResult.jsp page according to admin
	 * search
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("make", request.getParameter("make"));
		getServletContext().getRequestDispatcher("/SearchAdminResult.jsp")
				.forward(request, response);
	}

}
