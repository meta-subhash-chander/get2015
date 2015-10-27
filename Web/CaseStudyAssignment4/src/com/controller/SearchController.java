/****************************************************************************************
Name            : SearchController
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : This class is used to Search by user        
 ****************************************************************************************/
package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
   	 * doGet method :  redirect  to search.jsp page 
   	 * 
   	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/search.jsp").forward(request, response);
	}

	 /**
   	 * doPost method :   show user rearch result
   	 * 
   	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("make", request.getParameter("make"));
		getServletContext().getRequestDispatcher("/searchResult.jsp").forward(request, response);
	}

}
