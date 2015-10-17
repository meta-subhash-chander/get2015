/****************************************************************************************
Name            : DoPrepareForm
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to  PrepareForm of employee
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

public class DoPrepareForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * doGet method : used to create the employee data
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		if (id != -1) {
			Employee employee = EmployeeHelper.getEmployee(id);
			request.setAttribute("employee", employee);
			request.setAttribute("id", id);

		}

		request.getRequestDispatcher("jsp/formPage.jsp").forward(request,
				response);

	}

	/**
	 * doPost method : used to call get method
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);

	}

}
