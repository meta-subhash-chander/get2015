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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.UserHelper;
import com.model.User;

public class DoAddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * doPost method :method is use to provide  control to take data from web page  and show response on page
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);

		String message = "";

		if (UserHelper.addUser(user)) {
			message = "Added Successfully";

		} else {
			message = "error in adding";

		}

		request.setAttribute("message", message);
		request.getRequestDispatcher("jsp/messagepage.jsp").forward(request,
				response);

	}

}
