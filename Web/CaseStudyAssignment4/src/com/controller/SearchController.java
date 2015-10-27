/****************************************************************************************
Name            : ViewDetailUserController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to show user search detail                 
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewDetailUserController
 */
@WebServlet("/ViewDetailUserController")
public class ViewDetailUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewDetailUserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * doGet method : take the data like car company , car model and redirect it
	 * to cardetails.jsp page
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("make", request.getParameter("make"));
		request.setAttribute("model", request.getParameter("model"));
		getServletContext().getRequestDispatcher("/cardetails.jsp").forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
