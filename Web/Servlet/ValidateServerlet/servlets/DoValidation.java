/****************************************************************************************
Name            : DoValidation
Revision Log    : 2015-10-12: Subhash Chander : created.
                : 
                : 
Use             : This class is used to validate inputs into form
                :
 ****************************************************************************************/
package com.servlets;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.*;
import javax.servlet.*;

public class DoValidation extends HttpServlet {
	/**
	 * Servlet implementation class DoValidation
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * validation method : used to validate data name , password ,email
	 * 
	 * @param int : validation result
	 */
	private int validation(String name, String password, String email) {
		int i = 0;
		String nameRagix = "^[a-z0-9_-]{3,15}$";
		String pswRagix = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		String emailRagix = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern namePattern = Pattern.compile(nameRagix);
		Pattern pswPattern = Pattern.compile(pswRagix);
		Pattern emailPattern = Pattern.compile(emailRagix);
		Matcher nameMatcher = namePattern.matcher(name);
		Matcher pswMatcher = pswPattern.matcher(password);
		Matcher emailMatcher = emailPattern.matcher(email);
		if (!nameMatcher.matches()) {
			i = 1;
		} else if (!pswMatcher.matches()) {
			i = 2;
		} else if (!emailMatcher.matches()) {
			i = 3;
		}
		return i;
	}
	/**
	 * doPost method : used to take date from web page and return the respond 
	 * 
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse respond)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		PrintWriter out = respond.getWriter();
		int result = validation(name, password, email);
		String error = "";

		if (name == null || name == "")
			error += "name field can't be empty\n";

		if (email == null || email == "")
			error += "email field can't be empty\n";

		if (password == null || password == "")
			error += "password field can't be empty\n";

		if (confirmPassword == null || confirmPassword == "")
			error += "confirmPassword field can't be empty\n";

		if (!(password.equals(confirmPassword))) {
			error += "password and confirmPassword does not matches";
		}

		if (error.equals("")) {
			if (result == 0) {
				out.println("Profile Successfully Created");
			} else if (result == 1) {
				out.println("Please enter correct user name");
			} else if (result == 3) {
				out.println("Please enter validEmail");
			} else {
				out.println("Please enter correct password (password should have more than 8 letters)");
			}

		} else {
			out.println(error);

		}

	}
}
