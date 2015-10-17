/****************************************************************************************
Name            : DoRegister
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to  control register user
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeHelper;
import com.model.Employee;

public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * doGet method : used to create the employee data
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int employId = Integer.parseInt(request.getParameter("employId"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		Employee employee = new Employee(employId, name, email, age,
				dateFormat.format(date));
		EmployeeHelper.addInList(employee, employId);
		request.getRequestDispatcher("/ShowList").forward(request, response);

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
