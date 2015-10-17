/****************************************************************************************
Name            : DoGetDetails
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to get the employee detail
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeHelper;
import com.model.Employee;

public class DoGetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * doGet method : used to send employee detail to jsp page
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Employee employee = EmployeeHelper.getEmployee(id);
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("jsp/employeeDetails.jsp").forward(
				request, response);

	}

	/**
	 * doPost method : used to call get method
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

}
