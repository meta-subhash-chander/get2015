/****************************************************************************************
Name            : ShowList
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to  show user list control
                :
 ****************************************************************************************/
package com.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.helper.EmployeeHelper;
import com.model.Employee;

public class ShowList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * doGet method : used to show the employee data
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    Map<Integer, Employee> listOfEmployee=EmployeeHelper.getListOfEmployee();
	    request.setAttribute("listOfEmployee", listOfEmployee);
	    request.getRequestDispatcher("jsp/employeeList.jsp").forward(request, response);
	}

	/**
	 * doPost method : used to call get method
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  doGet(request, response);
	}

}
