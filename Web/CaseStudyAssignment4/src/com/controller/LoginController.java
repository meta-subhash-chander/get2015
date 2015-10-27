/****************************************************************************************
Name            : LoginController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to control login admin                 
 ****************************************************************************************/
package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.helper.VehicleJDBCHelper;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * doGet method : redirect to login.jsp page
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/login.jsp").forward(request,
				response);
	}

	/**
	 * doPost method : creare the session for vaid user
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		boolean isAdmin = VehicleJDBCHelper.loginCheck(request);
		RequestDispatcher loginunsuccessful = request
				.getRequestDispatcher("login.jsp");
		RequestDispatcher loginsuccessful = request
				.getRequestDispatcher("AdminHome.jsp");
		if (isAdmin == true) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			loginsuccessful.forward(request, response);
		} else {
			request.setAttribute("message", "Either ID or Password is wrong..");
			loginunsuccessful.forward(request, response);
		}
	}

}
