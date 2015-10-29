/****************************************************************************************
Name            : LoginController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to control login admin                 
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.VehicleDekhoService;
import com.Exceptions.VehicleDekhoSystemException;

 
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
         
    }

	/**
	 * dispatch request to login.jsp
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * this method validate login credentials
	 * check email and passwords from database and if correct than dispatch it  to AdminHomeController
	 * if if they are incorrect than dispatch to login.jsp
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		VehicleDekhoService service = new VehicleDekhoService();
		boolean isAdmin;
		try {
			isAdmin = service.isAdmin(email, password);
			RequestDispatcher loginunsuccessful = request.getRequestDispatcher("login.jsp");
			RequestDispatcher loginsuccessful = request.getRequestDispatcher("AdminHome.jsp");
			if( isAdmin == true ) {
					HttpSession session = request.getSession();
		            session.setAttribute("email", email);
		            Map<String, String> profile = service.getProfile();
		            request.setAttribute("profile", profile);
					loginsuccessful.forward(request, response);
			}
			else {
				request.setAttribute("message", "Either ID or Password is wrong..");
	            loginunsuccessful.forward(request, response);
			}
		} catch (VehicleDekhoSystemException e) {
			System.out.println("\n Could not validate user due to : "+e.getMessage());
		}
		
	}

}
