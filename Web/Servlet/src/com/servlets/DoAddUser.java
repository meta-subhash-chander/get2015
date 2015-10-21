/****************************************************************************************
Name            : DoAddUser
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used control register user 
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.UserHelper;
import com.model.User;

public class DoAddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * validation method : used to validate data name , password ,email
	 * 
	 * @param int : validation result
	 */
	String message = null;

	private String validation(String username, String email, String password,
			String confirmPassword) {

		String nameRagix = "^[a-z0-9_-]{3,15}$";
		String pswRagix = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		String emailRagix = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern namePattern = Pattern.compile(nameRagix);
		Pattern pswPattern = Pattern.compile(pswRagix);
		Pattern emailPattern = Pattern.compile(emailRagix);
		Matcher nameMatcher = namePattern.matcher(username);
		Matcher pswMatcher = pswPattern.matcher(password);
		Matcher emailMatcher = emailPattern.matcher(email);
		if (!nameMatcher.matches()) {
			message = "Enter valid name";
		} else if (!emailMatcher.matches()) {
			message = "Enter valid email";
		} else if (!pswMatcher.matches()) {
			message = "Enter valid password";
		} else if (!(password.equals(confirmPassword))) {
			message = "password and confirmPassword are not meching";
		}
		return message;
	}

	/**
	 * doPost method :method is use to provide control to take data from web
	 * page and show response on page
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);

		String message = validation(username, email, password, confirmPassword);
		if (message == null) {
			if (UserHelper.addUser(user)) {
				message = "Added Successfully";

			} else {
				message = "error in adding";

			}
		}
		request.setAttribute("message", message);
		request.getRequestDispatcher("jsp/messagepage.jsp").forward(request,
				response);
	}

}
