/****************************************************************************************
Name            : DoEdit
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to edit the employee detail
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

public class DoEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * doGet method : used to edit the employee data
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Employee employee=EmployeeHelper.getEmployee(id);
		int employId=Integer.parseInt(request.getParameter("employId"));
		 String name= request.getParameter("name");
		 String email=request.getParameter("email");
		 int age=Integer.parseInt(request.getParameter("age"));
         employee.setAge(age);
         employee.setEmail(email);
         employee.setName(name);
         employee.setEmployeeId(employId);       
		 EmployeeHelper.edit(employee, id);
		 request.getRequestDispatcher("/ShowList").forward(request, response);
	  
	}

	/**
	 * doPost method : used to call get method
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	doGet(request, response);
	}

}
