/****************************************************************************************
Name            : Validate
Revision Log    : 2015-10-12: Subhash Chander : created.
                : 
                : 
Use             : This class is used to take data from web page
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * validation method : used to validate data name , password 
	 * 
	 * @param int : validation result
	 */
	private int validation(String userName, String psw) {
		int i = 0;
		String nameRagix = "^[a-z0-9_-]{3,15}$";
		String pswRagix = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		Pattern namePattern = Pattern.compile(nameRagix);
		Pattern pswPattern = Pattern.compile(pswRagix);
		Matcher nameMatcher = namePattern.matcher(userName);
		Matcher pswMatcher = pswPattern.matcher(psw);
		if (!nameMatcher.matches()) {
			i = 1;
		} else if (!pswMatcher.matches()) {
			i = 2;
		}
		return i;
	}
	/**
	 * doPost method : used to take date from web page and return the respond 
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("name");
		String psw = request.getParameter("password");
		int result = validation(userName, psw);
		String output = userName + psw;
		if (result == 0) {
			output = "Profile Successfully Created";
		} else if (result == 1) {
			output = "Please enter correct user name";
		} else {
			output = "Please enter correct password (password should have more than 8 letters,contains Capital letter ,special character,number)";
		}
		request.setAttribute("result", output);
		request.getRequestDispatcher("ShowResult").forward(request, response);
	}

}
