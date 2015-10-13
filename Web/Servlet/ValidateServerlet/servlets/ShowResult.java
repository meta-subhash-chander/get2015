/****************************************************************************************
Name            : ShowResult
Revision Log    : 2015-10-12: Subhash Chander : created.
                : 
                : 
Use             : This class is used to send data to web page
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowResult")
public class ShowResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * doPost method : used to send respond of  web page
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("In Second Servlet = " + request.getAttribute("result"));
	}

}
